/**
 *
 */
package org.tml.service;

import org.tml.config.SearchParameters;
import org.tml.esb.AccountExtractResponse;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author Digvijay Singh
 */
public interface JdgService {

    /*
     * Override this method to put single entry in JDG Cache
     */
    boolean put(List<AccountExtractResponse> accountExtractResponseList) throws Exception;

    /*
     * Update or add value to index map
     */
    boolean update() throws Exception;

    /*
     * Put all data of time period
     */
    boolean putAll(LocalDate startDate, LocalDate endDate) throws Exception;

    /*
     * Get Account extract Data on search params
     */
    Set<AccountExtractResponse> search(Map<SearchParameters, String> searchParameters) throws Exception;

    /*
     * Get All Account extract Data
     */
    List<AccountExtractResponse> getAll() throws Exception;

    /*
     * Update or add value to index map
     */
    boolean delete(Date startDate,Date endDate) throws Exception;

    /*
     * Get All Account extract Data on search params
     */
    List<AccountExtractResponse> getAllWithPaging(int pageNumber, boolean isIndexed) throws Exception;

    /*
    Get total Pages
     */
    List<Integer> getPageNumbers();
}
