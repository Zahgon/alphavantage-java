/*
 *
 * Copyright (c) 2020 Sylvester Sefa-Yeboah
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.crazzyghost.alphavantage.fundamentaldata.response;

import com.crazzyghost.alphavantage.parser.NoneableLong;
import com.squareup.moshi.Json;

public class BalanceSheet {

    @Json(name = "fiscalDateEnding")
    private String fiscalDateEnding;

    @Json(name = "reportedCurrency")
    private String reportedCurrency;

    @Json(name = "totalAssets")
    @NoneableLong
    private Long totalAssets;

    @Json(name = "totalCurrentAssets")
    @NoneableLong
    private Long totalCurrentAssets;

    @Json(name = "cashAndCashEquivalentsAtCarryingValue")
    @NoneableLong
    private Long cashAndCashEquivalentsAtCarryingValue;

    @Json(name = "cashAndShortTermInvestments")
    @NoneableLong
    private Long cashAndShortTermInvestments;

    @Json(name = "inventory")
    @NoneableLong
    private Long inventory;

    @Json(name = "currentNetReceivables")
    @NoneableLong
    private Long currentNetReceivables;

    @Json(name = "totalNonCurrentAssets")
    @NoneableLong
    private Long totalNonCurrentAssets;

    @Json(name = "propertyPlantEquipment")
    @NoneableLong
    private Long propertyPlantEquipment;

    @Json(name = "accumulatedDepreciationAmortizationPPE")
    @NoneableLong
    private Long accumulatedDepreciationAmortizationPPE;

    @Json(name = "intangibleAssets")
    @NoneableLong
    private Long intangibleAssets;

    @Json(name = "intangibleAssetsExcludingGoodwill")
    @NoneableLong
    private Long intangibleAssetsExcludingGoodwill;

    @Json(name = "goodwill")
    @NoneableLong
    private Long goodWill;

    @Json(name = "investments")
    @NoneableLong
    private Long investments;

    @Json(name = "longTermInvestments")
    @NoneableLong
    private Long longTermInvestments;

    @Json(name = "shortTermInvestments")
    @NoneableLong
    private Long shortTermInvestments;

    @Json(name = "otherCurrentAssets")
    @NoneableLong
    private Long otherCurrentAssets;

    @Json(name = "otherNonCurrrentAssets")
    @NoneableLong
    private Long otherNonCurrentAssets;

    @Json(name = "totalLiabilities")
    @NoneableLong
    private Long totalLiabilities;

    @Json(name = "totalCurrentLiabilities")
    @NoneableLong
    private Long totalCurrentLiabilities;

    @Json(name = "currentAccountsPayable")
    @NoneableLong
    private Long currentAccountsPayable;

    @Json(name = "deferredRevenue")
    @NoneableLong
    private Long deferredRevenue;

    @Json(name = "currentDebt")
    @NoneableLong
    private Long currentDebt;

    @Json(name = "shortTermDebt")
    @NoneableLong
    private Long shortTermDebt;

    @Json(name = "totalNonCurrentLiabilities")
    @NoneableLong
    private Long totalNonCurrentLiabilities;

    @Json(name = "capitalLeaseObligations")
    @NoneableLong
    private Long capitalLeaseObligations;

    @Json(name = "longTermDebt")
    @NoneableLong
    private Long longTermDebt;

    @Json(name = "currentLongTermDebt")
    @NoneableLong
    private Long currentLongTermDebt;

    @Json(name = "longTermDebtNoncurrent")
    @NoneableLong
    private Long longTermDebtNonCurrent;

    @Json(name = "shortLongTermDebtTotal")
    @NoneableLong
    private Long shortLongTermDebtTotal;

    @Json(name = "otherCurrentLiabilities")
    @NoneableLong
    private Long otherCurrentLiabilities;

    @Json(name = "otherNonCurrentLiabilities")
    @NoneableLong
    private Long otherNonCurrentLiabilities;

    @Json(name = "totalShareholderEquity")
    @NoneableLong
    private Long totalShareholderEquity;

    @Json(name = "treasuryStock")
    @NoneableLong
    private Long treasuryStock;

    @Json(name = "retainedEarnings")
    @NoneableLong
    private Long retainedEarnings;

    @Json(name = "commonStock")
    @NoneableLong
    private Long commonStock;

    @Json(name = "commonStockSharesOutstanding")
    @NoneableLong
    private Long commonStockSharesOutstanding;

    public String getFiscalDateEnding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getReportedCurrency() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTotalAssets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTotalCurrentAssets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCashAndCashEquivalentsAtCarryingValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCashAndShortTermInvestments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getInventory() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCurrentNetReceivables() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTotalNonCurrentAssets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getPropertyPlantEquipment() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getAccumulatedDepreciationAmortizationPPE() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getIntangibleAssets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getIntangibleAssetsExcludingGoodwill() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getGoodWill() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getInvestments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getLongTermInvestments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getShortTermInvestments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getOtherCurrentAssets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getOtherNonCurrentAssets() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTotalLiabilities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTotalCurrentLiabilities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCurrentAccountsPayable() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getDeferredRevenue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCurrentDebt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getShortTermDebt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTotalNonCurrentLiabilities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCapitalLeaseObligations() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getLongTermDebt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCurrentLongTermDebt() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getLongTermDebtNonCurrent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getShortLongTermDebtTotal() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getOtherCurrentLiabilities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getOtherNonCurrentLiabilities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTotalShareholderEquity() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getTreasuryStock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getRetainedEarnings() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCommonStock() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCommonStockSharesOutstanding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
