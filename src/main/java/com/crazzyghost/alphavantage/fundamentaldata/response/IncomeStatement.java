package com.crazzyghost.alphavantage.fundamentaldata.response;

import com.crazzyghost.alphavantage.parser.NoneableLong;
import com.squareup.moshi.Json;

public class IncomeStatement {

    @Json(name = "fiscalDateEnding")
    private String fiscalDateEnding;

    @Json(name = "reportedCurrency")
    private String reportedCurrency;

    @Json(name = "grossProfit")
    @NoneableLong
    private Long grossProfit;

    @Json(name = "totalRevenue")
    @NoneableLong
    private Long totalRevenue;

    @Json(name = "costOfRevenue")
    @NoneableLong
    private Long costOfRevenue;

    @Json(name = "costofGoodsAndServicesSold")
    @NoneableLong
    private Long costofGoodsAndServicesSold;

    @Json(name = "operatingIncome")
    @NoneableLong
    private Long operatingIncome;

    @Json(name = "sellingGeneralAndAdministrative")
    @NoneableLong
    private Long sellingGeneralAndAdministrative;

    @Json(name = "researchAndDevelopment")
    @NoneableLong
    private Long researchAndDevelopment;

    @Json(name = "operatingExpenses")
    @NoneableLong
    private Long operatingExpenses;

    @Json(name = "investmentIncomeNet")
    @NoneableLong
    private Long investmentIncomeNet;

    @Json(name = "netInterestIncome")
    @NoneableLong
    private Long netInterestIncome;

    @Json(name = "interestIncome")
    @NoneableLong
    private Long interestIncome;

    @Json(name = "interestExpense")
    @NoneableLong
    private Long interestExpense;

    @Json(name = "nonInterestIncome")
    @NoneableLong
    private Long nonInterestIncome;

    @Json(name = "otherNonOperatingIncome")
    @NoneableLong
    private Long otherNonOperatingIncome;

    @Json(name = "depreciation")
    @NoneableLong
    private Long depreciation;

    @Json(name = "depreciationAndAmortization")
    @NoneableLong
    private Long depreciationAndAmortization;

    @Json(name = "incomeBeforeTax")
    @NoneableLong
    private Long incomeBeforeTax;

    @Json(name = "incomeTaxExpense")
    @NoneableLong
    private Long incomeTaxExpense;

    @Json(name = "interestAndDebtExpense")
    @NoneableLong
    private Long interestAndDebtExpense;

    @Json(name = "netIncomeFromContinuingOperations")
    @NoneableLong
    private Long netIncomeFromContinuingOperations;

    @Json(name = "comprehensiveIncomeNetOfTax")
    @NoneableLong
    private Long comprehensiveIncomeNetOfTax;

    @Json(name = "ebit")
    @NoneableLong
    private Long ebit;

    @Json(name = "ebitda")
    @NoneableLong
    private Long ebitda;

    @Json(name = "netIncome")
    @NoneableLong
    private Long netIncome;

    public String getFiscalDateEnding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getReportedCurrency() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getGrossProfit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTotalRevenue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCostOfRevenue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCostofGoodsAndServicesSold() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getOperatingIncome() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getSellingGeneralAndAdministrative() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getResearchAndDevelopment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getOperatingExpenses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getInvestmentIncomeNet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getNetInterestIncome() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getInterestIncome() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getInterestExpense() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getNonInterestIncome() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getOtherNonOperatingIncome() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getDepreciation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getDepreciationAndAmortization() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getIncomeBeforeTax() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getIncomeTaxExpense() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getInterestAndDebtExpense() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getNetIncomeFromContinuingOperations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getComprehensiveIncomeNetOfTax() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getEbit() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getEbitda() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getNetIncome() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
