package com.crazzyghost.alphavantage.indicator.response.stochrsi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.DefaultParser;
import com.crazzyghost.alphavantage.parser.Parser;

public class STOCHRSIResponse {

    private MetaData metaData;

    private List<STOCHRSIIndicatorUnit> indicatorUnits;

    private String errorMessage;

    private STOCHRSIResponse(List<STOCHRSIIndicatorUnit> indicatorUnits, MetaData metaData) {
        this.metaData = metaData;
        this.indicatorUnits = indicatorUnits;
        this.errorMessage = null;
    }

    private STOCHRSIResponse(String errorMessage) {
        this.metaData = new MetaData();
        this.indicatorUnits = new ArrayList<>();
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<STOCHRSIIndicatorUnit> getIndicatorUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static STOCHRSIResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class STOCHRSIParser extends DefaultParser<STOCHRSIResponse> {

        @Override
        public STOCHRSIResponse parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> indicatorData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public STOCHRSIResponse onParseError(String error) {
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

        private double timePeriod;

        private double fastKPeriod;

        private double fastDPeriod;

        private double fastDMaType;

        private String seriesType;

        private String timeZone;

        public MetaData(String symbol, String indicator, String lastRefreshed, String interval, double timePeriod, double fastKPeriod, double fastDPeriod, double fastDMaType, String seriesType, String timeZone) {
            this.symbol = symbol;
            this.indicator = indicator;
            this.lastRefreshed = lastRefreshed;
            this.interval = interval;
            this.timePeriod = timePeriod;
            this.fastKPeriod = fastKPeriod;
            this.fastDPeriod = fastDPeriod;
            this.fastDMaType = fastDMaType;
            this.seriesType = seriesType;
            this.timeZone = timeZone;
        }

        public MetaData() {
            this("", "", "", "", 10, 5, 3, 0, "", "");
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

        public String getSeriesType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public double getTimePeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
