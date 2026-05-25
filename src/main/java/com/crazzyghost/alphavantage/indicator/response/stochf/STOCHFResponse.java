package com.crazzyghost.alphavantage.indicator.response.stochf;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.DefaultParser;
import com.crazzyghost.alphavantage.parser.Parser;

public class STOCHFResponse {

    private MetaData metaData;

    private List<STOCHFIndicatorUnit> indicatorUnits;

    private String errorMessage;

    private STOCHFResponse(List<STOCHFIndicatorUnit> indicatorUnits, MetaData metaData) {
        this.metaData = metaData;
        this.indicatorUnits = indicatorUnits;
        this.errorMessage = null;
    }

    private STOCHFResponse(String errorMessage) {
        this.metaData = new MetaData();
        this.indicatorUnits = new ArrayList<>();
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<STOCHFIndicatorUnit> getIndicatorUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static STOCHFResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class STOCHFParser extends DefaultParser<STOCHFResponse> {

        @Override
        public STOCHFResponse parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> indicatorData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public STOCHFResponse onParseError(String error) {
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

        private double fastKPeriod;

        private double fastDPeriod;

        private double fastDMaType;

        private String timeZone;

        public MetaData(String symbol, String indicator, String lastRefreshed, String interval, double fastKPeriod, double fastDPeriod, double fastDMaType, String timeZone) {
            this.symbol = symbol;
            this.indicator = indicator;
            this.lastRefreshed = lastRefreshed;
            this.interval = interval;
            this.fastKPeriod = fastKPeriod;
            this.fastDPeriod = fastDPeriod;
            this.fastDMaType = fastDMaType;
            this.timeZone = timeZone;
        }

        public MetaData() {
            this("", "", "", "", 5, 3, 0, "");
        }

        public double getFastDMaType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getFastDPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getFastKPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getIndicator() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getInterval() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getLastRefreshed() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getSymbol() {
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
