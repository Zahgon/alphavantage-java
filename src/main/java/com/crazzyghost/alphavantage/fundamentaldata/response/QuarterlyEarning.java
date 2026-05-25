package com.crazzyghost.alphavantage.fundamentaldata.response;

import com.crazzyghost.alphavantage.parser.NoneableDouble;
import com.squareup.moshi.Json;

public class QuarterlyEarning {

    @Json(name = "fiscalDateEnding")
    private String fiscalDateEnding;

    @Json(name = "reportedDate")
    private String reportedDate;

    @Json(name = "reportedEPS")
    @NoneableDouble
    private Double reportedEPS;

    @Json(name = "estimatedEPS")
    @NoneableDouble
    private Double estimatedEPS;

    @Json(name = "surprise")
    @NoneableDouble
    private Double surprise;

    @Json(name = "surprisePercentage")
    @NoneableDouble
    private Double surprisePercentage;

    public String getFiscalDateEnding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getReportedDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getReportedEPS() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getEstimatedEPS() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getSurprise() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getSurprisePercentage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
