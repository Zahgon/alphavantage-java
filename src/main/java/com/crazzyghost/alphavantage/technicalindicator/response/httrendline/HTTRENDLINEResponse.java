package com.crazzyghost.alphavantage.technicalindicator.response.httrendline;

import com.crazzyghost.alphavantage.technicalindicator.response.SeriesResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.SimpleTechnicalIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class HTTRENDLINEResponse extends SeriesResponse {

    private HTTRENDLINEResponse(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
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
        public HTTRENDLINEResponse get(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public HTTRENDLINEResponse get(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String getTechnicalIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
