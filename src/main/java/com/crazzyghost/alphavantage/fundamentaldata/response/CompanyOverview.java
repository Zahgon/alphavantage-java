package com.crazzyghost.alphavantage.fundamentaldata.response;

import com.crazzyghost.alphavantage.parser.NoneableDouble;
import com.crazzyghost.alphavantage.parser.NoneableLong;
import com.squareup.moshi.Json;

public class CompanyOverview {

    @Json(name = "Symbol")
    private String symbol;

    @Json(name = "AssetType")
    private String assetType;

    @Json(name = "Name")
    private String name;

    @Json(name = "Description")
    private String description;

    @Json(name = "CIK")
    @NoneableLong
    private Long cik;

    @Json(name = "Exchange")
    private String exchange;

    @Json(name = "Currency")
    private String currency;

    @Json(name = "Country")
    private String country;

    @Json(name = "Sector")
    private String sector;

    @Json(name = "Industry")
    private String industry;

    @Json(name = "Address")
    private String address;

    @Json(name = "FiscalYearEnd")
    private String fiscalYearEnd;

    @Json(name = "LatestQuarter")
    private String latestQuarter;

    @Json(name = "MarketCapitalization")
    @NoneableLong
    private Long marketCapitalization;

    @Json(name = "EBITDA")
    @NoneableLong
    private Long ebitda;

    @Json(name = "PERatio")
    @NoneableDouble
    private Double peRatio;

    @Json(name = "PEGRatio")
    @NoneableDouble
    private Double pegRatio;

    @Json(name = "BookValue")
    @NoneableDouble
    private Double bookValue;

    @Json(name = "DividendPerShare")
    @NoneableDouble
    private Double dividendPerShare;

    @Json(name = "DividendYield")
    @NoneableDouble
    private Double dividendYield;

    @Json(name = "EPS")
    @NoneableDouble
    private Double eps;

    @Json(name = "RevenuePerShareTTM")
    @NoneableDouble
    private Double revenuePerShareTTM;

    @Json(name = "ProfitMargin")
    @NoneableDouble
    private Double profitMargin;

    @Json(name = "OperatingMarginTTM")
    @NoneableDouble
    private Double operatingMarginTTM;

    @Json(name = "ReturnOnAssetsTTM")
    @NoneableDouble
    private Double returnOnAssetsTTM;

    @Json(name = "ReturnOnEquityTTM")
    @NoneableDouble
    private Double returnOnEquityTTM;

    @Json(name = "RevenueTTM")
    @NoneableLong
    private Long revenueTTM;

    @Json(name = "GrossProfitTTM")
    @NoneableLong
    private Long grossProfitTTM;

    @Json(name = "DilutedEPSTTM")
    @NoneableDouble
    private Double dilutedEpsTTM;

    @Json(name = "QuarterlyEarningsGrowthYOY")
    @NoneableDouble
    private Double quarterlyEarningsGrowthYOY;

    @Json(name = "QuarterlyRevenueGrowthYOY")
    @NoneableDouble
    private Double quarterlyRevenueGrowthYOY;

    @Json(name = "AnalystTargetPrice")
    @NoneableDouble
    private Double analystTargetPrice;

    @Json(name = "TrailingPE")
    @NoneableDouble
    private Double trailingPE;

    @Json(name = "ForwardPE")
    @NoneableDouble
    private Double forwardPE;

    @Json(name = "PriceToSalesRatioTTM")
    @NoneableDouble
    private Double priceToSaleRatioTTM;

    @Json(name = "PriceToBookRatio")
    @NoneableDouble
    private Double priceToBookRatio;

    @Json(name = "EVToRevenue")
    @NoneableDouble
    private Double evToRevenue;

    @Json(name = "EVToEBITDA")
    @NoneableDouble
    private Double evToEBITDA;

    @Json(name = "Beta")
    @NoneableDouble
    private Double beta;

    @Json(name = "52WeekHigh")
    @NoneableDouble
    private Double fiftyTwoWeekHigh;

    @Json(name = "52WeekLow")
    @NoneableDouble
    private Double fiftyTwoWeekLow;

    @Json(name = "50DayMovingAverage")
    @NoneableDouble
    private Double fiftyDayMovingAverage;

    @Json(name = "200DayMovingAverage")
    @NoneableDouble
    private Double twoHundredDayMovingAverage;

    @Json(name = "SharesOutstanding")
    @NoneableLong
    private Long sharesOutstanding;

    @Json(name = "DividendDate")
    private String dividendDate;

    @Json(name = "ExDividendDate")
    private String exDividendDate;

    public String getSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getAssetType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getCIK() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getExchange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getCurrency() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getCountry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSector() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getIndustry() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getAddress() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFiscalYearEnd() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLatestQuarter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getMarketCapitalization() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getEBITDA() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getPERatio() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getPEGRatio() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getBookValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getDividendPerShare() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getDividendYield() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getEPS() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getRevenuePerShareTTM() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getProfitMargin() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getOperatingMarginTTM() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getReturnOnAssetsTTM() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getReturnOnEquityTTM() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getRevenueTTM() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getGrossProfitTTM() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getDilutedEpsTTM() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getQuarterlyEarningsGrowthYOY() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getQuarterlyRevenueGrowthYOY() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getAnalystTargetPrice() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getTrailingPE() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getForwardPE() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getPriceToSaleRatioTTM() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getPriceToBookRatio() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getEvToRevenue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getEvToEBITDA() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getBeta() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getFiftyTwoWeekHigh() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getFiftyTwoWeekLow() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getFiftyDayMovingAverage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getTwoHundredDayMovingAverage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Long getSharesOutstanding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDividendDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getExDividendDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
