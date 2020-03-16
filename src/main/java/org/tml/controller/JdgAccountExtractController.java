package org.tml.controller;

import groovy.lang.Binding;
import groovy.lang.Closure;
import groovy.lang.GroovyShell;
import groovy.lang.Script;
import groovy.util.ConfigObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.tml.config.SearchParameters;
import org.tml.esb.AccountExtractResponse;
import org.tml.service.ConfigSlurperService;
import org.tml.service.JdgService;

import java.lang.reflect.Method;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Digvijay Singh
 */
@RestController
@RequestMapping(path = "/api/v1/accountExtract")

public class JdgAccountExtractController {

    private static Logger logger = LoggerFactory.getLogger(JdgAccountExtractController.class);
    @Autowired
    JdgService jdgServiceImpl;

    @Autowired
    ConfigSlurperService configSlurperServiceImpl;

    @CrossOrigin
    @PostMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)

    public Set<AccountExtractResponse> search(@RequestBody Map<SearchParameters, String> searchMap) throws Exception {
        logger.info("Entering Method  JdgAccountExtractController.search");
        Set<AccountExtractResponse> searchedList = null;
        try {
            searchedList = jdgServiceImpl.search(searchMap);
        } catch (DateTimeParseException ex) {
            logger.error("Exception occurred with while parsing Dates startDate and endDate");
            throw new Exception("Exception occurred while parsing Dates : ", ex);
        } catch (Exception e) {
            logger.error("Exception occurred with e {}", e);
            throw new Exception("Exception occurred while processing : ", e);
        }
        logger.info("Exiting Method  JdgAccountExtractController.search");
        return searchedList;
    }

    @CrossOrigin
    @PostMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean putAll(@RequestParam("startDate") String startDate, @RequestParam("endDate") String endDate) throws Exception {
        logger.info("Entering Method  JdgAccountExtractController.putAll");
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
            LocalDate startDateObject = LocalDate.parse(startDate, formatter);
            LocalDate endDateObject = LocalDate.parse(endDate, formatter);
            jdgServiceImpl.putAll(startDateObject, endDateObject);

        } catch (DateTimeParseException ex) {
            logger.error("Exception occurred with while parsing Dates startDate {} and endDate {}", startDate, endDate);
            throw new Exception("Exception occurred while parsing Dates : ", ex);
        } catch (Exception e) {
            logger.error("Exception occurred with e {}", e);
            throw new Exception("Exception occurred while processing : ", e);
        }
        logger.info("Exiting Method  JdgAccountExtractController.putAll");
        return true;
    }

    @CrossOrigin
    @GetMapping(path = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AccountExtractResponse> getData() throws Exception {
        logger.info("Entering Method  JdgAccountExtractController.getData");
        List<AccountExtractResponse> accountExtractList = null;
        try {
            accountExtractList = jdgServiceImpl.getAll();
        } catch (Exception e) {
            logger.error("Exception occurred with e {}", e);
            throw new Exception("Exception occurred while processing : ", e);
        }
        logger.info("Exiting Method  JdgAccountExtractController.getData");
        return accountExtractList;
    }

    @CrossOrigin
    @GetMapping(path = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getConfigObjects() throws Exception {
        logger.info("Entering Method  JdgAccountExtractController.getData");
        ConfigObject  configObject=configSlurperServiceImpl.getConfigObjects("src/main/resources/config.groovy");
        Closure closure;

        for(Object set:configObject.keySet())
        {


                System.out.println("print :"+set);

        }
        closure= (Closure) configObject.get("closureWithTwoArgs");
        closure.run();
        logger.info("Exiting Method  JdgAccountExtractController.getData");
        return configObject.toString();
    }
}
