package org.tml.esb;

import org.infinispan.protostream.annotations.ProtoDoc;
import org.infinispan.protostream.annotations.ProtoField;

import java.io.Serializable;


public class AccountExtractResponse implements Serializable {

    private String rowId;

    private String conflictId;

    private String lastUpd;

    private String created;

    private String lastUpdBy;

    private String createdBy;

    private String modificationNum;

    private String rowId1;

    private String activityId;
    private String itemDtlAmt;

    private String assetId;

    private String bonusQty;

    private String partRprId;

    private String extndPrice;

    private String extndTax;

    private String invcLnItemId;

    private String invcTypeCd;

    private String orderId;

    private String lnNum;

    private String orderItemId;

    private String prodId;
    private String vcNo;

    private String qtyReq;
    private String xTcsAmount;

    private String xTmAccessoriesAmt;
    private String acctName;

    private String attrib03;
    private String login;
    private String discountAmt;
    private String acntId;

    private String conFstName;

    private String conLastName;

    private String conMidName;
    private String fullName;

    private String xItemColor;
    private String blPerId;
    private String customerSt;

    private String xEngineNum;

    private String xExtndPrice;

    private String xExtendedQty;

    private String hypothecation;
    private String xInvNoPan;

    private String xOrdItmDscntPercent;

    private String xOrdItmDscntAmt;
    private String xInvPan;

    private String xPartBillType;

    private String xPartStatusCd;

    private String xPartNum;
    private String xPreTaxDscnt;

    private String xDescText;

    private String xProdDescLong;

    private String xRemarks;

    private String xScmDscAmt;
    private String xSerialNum;

    private String uomCd;

    private String xUnitPrice;

    private String xDepreciationPerct;

    private String xTmDiscountAmt;
    private String division;
    private String xXchngbonus;

    private String xTmExtWarAmt;
    private String xFameDmndInc;

    private String attrib01;
    private String xGstin;

    private String grossAmt;
    private String xHsnCode;

    private String xTmInsuranceAmt;

    private String attrib16;

    private String xInsuranceAmount;
    private String xInvCnclldDt;

    private String invcDt;
    private String invcNum;
    private String statusCd;
    private String lob;

    private String xTmNumberplateAmt;
    private String orderDt;

    private String xDisInvtaxAmt;
    private String orderNum;
    private String orderType;

    private String xTmOtherAmt;
    private String model;

    private String xPermRegnNo;
    private String xPlaceOfSupply;

    private String name20;

    private String type;

    private String xTmRegistrationAmt;

    private String attrib22;

    private String attrib21;

    private String qty;
    private String xResidentStat;
    private String xStateCode;
    private String xTcsPrice;
    private String xTaxexemptCategory;

    private String xTmTransformationAmt;
    private String xVas1Price;
    private String xVas2Price;
    private String xVas3Price;

    private String attrib17;

    private String attrib18;

    private String attrib36;

    private String attrib19;

    private String attrib41;

    private String tmshtItmId;

    private String conflictId1;

    private String lastUpd1;

    private String created1;

    private String lastUpdBy1;

    private String createdBy1;

    private String modificationNum1;

    private String rowId2;

    private String name;
    private String taxAmt;
    private String taxRate;
    private String quantity = "1";
    private String godown = "Vehicle Default Location";
    private String salesLedgerName = "SALES LOCAL A/C";
    private String entryTax = "0";
    private String tollTax = "0";
    private String surcharge = "0";
    private String resaleTax = "0";
    private String turnOverTax = "0";
    private String roadCess;
    private String octroi = "0";
    private String lst = "0";
    private String outputVat125 = "0";
    private String outputVat20 = "0";
    private String outputVat15 = "0";
    private String outputVat4 = "0";
    private String vatClassification1 = "Output VAT @ 12.5%";
    private String vatAssessibleAmt1 = "0";
    private String vatClassification2 = "Output VAT @ 20%";
    private String vatAssessibleAmt2 = "0";
    private String vatClassification3 = "Output VAT @ 15%";
    private String vatAssessibleAmt3 = "0";
    private String vatClassification4 = "Output VAT @ 4%";
    private String vatAssessibleAmt4 = "0";
    private String outputVat14 = "0";
    private String outputVat145 = "0";
    private String vatClassification5 = "Output VAT @ 14%";

    private String vatAssessibleAmt5 = "0";

    private String vatClassification6 = "Output VAT @ 14.5%";

    private String vatAssessibleAmt6 = "0";

    private String outputVat135 = "0";

    private String vatClassification7 = "Output VAT @ 13.5%";

    private String vatAssessibleAmt7 = "0";

    private String outputVat13 = "0";

    private String vatAssessibleAmt8 = "0";

    private String vatClassification8 = "Output VAT @ 13%";

    private String outputVat5 = "0";

    private String vatAssessibleAmt9 = "0";

    private String vatClassification9 = "Output VAT @ 5%";

    private String outputVat1375 = "0";

    private String vatAssessibleAmt10 = "0";

    private String vatClassification10 = "Output VAT @ 13.75%";

    private String totalOrderValue;

    private String narration;

    private String outputCGST;

    private String outputSGST;

    private String outputUTGST;

    private String outputGSTCess;

    private String classficationCGST;

    private String classficationSGST;

    private String classficationUTGST;

    private String classficationIGST;

    private String classficationGSTCess;

    private String gstCessAssibleAmount;

    private String outputIGST;

    private String cgstAssessibleAmount;

    private String sgstAssessibleAmount;

    private String utgstAssessibleAmount;

    private String igstAssessibleAmount;

    private String otherTaxAmount;

    private String kfcAccessibleAmount;

    private String kfc;

    @ProtoDoc("@FieldStore=Store.YES, analyze=Analyze.YES")
    @ProtoField(number = 1, required = false)
    public String getRowId() {
        return rowId;
    }


    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    @ProtoField(number = 2, required = false)
    public String getConflictId() {
        return conflictId;
    }

    public void setConflictId(String conflictId) {
        this.conflictId = conflictId;
    }

    @ProtoField(number = 3, required = false)
    public String getLastUpd() {
        return lastUpd;
    }

    public void setLastUpd(String lastUpd) {
        this.lastUpd = lastUpd;
    }

    @ProtoField(number = 5, required = false)
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    @ProtoField(number = 6, required = false)
    public String getLastUpdBy() {
        return lastUpdBy;
    }

    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    @ProtoField(number = 7, required = false)
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @ProtoField(number = 8, required = false)
    public String getModificationNum() {
        return modificationNum;
    }

