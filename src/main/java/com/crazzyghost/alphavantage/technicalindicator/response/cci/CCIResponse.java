package com.crazzyghost.alphavantage.technicalindicator.response.cci;

import com.crazzyghost.alphavantage.technicalindicator.response.PeriodicResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.SimpleTechnicalIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class CCIResponse extends PeriodicResponse {

    private CCIResponse(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
        super(indicatorUnits, metaData);
    }

    private CCIResponse(String errorMessage) {
        super(errorMessage);
    }

    public static CCIResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class CCIParser extends PeriodicParser<CCIResponse> {

        @Override
        public CCIResponse get(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public CCIResponse get(String errorMessage) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String getTechnicalIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
