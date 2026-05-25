package com.crazzyghost.alphavantage.fundamentaldata.response;

import com.crazzyghost.alphavantage.parser.NoneableDouble;
import com.squareup.moshi.Json;

public class AnnualEarning {

    @Json(name = "fiscalDateEnding")
    private String fiscalDateEnding;

    @Json(name = "reportedEPS")
    @NoneableDouble
    private Double reportedEPS;

    public String getFiscalDateEnding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getReportedEPS() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
