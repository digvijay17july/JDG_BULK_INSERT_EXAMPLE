package org.tml.config;

/**
 * @author Digvijay Singh
 */
public enum SearchParameters {

    DIVISIONCODE("divisionCode"), INVOICE_TYPE("invoiceType"), INVOICE_NO("invoiceNo"), SALESORDER("salesOrder"), STATUS(
            "status"), CHASIS_NO("chassisNo"), INVOICE_DATE("invoiceDate"), INVOICE_END_DATE(
            "invoiceEndDate"), INVOICE_MONTH("invoiceMonth"), INVOICE_YEAR("invoiceYear");

    String value;

    public String getValue() {
        return value;
    }

    SearchParameters(String value) {
        this.value = value;
    }

}
