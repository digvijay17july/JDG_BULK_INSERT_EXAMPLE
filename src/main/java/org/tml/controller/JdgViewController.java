package org.tml.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.tml.config.SearchParameters;
import org.tml.esb.AccountExtractResponse;
import org.tml.service.AccountExtractService;
import org.tml.service.JdgService;

import java.util.HashSet;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path = "/api/v1/dataExtractor")
public class JdgViewController {

    private static Logger logger = LoggerFactory.getLogger(JdgAccountExtractController.class);

    @Autowired
    private JdgService jdgServiceImpl;

    @Autowired
    private AccountExtractService accountExtractServiceImpl;

    @RequestMapping("/extractAll")
    @ResponseBody
    public ModelAndView getAllJdgData() throws Exception {
        logger.info("Entering Method  JdgViewController.getAllJdgData");
        ModelAndView modelAndView = new ModelAndView();
        List<AccountExtractResponse> accountExtractList = null;
        List<Map> accountExtractListOfMap = null;
        try {
            accountExtractList = jdgServiceImpl.getAllWithPaging(0, false);
            accountExtractListOfMap = accountExtractServiceImpl.getAccountExtractListAsListOfMap(accountExtractList);
        } catch (Exception ex) {
            logger.error("Exception Occurred ex  {} ", ex);
            throw new Exception("Exception occurred while processing : ", ex);
        }
        modelAndView.addObject("accountExtractListOfMap", accountExtractListOfMap);
        modelAndView.addObject("headerFields", accountExtractListOfMap.get(1).keySet());
        modelAndView.setViewName("getAllJdgData");
        logger.info("Exiting Method  JdgViewController.getAllJdgData");
        return modelAndView;
    }

    @RequestMapping("/welcome")
    @ResponseBody
    public String welcome() {
        return "welcome";
    }

    @RequestMapping("/extract")
    @ResponseBody
    public ModelAndView getJdgDataWithPagination(@RequestParam("pageNumber") Integer pageNumber) throws Exception {
        logger.info("Entering Method  JdgViewController.getDataWithPagination");
        ModelAndView modelAndView = new ModelAndView();
        List<AccountExtractResponse> accountExtractList = null;
        List<Map> accountExtractListOfMap = null;
        List<Integer> pageNumbers;
        try {
            accountExtractList = jdgServiceImpl.getAllWithPaging(pageNumber, true);
            accountExtractListOfMap = accountExtractServiceImpl.getAccountExtractListAsListOfMap(accountExtractList);
            pageNumbers = jdgServiceImpl.getPageNumbers();
        } catch (Exception ex) {
            logger.error("Exception Occurred ex  {} ", ex);
            throw new Exception("Exception occurred while processing : ", ex);
        }
        accountExtractListOfMap.remove(null);
        modelAndView.addObject("accountListOfMap", new HashSet<>(accountExtractListOfMap));
        modelAndView.addObject("headerFields", SearchParameters.values());
        modelAndView.addObject("pageNumbers", pageNumbers);
        modelAndView.setViewName("getJdgDataWithPagination");
        logger.info("Exiting Method  JdgViewController.getJdgDataWithPagination");
        return modelAndView;
    }

}
