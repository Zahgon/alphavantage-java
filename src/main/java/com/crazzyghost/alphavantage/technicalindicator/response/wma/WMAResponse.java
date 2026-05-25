package com.crazzyghost.alphavantage.technicalindicator.response.wma;

import com.crazzyghost.alphavantage.technicalindicator.response.PeriodicSeriesResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.SimpleTechnicalIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class WMAResponse extends PeriodicSeriesResponse {

    private WMAResponse(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
        super(indicatorUnits, metaData);
    }

    private WMAResponse(String errorMessage) {
        super(errorMessage);
    }

    public static WMAResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class WMAResponseParser extends PeriodicSeriesParser<WMAResponse> {

        @Override
        public WMAResponse get(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public WMAResponse get(String errorMessage) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        protected String getTechnicalIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
