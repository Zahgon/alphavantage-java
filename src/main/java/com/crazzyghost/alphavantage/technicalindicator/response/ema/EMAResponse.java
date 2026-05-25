package com.crazzyghost.alphavantage.technicalindicator.response.ema;

import com.crazzyghost.alphavantage.technicalindicator.response.PeriodicSeriesResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.SimpleTechnicalIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class EMAResponse extends PeriodicSeriesResponse {

    private EMAResponse(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
        super(indicatorUnits, metaData);
    }

    private EMAResponse(String errorMessage) {
        super(errorMessage);
    }

    public static EMAResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class EMAResponseParser extends PeriodicSeriesParser<EMAResponse> {

        @Override
        public EMAResponse get(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public EMAResponse get(String errorMessage) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        protected String getTechnicalIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
