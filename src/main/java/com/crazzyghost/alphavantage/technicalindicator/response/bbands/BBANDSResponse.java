package com.crazzyghost.alphavantage.technicalindicator.response.bbands;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.DefaultParser;
import com.crazzyghost.alphavantage.parser.Parser;

public class BBANDSResponse {

    private MetaData metaData;

    private List<BBANDSIndicatorUnit> indicatorUnits;

    private String errorMessage;

    private BBANDSResponse(List<BBANDSIndicatorUnit> indicatorUnits, MetaData metaData) {
        this.metaData = metaData;
        this.indicatorUnits = indicatorUnits;
        this.errorMessage = null;
    }

    private BBANDSResponse(String errorMessage) {
        this.metaData = new MetaData();
        this.indicatorUnits = new ArrayList<>();
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<BBANDSIndicatorUnit> getIndicatorUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static BBANDSResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class BBANDSParser extends DefaultParser<BBANDSResponse> {

        @Override
        public BBANDSResponse parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> indicatorData) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public BBANDSResponse onParseError(String error) {
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

        private int timePeriod;

        private int nbdevup;

        private int nbdevdn;

        private int maType;

        private String seriesType;

        private String timeZone;

        public MetaData() {
            this("", "", "", "", 0, 0, 0, 0, "", "");
        }

        public MetaData(String symbol, String indicator, String lastRefreshed, String interval, int timePeriod, int nbdevup, int nbdevdn, int maType, String seriesType, String timeZone) {
            this.symbol = symbol;
            this.indicator = indicator;
            this.lastRefreshed = lastRefreshed;
            this.interval = interval;
            this.timePeriod = timePeriod;
            this.nbdevup = nbdevup;
            this.nbdevdn = nbdevdn;
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

        public String getTimeZone() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getSeriesType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getTimePeriod() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getMaType() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getNbdevup() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public int getNbdevdn() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
