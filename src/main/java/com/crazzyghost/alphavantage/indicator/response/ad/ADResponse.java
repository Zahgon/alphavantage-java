package com.crazzyghost.alphavantage.indicator.response.ad;

import com.crazzyghost.alphavantage.indicator.response.SimpleIndicatorResponse;
import com.crazzyghost.alphavantage.indicator.response.SimpleIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class ADResponse extends SimpleIndicatorResponse {

    private ADResponse(List<SimpleIndicatorUnit> indicatorUnits, MetaData metaData) {
        super(indicatorUnits, metaData);
    }

    private ADResponse(String errorMessage) {
        super(errorMessage);
    }

    public static SimpleIndicatorResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class ADParser extends SimpleIndicatorParser<ADResponse> {

        @Override
        public ADResponse get(List<SimpleIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public ADResponse get(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String getIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
