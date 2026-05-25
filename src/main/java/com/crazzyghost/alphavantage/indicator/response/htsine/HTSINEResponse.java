package com.crazzyghost.alphavantage.indicator.response.htsine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.DefaultParser;
import com.crazzyghost.alphavantage.parser.Parser;

public class HTSINEResponse {

    private MetaData metaData;

    private List<HTSINEIndicatorUnit> indicatorUnits;

    private String errorMessage;

    private HTSINEResponse(List<HTSINEIndicatorUnit> indicatorUnits, MetaData metaData) {
        this.metaData = metaData;
        this.indicatorUnits = indicatorUnits;
        this.errorMessage = null;
    }

    private HTSINEResponse(String errorMessage) {
        this.metaData = new MetaData();
        this.indicatorUnits = new ArrayList<>();
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<HTSINEIndicatorUnit> getIndicatorUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static HTSINEResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class HTSINEParser extends DefaultParser<HTSINEResponse> {

        @Override
        public HTSINEResponse parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> indicatorData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public HTSINEResponse onParseError(String error) {
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

        private String seriesType;

        private String timeZone;

        public MetaData() {
            this("", "", "", "", "", "");
        }

        public MetaData(String symbol, String indicator, String lastRefreshed, String interval, String seriesType, String timeZone) {
            this.symbol = symbol;
            this.indicator = indicator;
            this.lastRefreshed = lastRefreshed;
            this.interval = interval;
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

        public String getTimeZone() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getSeriesType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
