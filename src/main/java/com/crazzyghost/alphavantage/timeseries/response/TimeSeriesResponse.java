package com.crazzyghost.alphavantage.timeseries.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.DefaultParser;
import com.crazzyghost.alphavantage.parser.Parser;

public class TimeSeriesResponse {

    private final MetaData metaData;

    private final List<StockUnit> stockUnits;

    private final String errorMessage;

    private TimeSeriesResponse(MetaData metaData, List<StockUnit> stockUnits) {
        this.metaData = metaData;
        this.stockUnits = stockUnits;
        this.errorMessage = null;
    }

    private TimeSeriesResponse(String errorMessage) {
        this.errorMessage = errorMessage;
        this.stockUnits = new ArrayList<>();
        this.metaData = MetaData.empty();
    }

    public static TimeSeriesResponse of(Map<String, Object> stringObjectMap, boolean adjusted) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<StockUnit> getStockUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class TimeSeriesParser extends DefaultParser<TimeSeriesResponse> {

        private boolean adjusted;

        public TimeSeriesParser(boolean adjusted) {
            this.adjusted = adjusted;
        }

        @Override
        public TimeSeriesResponse parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> dataMap) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public TimeSeriesResponse onParseError(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
