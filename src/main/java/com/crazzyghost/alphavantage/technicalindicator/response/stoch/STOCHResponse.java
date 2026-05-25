package com.crazzyghost.alphavantage.technicalindicator.response.stoch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.DefaultParser;
import com.crazzyghost.alphavantage.parser.Parser;

public class STOCHResponse {

    private MetaData metaData;

    private List<STOCHIndicatorUnit> indicatorUnits;

    private String errorMessage;

    private STOCHResponse(List<STOCHIndicatorUnit> indicatorUnits, MetaData metaData) {
        this.metaData = metaData;
        this.indicatorUnits = indicatorUnits;
        this.errorMessage = null;
    }

    private STOCHResponse(String errorMessage) {
        this.metaData = new MetaData();
        this.indicatorUnits = new ArrayList<>();
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<STOCHIndicatorUnit> getIndicatorUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static STOCHResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class STOCHParser extends DefaultParser<STOCHResponse> {

        @Override
        public STOCHResponse parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> indicatorData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public STOCHResponse onParseError(String error) {
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

        private double slowKPeriod;

        private double slowKMaType;

        private double slowDPeriod;

        private double slowDMaType;

        private String timeZone;

        public MetaData(String symbol, String indicator, String lastRefreshed, String interval, double fastKPeriod, double slowKPeriod, double slowKMaType, double slowDPeriod, double slowDMaType, String timeZone) {
            this.symbol = symbol;
            this.indicator = indicator;
            this.lastRefreshed = lastRefreshed;
            this.interval = interval;
            this.fastKPeriod = fastKPeriod;
            this.slowKPeriod = slowKPeriod;
            this.slowKMaType = slowKMaType;
            this.slowDPeriod = slowDPeriod;
            this.slowDMaType = slowDMaType;
            this.timeZone = timeZone;
        }

        public MetaData() {
            this("", "", "", "", 5, 3, 0, 3, 0, "");
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

        public double getFastKPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getSlowKPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getSlowKMaType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getSlowDPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getSlowDMaType() {
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
