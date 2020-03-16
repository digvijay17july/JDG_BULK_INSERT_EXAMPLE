package org.tml.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tml.esb.AccountExtractResponse;
import org.tml.service.AccountExtractService;
import org.tml.service.JdgService;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.Callable;


/**
 * @author Digvijay Singh
 */
public class CustomJDGThread implements Callable<Boolean> {

    private static Logger logger = LoggerFactory.getLogger(CustomJDGThread.class);
    private LocalDate startDate;
    private LocalDate endDate;

    private JdgService jdgServiceImpl;
    private AccountExtractService jdgConnectionServiceImpl;

    private List<AccountExtractResponse> accountExtractResponseList;

    public CustomJDGThread(LocalDate startDate, LocalDate endDate, JdgService jdgServiceImpl, AccountExtractService jdgConnectionServiceImpl) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.jdgServiceImpl = jdgServiceImpl;
        this.jdgConnectionServiceImpl = jdgConnectionServiceImpl;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public Boolean call() throws Exception {
        logger.info("Entering Method  CustomJDGThread.call");
        accountExtractResponseList= this.jdgConnectionServiceImpl.findByStartDateAndEndDate(this.startDate.toString(), this.endDate.toString());
        logger.info("Entering Method  CustomJDGThread.call");
        return this.jdgServiceImpl.put(accountExtractResponseList);
    }

}