    public void setModificationNum(String modificationNum) {
        this.modificationNum = modificationNum;
    }

    @ProtoField(number = 9, required = false)
    public String getRowId1() {
        return rowId1;
    }


    public void setRowId1(String rowId1) {
        this.rowId1 = rowId1;
    }

    @ProtoField(number = 11, required = false)
    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    @ProtoField(number = 12, required = false)
    public String getItemDtlAmt() {
        return itemDtlAmt;
    }

    public void setItemDtlAmt(String itemDtlAmt) {
        this.itemDtlAmt = itemDtlAmt;
    }

    @ProtoField(number = 13, required = false)
    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    @ProtoField(number = 14, required = false)
    public String getBonusQty() {
        return bonusQty;
    }

    public void setBonusQty(String bonusQty) {
        this.bonusQty = bonusQty;
    }

    @ProtoField(number = 15, required = false)
    public String getPartRprId() {
        return partRprId;
    }


    public void setPartRprId(String partRprId) {
        this.partRprId = partRprId;
    }

    @ProtoField(number = 16, required = false)
    public String getExtndPrice() {
        return extndPrice;
    }

    public void setExtndPrice(String extndPrice) {
        this.extndPrice = extndPrice;
    }

    @ProtoField(number = 17, required = false)
    public String getExtndTax() {
        return extndTax;
    }

    public void setExtndTax(String extndTax) {
        this.extndTax = extndTax;
    }

    @ProtoField(number = 18, required = false)
    public String getInvcLnItemId() {
        return invcLnItemId;
    }

    public void setInvcLnItemId(String invcLnItemId) {
        this.invcLnItemId = invcLnItemId;
    }

    @ProtoField(number = 19, required = false)
    public String getInvcTypeCd() {
        return invcTypeCd;
    }

    public void setInvcTypeCd(String invcTypeCd) {
        this.invcTypeCd = invcTypeCd;
    }

    @ProtoField(number = 20, required = false)
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @ProtoField(number = 21, required = false)
    public String getLnNum() {
        return lnNum;
    }

    public void setLnNum(String lnNum) {
        this.lnNum = lnNum;
    }

    @ProtoField(number = 22, required = false)
    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    @ProtoField(number = 23, required = false)
    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    @ProtoField(number = 24, required = false)
    public String getVcNo() {
        return vcNo;
    }

    public void setVcNo(String vcNo) {
        this.vcNo = vcNo;
    }

    @ProtoField(number = 25, required = false)
    public String getQtyReq() {
        return qtyReq;
    }

    public void setQtyReq(String qtyReq) {
        this.qtyReq = qtyReq;
    }

    @ProtoField(number = 26, required = false)
    public String getXTcsAmount() {
        return xTcsAmount;
    }

    public void setXTcsAmount(String xTcsAmount) {
        this.xTcsAmount = xTcsAmount;
    }

    @ProtoField(number = 27, required = false)
    public String getXTmAccessoriesAmt() {
        return xTmAccessoriesAmt;
    }

    public void setXTmAccessoriesAmt(String xTmAccessoriesAmt) {
        this.xTmAccessoriesAmt = xTmAccessoriesAmt;
    }

    @ProtoField(number = 28, required = false)
    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    @ProtoField(number = 29, required = false)
    public String getAttrib03() {
        return attrib03;
    }

    public void setAttrib03(String attrib03) {
        this.attrib03 = attrib03;
    }

    @ProtoField(number = 30, required = false)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @ProtoField(number = 31, required = false)
    public String getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(String discountAmt) {
        this.discountAmt = discountAmt;
    }

    @ProtoField(number = 32, required = false)
    public String getAcntId() {
        return acntId;
    }

    public void setConFstName(String conFstName) {
        this.conFstName = conFstName;
    }

    @ProtoField(number = 33, required = false)
    public String getConLastName() {
        return conLastName;
    }

    public void setConLastName(String conLastName) {
        this.conLastName = conLastName;
    }

    @ProtoField(number = 34, required = false)
    public String getConMidName() {
        return conMidName;
    }

    public void setConMidName(String conMidName) {
        this.conMidName = conMidName;
    }

    @ProtoField(number = 35, required = false)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @ProtoField(number = 36, required = false)
    public String getXItemColor() {
        return xItemColor;
    }

    public void setXItemColor(String xItemColor) {
        this.xItemColor = xItemColor;
    }

    @ProtoField(number = 37, required = false)
    public String getBlPerId() {
        return blPerId;
    }

    public void setBlPerId(String blPerId) {
        this.blPerId = blPerId;
    }

    @ProtoField(number = 38, required = false)
    public String getCustomerSt() {
        return customerSt;
    }

    public void setCustomerSt(String customerSt) {
        this.customerSt = customerSt;
    }

    @ProtoField(number = 39, required = false)
    public String getXEngineNum() {
        return xEngineNum;
    }

    public void setXEngineNum(String xEngineNum) {
        this.xEngineNum = xEngineNum;
    }

    @ProtoField(number = 40, required = false)
    public String getXExtndPrice() {
        return xExtndPrice;
    }

    public void setXExtndPrice(String xExtndPrice) {
        this.xExtndPrice = xExtndPrice;
    }

    @ProtoField(number = 41, required = false)
    public String getXExtendedQty() {
        return xExtendedQty;
    }

    public void setXExtendedQty(String xExtendedQty) {
        this.xExtendedQty = xExtendedQty;
    }

    @ProtoField(number = 42, required = false)
    public String getHypothecation() {
        return hypothecation;
    }

    public void setHypothecation(String hypothecation) {
        this.hypothecation = hypothecation;
    }

    @ProtoField(number = 43, required = false)
    public String getXInvNoPan() {
        return xInvNoPan;
    }

    public void setXInvNoPan(String xInvNoPan) {
        this.xInvNoPan = xInvNoPan;
    }

    @ProtoField(number = 44, required = false)
    public String getXOrdItmDscntPercent() {
        return xOrdItmDscntPercent;
    }

    public void setXOrdItmDscntPercent(String xOrdItmDscntPercent) {
        this.xOrdItmDscntPercent = xOrdItmDscntPercent;
    }

    @ProtoField(number = 45, required = false)
    public String getXOrdItmDscntAmt() {
        return xOrdItmDscntAmt;
    }

    public void setXOrdItmDscntAmt(String xOrdItmDscntAmt) {
        this.xOrdItmDscntAmt = xOrdItmDscntAmt;
    }

