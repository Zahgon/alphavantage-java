package com.crazzyghost.alphavantage.indicator.response.dx;

import com.crazzyghost.alphavantage.indicator.response.PeriodicResponse;
import com.crazzyghost.alphavantage.indicator.response.SimpleIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class DXResponse extends PeriodicResponse {

    private DXResponse(List<SimpleIndicatorUnit> indicatorUnits, MetaData metaData) {
        super(indicatorUnits, metaData);
    }

    private DXResponse(String errorMessage) {
        super(errorMessage);
    }

    public static DXResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class DXParser extends PeriodicParser<DXResponse> {

        @Override
        public DXResponse get(List<SimpleIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public DXResponse get(String errorMessage) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String getIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
