package com.crazzyghost.alphavantage.forex.response;

public class MetaData {

    private String information;

    private String fromSymbol;

    private String toSymbol;

    private String lastRefreshed;

    private String interval;

    private String outputSize;

    private String timeZone;

    public MetaData(String information, String fromSymbol, String toSymbol, String lastRefreshed, String interval, String outputSize, String timeZone) {
        this.information = information;
        this.fromSymbol = fromSymbol;
        this.toSymbol = toSymbol;
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

    public String getFromSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getToSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLastRefreshed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getInterval() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getOutputSize() {
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