    @ProtoField(number = 46, required = false)
    public String getXInvPan() {
        return xInvPan;
    }

    public void setXInvPan(String xInvPan) {
        this.xInvPan = xInvPan;
    }

    @ProtoField(number = 47, required = false)
    public String getXPartBillType() {
        return xPartBillType;
    }

    public void setXPartBillType(String xPartBillType) {
        this.xPartBillType = xPartBillType;
    }

    @ProtoField(number = 48, required = false)
    public String getXPartStatusCd() {
        return xPartStatusCd;
    }

    public void setXPartStatusCd(String xPartStatusCd) {
        this.xPartStatusCd = xPartStatusCd;
    }

    @ProtoField(number = 49, required = false)
    public String getXPartNum() {
        return xPartNum;
    }

    public void setXPartNum(String xPartNum) {
        this.xPartNum = xPartNum;
    }

    @ProtoField(number = 50, required = false)
    public String getXPreTaxDscnt() {
        return xPreTaxDscnt;
    }

    public void setXPreTaxDscnt(String xPreTaxDscnt) {
        this.xPreTaxDscnt = xPreTaxDscnt;
    }

    @ProtoField(number = 51, required = false)
    public String getXDescText() {
        return xDescText;
    }

    public void setXDescText(String xDescText) {
        this.xDescText = xDescText;
    }

    @ProtoField(number = 52, required = false)
    public String getXProdDescLong() {
        return xProdDescLong;
    }

    public void setXProdDescLong(String xProdDescLong) {
        this.xProdDescLong = xProdDescLong;
    }

    @ProtoField(number = 53, required = false)
    public String getXRemarks() {
        return xRemarks;
    }

    public void setXRemarks(String xRemarks) {
        this.xRemarks = xRemarks;
    }

    @ProtoField(number = 54, required = false)
    public String getXScmDscAmt() {
        return xScmDscAmt;
    }

    public void setXScmDscAmt(String xScmDscAmt) {
        this.xScmDscAmt = xScmDscAmt;
    }

    @ProtoField(number = 55, required = false)
    public String getXSerialNum() {
        return xSerialNum;
    }

    public void setXSerialNum(String xSerialNum) {
        this.xSerialNum = xSerialNum;
    }

    @ProtoField(number = 56, required = false)
    public String getUomCd() {
        return uomCd;
    }

    public void setUomCd(String uomCd) {
        this.uomCd = uomCd;
    }

    @ProtoField(number = 57, required = false)
    public String getXUnitPrice() {
        return xUnitPrice;
    }

    public void setXUnitPrice(String xUnitPrice) {
        this.xUnitPrice = xUnitPrice;
    }

    @ProtoField(number = 58, required = false)
    public String getXDepreciationPerct() {
        return xDepreciationPerct;
    }

    public void setXDepreciationPerct(String xDepreciationPerct) {
        this.xDepreciationPerct = xDepreciationPerct;
    }

    @ProtoField(number = 59, required = false)
    public String getXTmDiscountAmt() {
        return xTmDiscountAmt;
    }

    public void setXTmDiscountAmt(String xTmDiscountAmt) {
        this.xTmDiscountAmt = xTmDiscountAmt;
    }

    @ProtoField(number = 60, required = false)
    public String getDivision() {
        return division;
    }


    public void setDivision(String division) {
        this.division = division;
    }

    @ProtoField(number = 61, required = false)
    public String getXXchngbonus() {
        return xXchngbonus;
    }

    public void setXXchngbonus(String xXchngbonus) {
        this.xXchngbonus = xXchngbonus;
    }

    @ProtoField(number = 62, required = false)
    public String getXTmExtWarAmt() {
        return xTmExtWarAmt;
    }

    public void setXTmExtWarAmt(String xTmExtWarAmt) {
        this.xTmExtWarAmt = xTmExtWarAmt;
    }

    @ProtoField(number = 63, required = false)
    public String getXFameDmndInc() {
        return xFameDmndInc;
    }

    public void setXFameDmndInc(String xFameDmndInc) {
        this.xFameDmndInc = xFameDmndInc;
    }

    @ProtoField(number = 64, required = false)
    public String getAttrib01() {
        return attrib01;
    }

    public void setAttrib01(String attrib01) {
        this.attrib01 = attrib01;
    }

    @ProtoField(number = 65, required = false)
    public String getXGstin() {
        return xGstin;
    }

    public void setXGstin(String xGstin) {
        this.xGstin = xGstin;
    }

    @ProtoField(number = 66, required = false)
    public String getGrossAmt() {
        return grossAmt;
    }

    public void setGrossAmt(String grossAmt) {
        this.grossAmt = grossAmt;
    }

    @ProtoField(number = 67, required = false)
    public String getXHsnCode() {
        return xHsnCode;
    }

    public void setXHsnCode(String xHsnCode) {
        this.xHsnCode = xHsnCode;
    }

    @ProtoField(number = 68, required = false)
    public String getXTmInsuranceAmt() {
        return xTmInsuranceAmt;
    }

    public void setXTmInsuranceAmt(String xTmInsuranceAmt) {
        this.xTmInsuranceAmt = xTmInsuranceAmt;
    }

    @ProtoField(number = 69, required = false)
    public String getAttrib16() {
        return attrib16;
    }

    public void setAttrib16(String attrib16) {
        this.attrib16 = attrib16;
    }

    @ProtoField(number = 70, required = false)
    public String getXInsuranceAmount() {
        return xInsuranceAmount;
    }

    public void setXInsuranceAmount(String xInsuranceAmount) {
        this.xInsuranceAmount = xInsuranceAmount;
    }

    @ProtoField(number = 71, required = false)
    public String getXInvCnclldDt() {
        return xInvCnclldDt;
    }

    public void setXInvCnclldDt(String xInvCnclldDt) {
        this.xInvCnclldDt = xInvCnclldDt;
    }

    @ProtoField(number = 72, required = false)
    public String getInvcDt() {
        return invcDt;
    }

    public void setInvcDt(String invcDt) {
        this.invcDt = invcDt;
    }

    @ProtoField(number = 73, required = false)
    public String getInvcNum() {
        return invcNum;
    }

    public void setInvcNum(String invcNum) {
        this.invcNum = invcNum;
    }

