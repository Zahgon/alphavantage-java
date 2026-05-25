package com.crazzyghost.alphavantage.indicator.response.mama;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.DefaultParser;
import com.crazzyghost.alphavantage.parser.Parser;

public class MAMAResponse {

    private MetaData metaData;

    private List<MAMAIndicatorUnit> indicatorUnits;

    private String errorMessage;

    private MAMAResponse(List<MAMAIndicatorUnit> indicatorUnits, MetaData metaData) {
        this.metaData = metaData;
        this.indicatorUnits = indicatorUnits;
        this.errorMessage = null;
    }

    private MAMAResponse(String errorMessage) {
        this.metaData = new MetaData();
        this.indicatorUnits = new ArrayList<>();
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<MAMAIndicatorUnit> getIndicatorUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static MAMAResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class MAMAParser extends DefaultParser<MAMAResponse> {

        @Override
        public MAMAResponse parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> indicatorData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public MAMAResponse onParseError(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
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

        private double fastLimit;

        private double slowLimit;

        private String timeZone;

        private String seriesType;

        public MetaData(String symbol, String indicator, String lastRefreshed, String interval, double fastLimit, double slowLimit, String seriesType, String timeZone) {
            this.symbol = symbol;
            this.indicator = indicator;
            this.lastRefreshed = lastRefreshed;
            this.interval = interval;
            this.fastLimit = fastLimit;
            this.slowLimit = slowLimit;
            this.timeZone = timeZone;
            this.seriesType = seriesType;
        }

        public MetaData() {
            this("", "", "", "", 0.1, 0.1, "", "");
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

        public double getFastLimit() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getSlowLimit() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
