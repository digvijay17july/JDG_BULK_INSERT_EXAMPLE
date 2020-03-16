package org.tml.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.tml.esb.AccountExtractResponse;
import org.tml.jdgrepo.JdgCustomRepository;

import java.util.List;
import java.util.Map;

/**
 * @author Digvijay Singh
 */
@Service
public class AccountExtractServiceImpl implements AccountExtractService {


    private static Logger logger = LoggerFactory.getLogger(AccountExtractServiceImpl.class);
    private JdgCustomRepository jdgCustomRepository;
    private ObjectMapper objectMapper;

    public AccountExtractServiceImpl(JdgCustomRepository jdgCustomRepository) {
        this.jdgCustomRepository = jdgCustomRepository;
        this.objectMapper = new ObjectMapper();
    }

    @Override
    public List<AccountExtractResponse> findByStartDateAndEndDate(String startDate, String endDate) {
        logger.info("Entering Method  AccountExtractServiceImpl.findByStartDateAndEndDate");
        List accountExtractList = jdgCustomRepository.findAll(startDate, endDate);
        logger.info("Exiting Method  AccountExtractServiceImpl.findByStartDateAndEndDate");
        return accountExtractList;
    }

    @Override
    public List<Map> getAccountExtractListAsListOfMap(List<AccountExtractResponse> accountExtractResponseList) {
        List<Map> accountExtractMapList = this.objectMapper.convertValue(accountExtractResponseList, new TypeReference<List<Map>>() {
        });

        return accountExtractMapList;
    }

}
