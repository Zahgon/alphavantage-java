package com.crazzyghost.alphavantage.technicalindicator.response.aroonosc;

import com.crazzyghost.alphavantage.technicalindicator.response.PeriodicResponse;
import com.crazzyghost.alphavantage.technicalindicator.response.SimpleTechnicalIndicatorUnit;
import com.crazzyghost.alphavantage.parser.Parser;
import java.util.List;
import java.util.Map;

public class AROONOSCResponse extends PeriodicResponse {

    private AROONOSCResponse(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
        super(indicatorUnits, metaData);
    }

    private AROONOSCResponse(String errorMessage) {
        super(errorMessage);
    }

    public static AROONOSCResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class AROONOSCParser extends PeriodicParser<AROONOSCResponse> {

        @Override
        public AROONOSCResponse get(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public AROONOSCResponse get(String errorMessage) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String getTechnicalIndicatorKey() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
