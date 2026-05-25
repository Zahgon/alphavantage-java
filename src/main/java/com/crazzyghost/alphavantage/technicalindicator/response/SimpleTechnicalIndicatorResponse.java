package com.crazzyghost.alphavantage.technicalindicator.response;

import com.crazzyghost.alphavantage.parser.DefaultParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class SimpleTechnicalIndicatorResponse {

    protected MetaData metaData;

    protected List<SimpleTechnicalIndicatorUnit> indicatorUnits;

    protected String errorMessage;

    protected SimpleTechnicalIndicatorResponse(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
        this.metaData = metaData;
        this.indicatorUnits = indicatorUnits;
        this.errorMessage = null;
    }

    protected SimpleTechnicalIndicatorResponse(String errorMessage) {
        this.metaData = new MetaData();
        this.indicatorUnits = new ArrayList<>();
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<SimpleTechnicalIndicatorUnit> getIndicatorUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // public static SimpleTechnicalIndicatorResponse of(Map<String, Object>
    // stringObjectMap,
    // String indicatorKey) {
    // Parser<SimpleTechnicalIndicatorResponse> parser = new
    // SimpleTechnicalIndicatorParser(indicatorKey);
    // return parser.parse(stringObjectMap);
    // }
    public static abstract class SimpleTechnicalIndicatorParser<T> extends DefaultParser<T> {

        protected SimpleTechnicalIndicatorParser() {
        }

        @Override
        public T parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> indicatorData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public T onParseError(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public abstract T get(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData);

        public abstract T get(String error);

        public abstract String getTechnicalIndicatorKey();
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class MetaData {

        private String symbol;

        private String indicator;

        private String lastRefreshed;

        private String interval;

        private String timeZone;

        public MetaData() {
            this("", "", "", "", "");
        }

        public MetaData(String symbol, String indicator, String lastRefreshed, String interval, String timeZone) {
            this.symbol = symbol;
            this.indicator = indicator;
            this.lastRefreshed = lastRefreshed;
            this.interval = interval;
            this.timeZone = timeZone;
        }

        public String getSymbol() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getIndicator() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getLastRefreshed() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getInterval() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getTimeZone() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
