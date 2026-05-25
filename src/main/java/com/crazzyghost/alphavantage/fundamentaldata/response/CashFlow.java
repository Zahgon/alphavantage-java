package com.crazzyghost.alphavantage.fundamentaldata.response;

import com.crazzyghost.alphavantage.parser.NoneableLong;
import com.squareup.moshi.Json;

public class CashFlow {

    @Json(name = "fiscalDateEnding")
    private String fiscalDateEnding;

    @Json(name = "reportedCurrency")
    private String reportedCurrency;

    @Json(name = "operatingCashflow")
    @NoneableLong
    private Long operatingCashflow;

    @Json(name = "paymentsForOperatingActivities")
    @NoneableLong
    private Long paymentsForOperatingActivities;

    @Json(name = "proceedsFromOperatingActivities")
    @NoneableLong
    private Long proceedsFromOperatingActivities;

    @Json(name = "changeInOperatingLiabilities")
    @NoneableLong
    private Long changeInOperatingLiabilities;

    @Json(name = "changeInOperatingAssets")
    @NoneableLong
    private Long changeInOperatingAssets;

    @Json(name = "depreciationDepletionAndAmortization")
    @NoneableLong
    private Long depreciationDepletionAndAmortization;

    @Json(name = "capitalExpenditures")
    @NoneableLong
    private Long capitalExpenditures;

    @Json(name = "changeInReceivables")
    @NoneableLong
    private Long changeInReceivables;

    @Json(name = "changeInInventory")
    @NoneableLong
    private Long changeInInventory;

    @Json(name = "profitLoss")
    @NoneableLong
    private Long profitLoss;

    @Json(name = "cashflowFromInvestment")
    @NoneableLong
    private Long cashflowFromInvestment;

    @Json(name = "cashflowFromFinancing")
    @NoneableLong
    private Long cashflowFromFinancing;

    @Json(name = "proceedsFromRepaymentsOfShortTermDebt")
    @NoneableLong
    private Long proceedsFromRepaymentsOfShortTermDebt;

    @Json(name = "paymentsForRepurchaseOfCommonStock")
    @NoneableLong
    private Long paymentsForRepurchaseOfCommonStock;

    @Json(name = "paymentsForRepurchaseOfEquity")
    @NoneableLong
    private Long paymentsForRepurchaseOfEquity;

    @Json(name = "paymentsForRepurchaseOfPreferredStock")
    @NoneableLong
    private Long paymentsForRepurchaseOfPreferredStock;

    @Json(name = "dividendPayout")
    @NoneableLong
    private Long dividendPayout;

    @Json(name = "dividendPayoutCommonStock")
    @NoneableLong
    private Long dividendPayoutCommonStock;

    @Json(name = "dividendPayoutPreferredStock")
    @NoneableLong
    private Long dividendPayoutPreferredStock;

    @Json(name = "proceedsFromIssuanceOfCommonStock")
    @NoneableLong
    private Long proceedsFromIssuanceOfCommonStock;

    @Json(name = "proceedsFromIssuanceOfLongTermDebtAndCapitalSecuritiesNet")
    @NoneableLong
    private Long proceedsFromIssuanceOfLongTermDebtAndCapitalSecuritiesNet;

    @Json(name = "proceedsFromIssuanceOfPreferredStock")
    @NoneableLong
    private Long proceedsFromIssuanceOfPreferredStock;

    @Json(name = "proceedsFromRepurchaseOfEquity")
    @NoneableLong
    private Long proceedsFromRepurchaseOfEquity;

    @Json(name = "proceedsFromSaleOfTreasuryStock")
    @NoneableLong
    private Long proceedsFromSaleOfTreasuryStock;

    @Json(name = "changeInCashAndCashEquivalents")
    @NoneableLong
    private Long changeInCashAndCashEquivalents;

    @Json(name = "changeInExchangeRate")
    @NoneableLong
    private Long changeInExchangeRate;

    @Json(name = "netIncome")
    @NoneableLong
    private Long netIncome;

    public String getFiscalDateEnding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getReportedCurrency() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getOperatingCashflow() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getPaymentsForOperatingActivities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getProceedsFromOperatingActivities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getChangeInOperatingLiabilities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getChangeInOperatingAssets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getDepreciationDepletionAndAmortization() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCapitalExpenditures() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getChangeInReceivables() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getChangeInInventory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getProfitLoss() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCashflowFromInvestment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCashflowFromFinancing() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getProceedsFromRepaymentsOfShortTermDebt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getPaymentsForRepurchaseOfCommonStock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getPaymentsForRepurchaseOfEquity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getPaymentsForRepurchaseOfPreferredStock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getDividendPayout() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getDividendPayoutCommonStock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getDividendPayoutPreferredStock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getProceedsFromIssuanceOfCommonStock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getProceedsFromIssuanceOfLongTermDebtAndCapitalSecuritiesNet() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getProceedsFromIssuanceOfPreferredStock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getProceedsFromRepurchaseOfEquity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getProceedsFromSaleOfTreasuryStock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getChangeInCashAndCashEquivalents() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getChangeInExchangeRate() {
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