    @ProtoField(number = 74, required = false)
    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }

    @ProtoField(number = 75, required = false)
    public String getLob() {
        return lob;
    }

    public void setLob(String lob) {
        this.lob = lob;
    }

    @ProtoField(number = 76, required = false)
    public String getXTmNumberplateAmt() {
        return xTmNumberplateAmt;
    }

    public void setXTmNumberplateAmt(String xTmNumberplateAmt) {
        this.xTmNumberplateAmt = xTmNumberplateAmt;
    }

    @ProtoField(number = 77, required = false)
    public String getOrderDt() {
        return orderDt;
    }

    public void setOrderDt(String orderDt) {
        this.orderDt = orderDt;
    }

    @ProtoField(number = 78, required = false)
    public String getXDisInvtaxAmt() {
        return xDisInvtaxAmt;
    }

    public void setXDisInvtaxAmt(String xDisInvtaxAmt) {
        this.xDisInvtaxAmt = xDisInvtaxAmt;
    }

    @ProtoField(number = 79, required = false)
    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    @ProtoField(number = 80, required = false)
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @ProtoField(number = 81, required = false)
    public String getXTmOtherAmt() {
        return xTmOtherAmt;
    }

    public void setXTmOtherAmt(String xTmOtherAmt) {
        this.xTmOtherAmt = xTmOtherAmt;
    }

    @ProtoField(number = 82, required = false)
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @ProtoField(number = 83, required = false)
    public String getXPermRegnNo() {
        return xPermRegnNo;
    }

    public void setXPermRegnNo(String xPermRegnNo) {
        this.xPermRegnNo = xPermRegnNo;
    }

    @ProtoField(number = 84, required = false)
    public String getXPlaceOfSupply() {
        return xPlaceOfSupply;
    }

    public void setXPlaceOfSupply(String xPlaceOfSupply) {
        this.xPlaceOfSupply = xPlaceOfSupply;
    }

    @ProtoField(number = 85, required = false)
    public String getName20() {
        return name20;
    }

    public void setName20(String name20) {
        this.name20 = name20;
    }

    @ProtoField(number = 86, required = false)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @ProtoField(number = 87, required = false)
    public String getXTmRegistrationAmt() {
        return xTmRegistrationAmt;
    }

    public void setXTmRegistrationAmt(String xTmRegistrationAmt) {
        this.xTmRegistrationAmt = xTmRegistrationAmt;
    }

    @ProtoField(number = 88, required = false)
    public String getAttrib22() {
        return attrib22;
    }

    public void setAttrib22(String attrib22) {
        this.attrib22 = attrib22;
    }

    @ProtoField(number = 89, required = false)
    public String getAttrib21() {
        return attrib21;
    }

    public void setAttrib21(String attrib21) {
        this.attrib21 = attrib21;
    }

    @ProtoField(number = 90, required = false)
    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @ProtoField(number = 91, required = false)
    public String getXResidentStat() {
        return xResidentStat;
    }

    public void setXResidentStat(String xResidentStat) {
        this.xResidentStat = xResidentStat;
    }

    @ProtoField(number = 92, required = false)
    public String getXStateCode() {
        return xStateCode;
    }

    public void setXStateCode(String xStateCode) {
        this.xStateCode = xStateCode;
    }

    @ProtoField(number = 93, required = false)
    public String getXTcsPrice() {
        return xTcsPrice;
    }

    public void setXTcsPrice(String xTcsPrice) {
        this.xTcsPrice = xTcsPrice;
    }

    @ProtoField(number = 94, required = false)
    public String getXTaxexemptCategory() {
        return xTaxexemptCategory;
    }

    public void setXTaxexemptCategory(String xTaxexemptCategory) {
        this.xTaxexemptCategory = xTaxexemptCategory;
    }

    @ProtoField(number = 95, required = false)
    public String getXTmTransformationAmt() {
        return xTmTransformationAmt;
    }

    public void setXTmTransformationAmt(String xTmTransformationAmt) {
        this.xTmTransformationAmt = xTmTransformationAmt;
    }

    @ProtoField(number = 96, required = false)
    public String getXVas1Price() {
        return xVas1Price;
    }

    public void setXVas1Price(String xVas1Price) {
        this.xVas1Price = xVas1Price;
    }

    @ProtoField(number = 97, required = false)
    public String getXVas2Price() {
        return xVas2Price;
    }

    public void setXVas2Price(String xVas2Price) {
        this.xVas2Price = xVas2Price;
    }

    @ProtoField(number = 98, required = false)
    public String getXVas3Price() {
        return xVas3Price;
    }

    public void setXVas3Price(String xVas3Price) {
        this.xVas3Price = xVas3Price;
    }

    @ProtoField(number = 99, required = false)
    public String getAttrib17() {
        return attrib17;
    }

    public void setAttrib17(String attrib17) {
        this.attrib17 = attrib17;
    }

    @ProtoField(number = 100, required = false)
    public String getAttrib18() {
        return attrib18;
    }

    public void setAttrib18(String attrib18) {
        this.attrib18 = attrib18;
    }

    @ProtoField(number = 101, required = false)
    public String getAttrib36() {
        return attrib36;
    }

    public void setAttrib36(String attrib36) {
        this.attrib36 = attrib36;
    }

    @ProtoField(number = 102, required = false)
    public String getAttrib19() {
        return attrib19;
    }

    public void setAttrib19(String attrib19) {
        this.attrib19 = attrib19;
    }

    @ProtoField(number = 103, required = false)
    public String getAttrib41() {
        return attrib41;
    }

    public void setAttrib41(String attrib41) {
        this.attrib41 = attrib41;
    }

    @ProtoField(number = 104, required = false)
    public String getTmshtItmId() {
        return tmshtItmId;
    }

    public void setTmshtItmId(String tmshtItmId) {
        this.tmshtItmId = tmshtItmId;
    }

    @ProtoField(number = 105, required = false)
    public String getConflictId1() {
        return conflictId1;
    }

    public void setConflictId1(String conflictId1) {
        this.conflictId1 = conflictId1;
    }

    @ProtoField(number = 106, required = false)
    public String getLastUpd1() {
        return lastUpd1;
    }

    public void setLastUpd1(String lastUpd1) {
        this.lastUpd1 = lastUpd1;
    }

    @ProtoField(number = 107, required = false)
    public String getCreated1() {
        return created1;
    }

    public void setCreated1(String created1) {
        this.created1 = created1;
    }

    @ProtoField(number = 108, required = false)
    public String getLastUpdBy1() {
        return lastUpdBy1;
    }

    public void setLastUpdBy1(String lastUpdBy1) {
        this.lastUpdBy1 = lastUpdBy1;
    }

    @ProtoField(number = 109, required = false)
    public String getCreatedBy1() {
        return createdBy1;
    }

    public void setCreatedBy1(String createdBy1) {
        this.createdBy1 = createdBy1;
    }

    @ProtoField(number = 110, required = false)
    public String getModificationNum1() {
        return modificationNum1;
    }

    public void setModificationNum1(String modificationNum1) {
        this.modificationNum1 = modificationNum1;
    }

    @ProtoField(number = 111, required = false)
    public String getRowId2() {
        return rowId2;
    }

    public void setRowId2(String rowId2) {
        this.rowId2 = rowId2;
    }

    @ProtoField(number = 112, required = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ProtoField(number = 113, required = false)
    public String getTaxAmt() {
        return taxAmt;
    }

    public void setTaxAmt(String taxAmt) {
        this.taxAmt = taxAmt;
    }

    @ProtoField(number = 114, required = false)
    public String getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(String taxRate) {
        this.taxRate = taxRate;
    }

    @ProtoField(number = 115, required = false)
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @ProtoField(number = 116, required = false)
    public String getGodown() {
        return godown;
    }

    public void setGodown(String godown) {
        this.godown = godown;
    }

    @ProtoField(number = 117, required = false)
    public String getSalesLedgerName() {
        return salesLedgerName;
    }

    public void setSalesLedgerName(String salesLedgerName) {
        this.salesLedgerName = salesLedgerName;
    }

    @ProtoField(number = 118, required = false)
    public String getEntryTax() {
        return entryTax;
    }

    public void setEntryTax(String entryTax) {
        this.entryTax = entryTax;
    }

    @ProtoField(number = 119, required = false)
    public String getTollTax() {
        return tollTax;
    }

    public void setTollTax(String tollTax) {
        this.tollTax = tollTax;
    }

    @ProtoField(number = 120, required = false)
    public String getSurcharge() {
        return surcharge;
    }

    public void setSurcharge(String surcharge) {
        this.surcharge = surcharge;
    }

    @ProtoField(number = 121, required = false)
    public String getResaleTax() {
        return resaleTax;
    }

    public void setResaleTax(String resaleTax) {
        this.resaleTax = resaleTax;
    }

    @ProtoField(number = 122, required = false)
    public String getTurnOverTax() {
        return turnOverTax;
    }

    public void setTurnOverTax(String turnOverTax) {
        this.turnOverTax = turnOverTax;
    }

    @ProtoField(number = 123, required = false)
    public String getRoadCess() {
        return roadCess;
    }

    public void setRoadCess(String roadCess) {
        this.roadCess = roadCess;
    }

    @ProtoField(number = 124, required = false)
    public String getOctroi() {
        return octroi;
    }

    public void setOctroi(String octroi) {
        this.octroi = octroi;
    }

    @ProtoField(number = 125, required = false)
    public String getLst() {
        return lst;
    }

    public void setLst(String lst) {
        this.lst = lst;
    }

    @ProtoField(number = 126, required = false)
    public String getOutputVat125() {
        return outputVat125;
    }

    public void setOutputVat125(String outputVat125) {
        this.outputVat125 = outputVat125;
    }

    @ProtoField(number = 127, required = false)
    public String getOutputVat20() {
        return outputVat20;
    }

    public void setOutputVat20(String outputVat20) {
        this.outputVat20 = outputVat20;
    }

    @ProtoField(number = 128, required = false)
    public String getOutputVat15() {
        return outputVat15;
    }

    public void setOutputVat15(String outputVat15) {
        this.outputVat15 = outputVat15;
    }

    @ProtoField(number = 129, required = false)
    public String getOutputVat4() {
        return outputVat4;
    }

    public void setOutputVat4(String outputVat4) {
        this.outputVat4 = outputVat4;
    }

    @ProtoField(number = 130, required = false)
    public String getVatClassification1() {
        return vatClassification1;
    }

    public void setVatClassification1(String vatClassification1) {
        this.vatClassification1 = vatClassification1;
    }

    @ProtoField(number = 131, required = false)
    public String getVatAssessibleAmt1() {
        return vatAssessibleAmt1;
    }

    public void setVatAssessibleAmt1(String vatAssessibleAmt1) {
        this.vatAssessibleAmt1 = vatAssessibleAmt1;
    }

    @ProtoField(number = 132, required = false)
    public String getVatClassification2() {
        return vatClassification2;
    }

    public void setVatClassification2(String vatClassification2) {
        this.vatClassification2 = vatClassification2;
    }

    @ProtoField(number = 133, required = false)
    public String getVatAssessibleAmt2() {
        return vatAssessibleAmt2;
    }

    public void setVatAssessibleAmt2(String vatAssessibleAmt2) {
        this.vatAssessibleAmt2 = vatAssessibleAmt2;
    }

    @ProtoField(number = 134, required = false)
    public String getVatClassification3() {
        return vatClassification3;
    }

    public void setVatClassification3(String vatClassification3) {
        this.vatClassification3 = vatClassification3;
    }

    @ProtoField(number = 135, required = false)
    public String getVatAssessibleAmt3() {
        return vatAssessibleAmt3;
    }

    public void setVatAssessibleAmt3(String vatAssessibleAmt3) {
        this.vatAssessibleAmt3 = vatAssessibleAmt3;
    }

    @ProtoField(number = 136, required = false)
    public String getVatClassification4() {
        return vatClassification4;
    }

    public void setVatClassification4(String vatClassification4) {
        this.vatClassification4 = vatClassification4;
    }

    @ProtoField(number = 137, required = false)
    public String getVatAssessibleAmt4() {
        return vatAssessibleAmt4;
    }

    public void setVatAssessibleAmt4(String vatAssessibleAmt4) {
        this.vatAssessibleAmt4 = vatAssessibleAmt4;
    }

    @ProtoField(number = 138, required = false)
    public String getOutputVat14() {
        return outputVat14;
    }

    public void setOutputVat14(String outputVat14) {
        this.outputVat14 = outputVat14;
    }

    @ProtoField(number = 139, required = false)
    public String getOutputVat145() {
        return outputVat145;
    }

    public void setOutputVat145(String outputVat145) {
        this.outputVat145 = outputVat145;
    }

    @ProtoField(number = 140, required = false)
    public String getVatClassification5() {
        return vatClassification5;
    }

    public void setVatClassification5(String vatClassification5) {
        this.vatClassification5 = vatClassification5;
    }

    @ProtoField(number = 141, required = false)
    public String getVatAssessibleAmt5() {
        return vatAssessibleAmt5;
    }

    public void setVatAssessibleAmt5(String vatAssessibleAmt5) {
        this.vatAssessibleAmt5 = vatAssessibleAmt5;
    }

    @ProtoField(number = 142, required = false)
    public String getVatClassification6() {
        return vatClassification6;
    }

    public void setVatClassification6(String vatClassification6) {
        this.vatClassification6 = vatClassification6;
    }

    @ProtoField(number = 143, required = false)
    public String getVatAssessibleAmt6() {
        return vatAssessibleAmt6;
    }

    public void setVatAssessibleAmt6(String vatAssessibleAmt6) {
        this.vatAssessibleAmt6 = vatAssessibleAmt6;
    }

    @ProtoField(number = 144, required = false)
    public String getOutputVat135() {
        return outputVat135;
    }

    public void setOutputVat135(String outputVat135) {
        this.outputVat135 = outputVat135;
    }

    @ProtoField(number = 145, required = false)
    public String getVatClassification7() {
        return vatClassification7;
    }

    public void setVatClassification7(String vatClassification7) {
        this.vatClassification7 = vatClassification7;
    }

    @ProtoField(number = 146, required = false)
    public String getVatAssessibleAmt7() {
        return vatAssessibleAmt7;
    }

    public void setVatAssessibleAmt7(String vatAssessibleAmt7) {
        this.vatAssessibleAmt7 = vatAssessibleAmt7;
    }

    @ProtoField(number = 147, required = false)
    public String getOutputVat13() {
        return outputVat13;
    }

    public void setOutputVat13(String outputVat13) {
        this.outputVat13 = outputVat13;
    }

    @ProtoField(number = 148, required = false)
    public String getVatAssessibleAmt8() {
        return vatAssessibleAmt8;
    }

    public void setVatAssessibleAmt8(String vatAssessibleAmt8) {
        this.vatAssessibleAmt8 = vatAssessibleAmt8;
    }

    @ProtoField(number = 149, required = false)
    public String getVatClassification8() {
        return vatClassification8;
    }

    public void setVatClassification8(String vatClassification8) {
        this.vatClassification8 = vatClassification8;
    }

    @ProtoField(number = 150, required = false)
    public String getOutputVat5() {
        return outputVat5;
    }

    public void setOutputVat5(String outputVat5) {
        this.outputVat5 = outputVat5;
    }

    @ProtoField(number = 151, required = false)
    public String getVatAssessibleAmt9() {
        return vatAssessibleAmt9;
    }

    public void setVatAssessibleAmt9(String vatAssessibleAmt9) {
        this.vatAssessibleAmt9 = vatAssessibleAmt9;
    }

    @ProtoField(number = 152, required = false)
    public String getVatClassification9() {
        return vatClassification9;
    }

    public void setVatClassification9(String vatClassification9) {
        this.vatClassification9 = vatClassification9;
    }

    @ProtoField(number = 153, required = false)
    public String getOutputVat1375() {
        return outputVat1375;
    }

    public void setOutputVat1375(String outputVat1375) {
        this.outputVat1375 = outputVat1375;
    }

    @ProtoField(number = 154, required = false)
    public String getVatAssessibleAmt10() {
        return vatAssessibleAmt10;
    }

    public void setVatAssessibleAmt10(String vatAssessibleAmt10) {
        this.vatAssessibleAmt10 = vatAssessibleAmt10;
    }

    @ProtoField(number = 155, required = false)
    public String getVatClassification10() {
        return vatClassification10;
    }

    public void setVatClassification10(String vatClassification10) {
        this.vatClassification10 = vatClassification10;
    }

    @ProtoField(number = 156, required = false)
    public String getTotalOrderValue() {
        return totalOrderValue;
    }

    public void setTotalOrderValue(String totalOrderValue) {
        this.totalOrderValue = totalOrderValue;
    }

    @ProtoField(number = 157, required = false)
    public String getNarration() {
        return narration;
    }

    public void setNarration(String narration) {
        this.narration = narration;
    }

    @ProtoField(number = 158, required = false)
    public String getOutputCGST() {
        return outputCGST;
    }

    public void setOutputCGST(String outputCGST) {
        this.outputCGST = outputCGST;
    }

    @ProtoField(number = 159, required = false)
    public String getOutputSGST() {
        return outputSGST;
    }

    public void setOutputSGST(String outputSGST) {
        this.outputSGST = outputSGST;
    }

    @ProtoField(number = 160, required = false)
    public String getOutputUTGST() {
        return outputUTGST;
    }

    public void setOutputUTGST(String outputUTGST) {
        this.outputUTGST = outputUTGST;
    }

    @ProtoField(number = 161, required = false)
    public String getOutputGSTCess() {
        return outputGSTCess;
    }

    public void setOutputGSTCess(String outputGSTCess) {
        this.outputGSTCess = outputGSTCess;
    }

    @ProtoField(number = 162, required = false)
    public String getClassficationCGST() {
        return classficationCGST;
    }

    public void setClassficationCGST(String classficationCGST) {
        this.classficationCGST = classficationCGST;
    }

    @ProtoField(number = 163, required = false)
    public String getClassficationSGST() {
        return classficationSGST;
    }

    public void setClassficationSGST(String classficationSGST) {
        this.classficationSGST = classficationSGST;
    }

    @ProtoField(number = 164, required = false)
    public String getClassficationUTGST() {
        return classficationUTGST;
    }

    public void setClassficationUTGST(String classficationUTGST) {
        this.classficationUTGST = classficationUTGST;
    }

    @ProtoField(number = 165, required = false)
    public String getClassficationIGST() {
        return classficationIGST;
    }

    public void setClassficationIGST(String classficationIGST) {
        this.classficationIGST = classficationIGST;
    }

    @ProtoField(number = 166, required = false)
    public String getClassficationGSTCess() {
        return classficationGSTCess;
    }

    public void setClassficationGSTCess(String classficationGSTCess) {
        this.classficationGSTCess = classficationGSTCess;
    }

    @ProtoField(number = 167, required = false)
    public String getGstCessAssibleAmount() {
        return gstCessAssibleAmount;
    }

    public void setGstCessAssibleAmount(String gstCessAssibleAmount) {
        this.gstCessAssibleAmount = gstCessAssibleAmount;
    }

    @ProtoField(number = 168, required = false)
    public String getOutputIGST() {
        return outputIGST;
    }

    public void setOutputIGST(String outputIGST) {
        this.outputIGST = outputIGST;
    }

    @ProtoField(number = 169, required = false)
    public String getCgstAssessibleAmount() {
        return cgstAssessibleAmount;
    }

    public void setCgstAssessibleAmount(String cgstAssessibleAmount) {
        this.cgstAssessibleAmount = cgstAssessibleAmount;
    }

    @ProtoField(number = 170, required = false)
    public String getSgstAssessibleAmount() {
        return sgstAssessibleAmount;
    }

    public void setSgstAssessibleAmount(String sgstAssessibleAmount) {
        this.sgstAssessibleAmount = sgstAssessibleAmount;
    }

    @ProtoField(number = 171, required = false)
    public String getUtgstAssessibleAmount() {
        return utgstAssessibleAmount;
    }

    public void setUtgstAssessibleAmount(String utgstAssessibleAmount) {
        this.utgstAssessibleAmount = utgstAssessibleAmount;
    }

    @ProtoField(number = 172, required = false)
    public String getIgstAssessibleAmount() {
        return igstAssessibleAmount;
    }

    public void setIgstAssessibleAmount(String igstAssessibleAmount) {
        this.igstAssessibleAmount = igstAssessibleAmount;
    }

    @ProtoField(number = 173, required = false)
    public String getOtherTaxAmount() {
        return otherTaxAmount;
    }

    public void setOtherTaxAmount(String otherTaxAmount) {
        this.otherTaxAmount = otherTaxAmount;
    }

    @ProtoField(number = 174, required = false)
    public String getKfcAccessibleAmount() {
        return kfcAccessibleAmount;
    }

    public void setKfcAccessibleAmount(String kfcAccessibleAmount) {
        this.kfcAccessibleAmount = kfcAccessibleAmount;
    }

    @ProtoField(number = 175, required = false)
    public String getKfc() {
        return kfc;
    }

    public void setKfc(String kfc) {
        this.kfc = kfc;
    }

    public void setAcntId(String acntId) {
        this.acntId = acntId;
    }

    @ProtoField(number = 176, required = false)
    public String getConFstName() {
        return conFstName;
    }

    @Override
    public String toString() {
        return "{" +
                "rowId='" + rowId + '\'' +
                ", conflictId='" + conflictId + '\'' +
                ", lastUpd='" + lastUpd + '\'' +
                ", created='" + created + '\'' +
                ", lastUpdBy='" + lastUpdBy + '\'' +
                ", createdBy='" + createdBy + '\'' +
                ", modificationNum='" + modificationNum + '\'' +
                ", rowId1='" + rowId1 + '\'' +
                ", activityId='" + activityId + '\'' +
                ", itemDtlAmt='" + itemDtlAmt + '\'' +
                ", assetId='" + assetId + '\'' +
                ", bonusQty='" + bonusQty + '\'' +
                ", partRprId='" + partRprId + '\'' +
                ", extndPrice='" + extndPrice + '\'' +
                ", extndTax='" + extndTax + '\'' +
                ", invcLnItemId='" + invcLnItemId + '\'' +
                ", invcTypeCd='" + invcTypeCd + '\'' +
                ", orderId='" + orderId + '\'' +
                ", lnNum='" + lnNum + '\'' +
                ", orderItemId='" + orderItemId + '\'' +
                ", prodId='" + prodId + '\'' +
                ", vcNo='" + vcNo + '\'' +
                ", qtyReq='" + qtyReq + '\'' +
                ", xTcsAmount='" + xTcsAmount + '\'' +
                ", xTmAccessoriesAmt='" + xTmAccessoriesAmt + '\'' +
                ", acctName='" + acctName + '\'' +
                ", attrib03='" + attrib03 + '\'' +
                ", login='" + login + '\'' +
                ", discountAmt='" + discountAmt + '\'' +
                ", acntId='" + acntId + '\'' +
                ", conFstName='" + conFstName + '\'' +
                ", conLastName='" + conLastName + '\'' +
                ", conMidName='" + conMidName + '\'' +
                ", fullName='" + fullName + '\'' +
                ", xItemColor='" + xItemColor + '\'' +
                ", blPerId='" + blPerId + '\'' +
                ", customerSt='" + customerSt + '\'' +
                ", xEngineNum='" + xEngineNum + '\'' +
                ", xExtndPrice='" + xExtndPrice + '\'' +
                ", xExtendedQty='" + xExtendedQty + '\'' +
                ", hypothecation='" + hypothecation + '\'' +
                ", xInvNoPan='" + xInvNoPan + '\'' +
                ", xOrdItmDscntPercent='" + xOrdItmDscntPercent + '\'' +
                ", xOrdItmDscntAmt='" + xOrdItmDscntAmt + '\'' +
                ", xInvPan='" + xInvPan + '\'' +
                ", xPartBillType='" + xPartBillType + '\'' +
                ", xPartStatusCd='" + xPartStatusCd + '\'' +
                ", xPartNum='" + xPartNum + '\'' +
                ", xPreTaxDscnt='" + xPreTaxDscnt + '\'' +
                ", xDescText='" + xDescText + '\'' +
                ", xProdDescLong='" + xProdDescLong + '\'' +
                ", xRemarks='" + xRemarks + '\'' +
                ", xScmDscAmt='" + xScmDscAmt + '\'' +
                ", xSerialNum='" + xSerialNum + '\'' +
                ", uomCd='" + uomCd + '\'' +
                ", xUnitPrice='" + xUnitPrice + '\'' +
                ", xDepreciationPerct='" + xDepreciationPerct + '\'' +
                ", xTmDiscountAmt='" + xTmDiscountAmt + '\'' +
                ", division='" + division + '\'' +
                ", xXchngbonus='" + xXchngbonus + '\'' +
                ", xTmExtWarAmt='" + xTmExtWarAmt + '\'' +
                ", xFameDmndInc='" + xFameDmndInc + '\'' +
                ", attrib01='" + attrib01 + '\'' +
                ", xGstin='" + xGstin + '\'' +
                ", grossAmt='" + grossAmt + '\'' +
                ", xHsnCode='" + xHsnCode + '\'' +
                ", xTmInsuranceAmt='" + xTmInsuranceAmt + '\'' +
                ", attrib16='" + attrib16 + '\'' +
                ", xInsuranceAmount='" + xInsuranceAmount + '\'' +
                ", xInvCnclldDt='" + xInvCnclldDt + '\'' +
                ", invcDt='" + invcDt + '\'' +
                ", invcNum='" + invcNum + '\'' +
                ", statusCd='" + statusCd + '\'' +
                ", lob='" + lob + '\'' +
                ", xTmNumberplateAmt='" + xTmNumberplateAmt + '\'' +
                ", orderDt='" + orderDt + '\'' +
                ", xDisInvtaxAmt='" + xDisInvtaxAmt + '\'' +
                ", orderNum='" + orderNum + '\'' +
                ", orderType='" + orderType + '\'' +
                ", xTmOtherAmt='" + xTmOtherAmt + '\'' +
                ", model='" + model + '\'' +
                ", xPermRegnNo='" + xPermRegnNo + '\'' +
                ", xPlaceOfSupply='" + xPlaceOfSupply + '\'' +
                ", name20='" + name20 + '\'' +
                ", type='" + type + '\'' +
                ", xTmRegistrationAmt='" + xTmRegistrationAmt + '\'' +
                ", attrib22='" + attrib22 + '\'' +
                ", attrib21='" + attrib21 + '\'' +
                ", qty='" + qty + '\'' +
                ", xResidentStat='" + xResidentStat + '\'' +
                ", xStateCode='" + xStateCode + '\'' +
                ", xTcsPrice='" + xTcsPrice + '\'' +
                ", xTaxexemptCategory='" + xTaxexemptCategory + '\'' +
                ", xTmTransformationAmt='" + xTmTransformationAmt + '\'' +
                ", xVas1Price='" + xVas1Price + '\'' +
                ", xVas2Price='" + xVas2Price + '\'' +
                ", xVas3Price='" + xVas3Price + '\'' +
                ", attrib17='" + attrib17 + '\'' +
                ", attrib18='" + attrib18 + '\'' +
                ", attrib36='" + attrib36 + '\'' +
                ", attrib19='" + attrib19 + '\'' +
                ", attrib41='" + attrib41 + '\'' +
                ", tmshtItmId='" + tmshtItmId + '\'' +
                ", conflictId1='" + conflictId1 + '\'' +
                ", lastUpd1='" + lastUpd1 + '\'' +
                ", created1='" + created1 + '\'' +
                ", lastUpdBy1='" + lastUpdBy1 + '\'' +
                ", createdBy1='" + createdBy1 + '\'' +
                ", modificationNum1='" + modificationNum1 + '\'' +
                ", rowId2='" + rowId2 + '\'' +
                ", name='" + name + '\'' +
                ", taxAmt='" + taxAmt + '\'' +
                ", taxRate='" + taxRate + '\'' +
                ", quantity='" + quantity + '\'' +
                ", godown='" + godown + '\'' +
                ", salesLedgerName='" + salesLedgerName + '\'' +
                ", entryTax='" + entryTax + '\'' +
                ", tollTax='" + tollTax + '\'' +
                ", surcharge='" + surcharge + '\'' +
                ", resaleTax='" + resaleTax + '\'' +
                ", turnOverTax='" + turnOverTax + '\'' +
                ", roadCess='" + roadCess + '\'' +
                ", octroi='" + octroi + '\'' +
                ", lst='" + lst + '\'' +
                ", outputVat125='" + outputVat125 + '\'' +
                ", outputVat20='" + outputVat20 + '\'' +
                ", outputVat15='" + outputVat15 + '\'' +
                ", outputVat4='" + outputVat4 + '\'' +
                ", vatClassification1='" + vatClassification1 + '\'' +
                ", vatAssessibleAmt1='" + vatAssessibleAmt1 + '\'' +
                ", vatClassification2='" + vatClassification2 + '\'' +
                ", vatAssessibleAmt2='" + vatAssessibleAmt2 + '\'' +
                ", vatClassification3='" + vatClassification3 + '\'' +
                ", vatAssessibleAmt3='" + vatAssessibleAmt3 + '\'' +
                ", vatClassification4='" + vatClassification4 + '\'' +
                ", vatAssessibleAmt4='" + vatAssessibleAmt4 + '\'' +
                ", outputVat14='" + outputVat14 + '\'' +
                ", outputVat145='" + outputVat145 + '\'' +
                ", vatClassification5='" + vatClassification5 + '\'' +
                ", vatAssessibleAmt5='" + vatAssessibleAmt5 + '\'' +
                ", vatClassification6='" + vatClassification6 + '\'' +
                ", vatAssessibleAmt6='" + vatAssessibleAmt6 + '\'' +
                ", outputVat135='" + outputVat135 + '\'' +
                ", vatClassification7='" + vatClassification7 + '\'' +
                ", vatAssessibleAmt7='" + vatAssessibleAmt7 + '\'' +
                ", outputVat13='" + outputVat13 + '\'' +
                ", vatAssessibleAmt8='" + vatAssessibleAmt8 + '\'' +
                ", vatClassification8='" + vatClassification8 + '\'' +
                ", outputVat5='" + outputVat5 + '\'' +
                ", vatAssessibleAmt9='" + vatAssessibleAmt9 + '\'' +
                ", vatClassification9='" + vatClassification9 + '\'' +
                ", outputVat1375='" + outputVat1375 + '\'' +
                ", vatAssessibleAmt10='" + vatAssessibleAmt10 + '\'' +
                ", vatClassification10='" + vatClassification10 + '\'' +
                ", totalOrderValue='" + totalOrderValue + '\'' +
                ", narration='" + narration + '\'' +
                ", outputCGST='" + outputCGST + '\'' +
                ", outputSGST='" + outputSGST + '\'' +
                ", outputUTGST='" + outputUTGST + '\'' +
                ", outputGSTCess='" + outputGSTCess + '\'' +
                ", classficationCGST='" + classficationCGST + '\'' +
                ", classficationSGST='" + classficationSGST + '\'' +
                ", classficationUTGST='" + classficationUTGST + '\'' +
                ", classficationIGST='" + classficationIGST + '\'' +
                ", classficationGSTCess='" + classficationGSTCess + '\'' +
                ", gstCessAssibleAmount='" + gstCessAssibleAmount + '\'' +
                ", outputIGST='" + outputIGST + '\'' +
                ", cgstAssessibleAmount='" + cgstAssessibleAmount + '\'' +
                ", sgstAssessibleAmount='" + sgstAssessibleAmount + '\'' +
                ", utgstAssessibleAmount='" + utgstAssessibleAmount + '\'' +
                ", igstAssessibleAmount='" + igstAssessibleAmount + '\'' +
                ", otherTaxAmount='" + otherTaxAmount + '\'' +
                ", kfcAccessibleAmount='" + kfcAccessibleAmount + '\'' +
                ", kfc='" + kfc + '\'' +
                '}';
    }
}