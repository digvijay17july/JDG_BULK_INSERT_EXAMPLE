package org.tml.service;

import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.infinispan.client.hotrod.RemoteCache;
import org.infinispan.client.hotrod.Search;
import org.infinispan.query.dsl.Query;
import org.infinispan.query.dsl.QueryFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.tml.config.JdgConnection;
import org.tml.config.JdgConstants;
import org.tml.config.JdgProperties;
import org.tml.config.SearchParameters;
import org.tml.esb.AccountExtractResponse;
import org.tml.util.CustomJDGThread;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Digvijay Singh
 */
@Service
public class JdgServiceImpl implements JdgService {

    private static Logger logger = LoggerFactory.getLogger(JdgServiceImpl.class);
    private RemoteCache<Integer, Object> cache;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
    private ObjectMapper mapper = new ObjectMapper();
    private Integer cacheObjectCounter = 0;
    private int pageLimit = 15;
    private AccountExtractService jdgConnectionServiceImpl;

    private JdgConnection jdgConnection;
    private JdgProperties jdgProperties;

    public JdgServiceImpl(AccountExtractService jdgConnectionServiceImpl, JdgProperties jdgProperties, JdgConnection jdgConnection) {
        logger.info("Creating Bean of class JdgConnectionManagerImpl");
        this.jdgProperties = jdgProperties;
        this.jdgConnectionServiceImpl = jdgConnectionServiceImpl;
        this.jdgConnection = jdgConnection;
        try {
            this.cache = jdgConnection.getCache(JdgConstants.CACHE_NAME);
            this.mapper.setDateFormat(sdf);
            this.mapper.configure(Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
            this.mapper.configure(Feature.ALLOW_NUMERIC_LEADING_ZEROS, true);
        } catch (Exception e) {
            logger.error(
                    "Exception occurred while creating bean of class JdgConnectionManagerImpl with cache name {} and exception {}",
                    JdgConstants.CACHE_NAME, e.toString());
        }
        logger.info("Exiting Constructor of class JdgConnectionManagerImpl");
    }

    @Override
    public boolean put(List<AccountExtractResponse> accountExtractResponseList) {
        logger.info("Entering Method  JdgConnectionManagerImpl.put");

        if (accountExtractResponseList != null && accountExtractResponseList.size() != 0) {
            logger.info("Entering for getting cache to put data :");
            try {
                getUpdatedIndexValueFromCache();

                for (AccountExtractResponse accountExtractResponse : accountExtractResponseList) {
                    this.cacheObjectCounter += 1;
                    this.cache.put(this.cacheObjectCounter, accountExtractResponse);
                }

            } catch (Exception e) {
                logger.error("Exception occurred while putting data in cache {}", e.toString());
                return false;
            }
        }
        logger.info("Exiting Method JdgConnectionManagerImpl.put");
        return true;
    }

    @Override
    public boolean update() throws Exception {
        logger.info("Entering Method  JdgConnectionManagerImpl.update");
        QueryFactory qf = Search.getQueryFactory(this.cache);
        Query query = qf.from(AccountExtractResponse.class).having("statusCd").eq("cancelled").build();
        List<AccountExtractResponse> matches = query.list();
        for (AccountExtractResponse accountExtractResponse : matches) {
            if (this.cache.containsValue(accountExtractResponse)) {
                this.cache.remove(accountExtractResponse);
            }
        }

        logger.info("Exiting Method JdgConnectionManagerImpl.update");
        return true;
    }

    @Override
    public boolean putAll(LocalDate startDate, LocalDate endDate) throws Exception {
        logger.info("Entering Method  JdgConnectionManagerImpl.putAll");
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Set<Callable<Boolean>> callables = new HashSet<>();
        LocalDate tmpDate = null;
        for (int i = 0; i < jdgProperties.getTotalValue(); i++) {
            tmpDate = startDate.plusDays(jdgProperties.getTotalDays());
            if (tmpDate.isBefore(endDate)) {
                logger.info("Current start data to fetch data : " + startDate);
                callables.add(new CustomJDGThread(startDate, tmpDate, this, this.jdgConnectionServiceImpl));
            }
        }
        executorService.invokeAll(callables);
        logger.info("Exiting Method JdgConnectionManagerImpl.putAll");
        return false;
    }

    @Override
    public Set<AccountExtractResponse> search(Map<SearchParameters, String> searchParameters) throws Exception {
        logger.info("Entering Method  JdgConnectionManagerImpl.search");
        QueryFactory qf = Search.getQueryFactory(this.cache);
        Query query = null;
        List<AccountExtractResponse> tmpList = null;
        Set<AccountExtractResponse> matches = new HashSet<>();
        SearchParameters searchParametersKey = null;
        String searchParameterValue = null;
        for (Map.Entry<SearchParameters, String> searchParameterEntrySet : searchParameters.entrySet()) {
            searchParametersKey = searchParameterEntrySet.getKey();
            searchParameterValue = searchParameterEntrySet.getValue();
            query = qf.from(AccountExtractResponse.class).having(searchParametersKey.getValue()).eq(searchParameterValue).build();
            tmpList = query.list();
            matches.addAll(tmpList);
        }


        logger.info("Exiting Method JdgConnectionManagerImpl.search");
        return matches;
    }

    @Override
    public List<AccountExtractResponse> getAll() {
        logger.info("Entering Method  JdgConnectionManagerImpl.getAll");

        QueryFactory qf = Search.getQueryFactory(this.cache);
        Query query = qf.from(AccountExtractResponse.class).build();
        List matches = query.list();

        logger.info("Exiting Method JdgConnectionManagerImpl.getAll");
        return matches;
    }

    @Override
    public boolean delete(Date startDate, Date endDate) throws Exception {
        logger.info("Entering Method  JdgConnectionManagerImpl.delete");
        QueryFactory qf = Search.getQueryFactory(this.cache);
        Query query = qf.from(AccountExtractResponse.class).having("statusCd").eq("cancelled").build();
        List matches = query.list();
        logger.info("Exiting Method JdgConnectionManagerImpl.delete");
        return true;
    }

    @Override
    public List<AccountExtractResponse> getAllWithPaging(int pageNumber, boolean isIndexed) throws Exception {
        logger.info("Entering Method  JdgConnectionManagerImpl.getAllAsMapWithPaging");
        List matches = null;

        if (isIndexed) {
            matches = new ArrayList<AccountExtractResponse>();
            for (int i = (pageNumber - 1) * pageLimit; i < pageNumber * 15; i++) {
                matches.add(this.cache.get(i));
            }

        } else {
            matches = getAll();
        }
        logger.info("Exiting Method JdgConnectionManagerImpl.getAllAsMapWithPaging");
        return matches;
    }

    @Override
    public List<Integer> getPageNumbers() {
        logger.info("Entering Method  JdgConnectionManagerImpl.getPageNumbers");
        QueryFactory qf = Search.getQueryFactory(this.cache);
        Query query = qf.from(AccountExtractResponse.class).build();
        int size = query.getResultSize();
        List pageList = new ArrayList();
        for (int i = 0; i < size; i++) {
            pageList.add(new Integer(i + 1));
        }
        logger.info("Entering Method  JdgConnectionManagerImpl.getPageNumbers");
        return pageList;
    }

    private void getUpdatedIndexValueFromCache() {
        logger.info("Entering Method  JdgConnectionManagerImpl.getUpdatedIndexValueFromCache");

        this.cacheObjectCounter = this.cache.size();

        logger.info("Exiting Method JdgConnectionManagerImpl.getUpdatedIndexValueFromCache");
    }

}
