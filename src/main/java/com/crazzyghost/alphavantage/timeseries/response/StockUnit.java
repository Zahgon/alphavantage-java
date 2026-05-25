package com.crazzyghost.alphavantage.timeseries.response;

public class StockUnit {

    private final double open;

    private final double high;

    private final double low;

    private final double close;

    private final double adjustedClose;

    private final long volume;

    private final double dividendAmount;

    private final double splitCoefficient;

    private final String dateTime;

    private StockUnit(Builder builder) {
        this.open = builder.open;
        this.high = builder.high;
        this.low = builder.low;
        this.close = builder.close;
        this.adjustedClose = builder.adjustedClose;
        this.volume = builder.volume;
        this.dividendAmount = builder.dividendAmount;
        this.splitCoefficient = builder.splitCoefficient;
        this.dateTime = builder.dateTime;
    }

    public static class Builder {

        double open;

        double high;

        double low;

        double close;

        double adjustedClose;

        long volume;

        double dividendAmount;

        double splitCoefficient;

        String dateTime;

        public Builder open(double open) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder high(double high) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder low(double low) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder close(double close) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder adjustedClose(double close) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder dividendAmount(double dividendAmount) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder volume(long volume) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder splitCoefficient(double splitCoefficient) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder time(String dateTime) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public StockUnit build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public double getOpen() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getHigh() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getLow() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getClose() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getAdjustedClose() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public long getVolume() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getDividendAmount() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getSplitCoefficient() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
