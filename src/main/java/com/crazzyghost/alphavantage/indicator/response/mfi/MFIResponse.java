package com.crazzyghost.alphavantage.indicator.response.mfi;

import com.crazzyghost.alphavantage.indicator.response.PeriodicResponse;
import com.crazzyghost.alphavantage.indicator.response.SimpleIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class MFIResponse extends PeriodicResponse {

    private MFIResponse(List<SimpleIndicatorUnit> indicatorUnits, MetaData metaData) {
        super(indicatorUnits, metaData);
    }

    private MFIResponse(String errorMessage) {
        super(errorMessage);
    }

    public static MFIResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class MFIParser extends PeriodicParser<MFIResponse> {

        @Override
        public MFIResponse get(List<SimpleIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public MFIResponse get(String errorMessage) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String getIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
