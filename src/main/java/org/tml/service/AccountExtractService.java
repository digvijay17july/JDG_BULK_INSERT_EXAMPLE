package org.tml.service;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;
import org.tml.esb.AccountExtractResponse;

/**
 * @author Digvijay Singh
 */
@Component
public interface AccountExtractService {
	 List<AccountExtractResponse> findByStartDateAndEndDate(String startDate, String endDate);
	 List<Map> getAccountExtractListAsListOfMap(List<AccountExtractResponse> accountExtractResponseList);
}
