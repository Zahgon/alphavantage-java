package com.crazzyghost.alphavantage.technicalindicator.response.roc;

import com.crazzyghost.alphavantage.technicalindicator.response.PeriodicSeriesResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.SimpleTechnicalIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class ROCResponse extends PeriodicSeriesResponse {

    private ROCResponse(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
        super(indicatorUnits, metaData);
    }

    private ROCResponse(String errorMessage) {
        super(errorMessage);
    }

    public static ROCResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class ROCResponseParser extends PeriodicSeriesParser<ROCResponse> {

        @Override
        public ROCResponse get(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public ROCResponse get(String errorMessage) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        protected String getTechnicalIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
