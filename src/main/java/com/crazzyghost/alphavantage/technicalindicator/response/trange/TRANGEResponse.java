package com.crazzyghost.alphavantage.technicalindicator.response.trange;

import com.crazzyghost.alphavantage.technicalindicator.response.SimpleTechnicalIndicatorResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.SimpleTechnicalIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class TRANGEResponse extends SimpleTechnicalIndicatorResponse {

    private TRANGEResponse(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
        super(indicatorUnits, metaData);
    }

    private TRANGEResponse(String errorMessage) {
        super(errorMessage);
    }

    public static SimpleTechnicalIndicatorResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class TRANGEParser extends SimpleTechnicalIndicatorParser<TRANGEResponse> {

        @Override
        public TRANGEResponse get(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public TRANGEResponse get(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String getTechnicalIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
