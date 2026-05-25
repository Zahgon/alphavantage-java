package com.crazzyghost.alphavantage.forex.response;

public class ForexUnit {

    private double open;

    private double high;

    private double low;

    private double close;

    private String date;

    private ForexUnit(Builder builder) {
        this.open = builder.open;
        this.high = builder.high;
        this.low = builder.low;
        this.close = builder.close;
        this.date = builder.date;
    }

    public static class Builder {

        double open;

        double high;

        double low;

        double close;

        String date;

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

        public Builder date(String date) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public ForexUnit build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
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

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
