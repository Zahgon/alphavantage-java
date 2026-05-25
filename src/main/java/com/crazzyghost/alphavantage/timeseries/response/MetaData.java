package com.crazzyghost.alphavantage.timeseries.response;

public class MetaData {

    private String information;

    private String symbol;

    private String lastRefreshed;

    private String timeZone;

    private String interval;

    private String outputSize;

    public MetaData(String information, String symbol, String lastRefreshed, String interval, String outputSize, String timeZone) {
        this.information = information;
        this.symbol = symbol;
        this.lastRefreshed = lastRefreshed;
        this.interval = interval;
        this.outputSize = outputSize;
        this.timeZone = timeZone;
    }

    public static MetaData empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getInformation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLastRefreshed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTimeZone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getOutputSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getInterval() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
