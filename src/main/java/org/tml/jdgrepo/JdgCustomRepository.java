package org.tml.jdgrepo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.tml.config.JdgProperties;
import org.tml.esb.AccountExtractResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Digvijay Singh
 */
@Repository
public class JdgCustomRepository {


    private static Logger logger = LoggerFactory.getLogger(JdgCustomRepository.class);
    @Autowired
    private JdgProperties jdgProperties;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<AccountExtractResponse> findAll(String startDate, String endDate) {
        logger.info("Entering Method  JdgCustomRepository.findAll");
        String query = jdgProperties.getSelectAccountData();
        query = query.replace("%?1", startDate).replace("%?2", endDate);
        //List result = jdbcTemplate.query(query, new BeanPropertyRowMapper(AccountExtractResponse.class));
        List result = getAccountExtractResponse();
        logger.info("Exiting Method JdgCustomRepository.findAll");
        return result;

    }

    private List getAccountExtractResponse() {
        List<AccountExtractResponse> list = new ArrayList<>();
        AccountExtractResponse accountExtractResponse = null;
        for (int i = 0; i < 20; i++) {
            accountExtractResponse = new AccountExtractResponse();
            accountExtractResponse.setRowId("DJ" + i);
            System.out.println(accountExtractResponse);
            list.add(accountExtractResponse);
        }

        return list;
    }
}
