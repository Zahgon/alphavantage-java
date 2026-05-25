package com.crazzyghost.alphavantage.technicalindicator.response;

import com.crazzyghost.alphavantage.parser.DefaultParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class PriceOscillatorResponse {

    protected MetaData metaData;

    protected List<SimpleTechnicalIndicatorUnit> indicatorUnits;

    protected String errorMessage;

    protected PriceOscillatorResponse(List<SimpleTechnicalIndicatorUnit> indicatorUnits, MetaData metaData) {
        this.metaData = metaData;
        this.indicatorUnits = indicatorUnits;
        this.errorMessage = null;
    }

    protected PriceOscillatorResponse(String errorMessage) {
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

    public static abstract class PriceOscillatorParser<T> extends DefaultParser<T> {

        public PriceOscillatorParser() {
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

        private int fastPeriod;

        private int slowPeriod;

        private int maType;

        private String seriesType;

        private String timeZone;

        public MetaData() {
            this("", "", "", "", 0, 0, 0, "", "");
        }

        public MetaData(String symbol, String indicator, String lastRefreshed, String interval, int fastPeriod, int slowPeriod, int maType, String seriesType, String timeZone) {
            this.symbol = symbol;
            this.indicator = indicator;
            this.lastRefreshed = lastRefreshed;
            this.interval = interval;
            this.fastPeriod = fastPeriod;
            this.slowPeriod = slowPeriod;
            this.maType = maType;
            this.seriesType = seriesType;
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

        public int getFastPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getSlowPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getMaType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getSeriesType() {
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
