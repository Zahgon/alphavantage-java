package com.crazzyghost.alphavantage.indicator.response;

import com.crazzyghost.alphavantage.parser.DefaultParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class PeriodicSeriesResponse {

    protected MetaData metaData;

    protected List<SimpleIndicatorUnit> indicatorUnits;

    protected String errorMessage;

    protected PeriodicSeriesResponse(List<SimpleIndicatorUnit> indicatorUnits, MetaData metaData) {
        this.metaData = metaData;
        this.indicatorUnits = indicatorUnits;
        this.errorMessage = null;
    }

    protected PeriodicSeriesResponse(String errorMessage) {
        this.metaData = new MetaData();
        this.indicatorUnits = new ArrayList<>();
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<SimpleIndicatorUnit> getIndicatorUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static abstract class PeriodicSeriesParser<T> extends DefaultParser<T> {

        protected PeriodicSeriesParser() {
        }

        @Override
        public T parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> indicatorData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public T onParseError(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        protected abstract T get(List<SimpleIndicatorUnit> indicatorUnits, MetaData metaData);

        protected abstract T get(String error);

        protected abstract String getIndicatorKey();
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

        private String seriesType;

        private int timePeriod;

        public MetaData() {
            this("", "", "", "", "", "", 0);
        }

        public MetaData(String symbol, String indicator, String lastRefreshed, String interval, String timeZone, String seriesType, int timePeriod) {
            this.symbol = symbol;
            this.indicator = indicator;
            this.lastRefreshed = lastRefreshed;
            this.interval = interval;
            this.timeZone = timeZone;
            this.seriesType = seriesType;
            this.timePeriod = timePeriod;
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

        public String getSeriesType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getTimePeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
