package com.crazzyghost.alphavantage.technicalindicator.response.macd;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.DefaultParser;
import com.crazzyghost.alphavantage.parser.Parser;

public class MACDEXTResponse {

    private MetaData metaData;

    private List<MACDIndicatorUnit> indicatorUnits;

    private String errorMessage;

    private MACDEXTResponse(List<MACDIndicatorUnit> indicatorUnits, MetaData metaData) {
        this.metaData = metaData;
        this.indicatorUnits = indicatorUnits;
        this.errorMessage = null;
    }

    private MACDEXTResponse(String errorMessage) {
        this.metaData = new MetaData();
        this.indicatorUnits = new ArrayList<>();
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<MACDIndicatorUnit> getIndicatorUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static MACDEXTResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class MACDEXTParser extends DefaultParser<MACDEXTResponse> {

        @Override
        public MACDEXTResponse parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> indicatorData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public MACDEXTResponse onParseError(String error) {
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

        private double fastPeriod;

        private double slowPeriod;

        private double signalPeriod;

        private double fastMaType;

        private double slowMaType;

        private double signalMaType;

        private String timeZone;

        private String seriesType;

        public MetaData(String symbol, String indicator, String lastRefreshed, String interval, double fastPeriod, double slowPeriod, double signalPeriod, double fastMaType, double slowMaType, double signalMaType, String seriesType, String timeZone) {
            this.symbol = symbol;
            this.indicator = indicator;
            this.lastRefreshed = lastRefreshed;
            this.interval = interval;
            this.fastPeriod = fastPeriod;
            this.slowPeriod = slowPeriod;
            this.signalPeriod = signalPeriod;
            this.fastMaType = fastMaType;
            this.slowMaType = slowMaType;
            this.signalMaType = signalMaType;
            this.seriesType = seriesType;
            this.timeZone = timeZone;
        }

        public MetaData() {
            this("", "", "", "", 12, 26, 9, 0, 0, 0, "", "");
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

        public double getFastPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getSlowPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getSignalPeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getFastMaType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getSlowMaType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getSignalMaType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
