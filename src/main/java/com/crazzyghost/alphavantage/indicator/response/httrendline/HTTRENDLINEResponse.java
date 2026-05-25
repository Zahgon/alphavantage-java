package com.crazzyghost.alphavantage.indicator.response.httrendline;

import com.crazzyghost.alphavantage.indicator.response.SeriesResponse;
import com.crazzyghost.alphavantage.indicator.response.SimpleIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class HTTRENDLINEResponse extends SeriesResponse {

    private HTTRENDLINEResponse(List<SimpleIndicatorUnit> indicatorUnits, MetaData metaData) {
        super(indicatorUnits, metaData);
    }

    private HTTRENDLINEResponse(String errorMessage) {
        super(errorMessage);
    }

    public static HTTRENDLINEResponse of(Map<String, Object> data) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class HTTRENDLINEParser extends SeriesParser<HTTRENDLINEResponse> {

        @Override
        public HTTRENDLINEResponse get(List<SimpleIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public HTTRENDLINEResponse get(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String getIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
