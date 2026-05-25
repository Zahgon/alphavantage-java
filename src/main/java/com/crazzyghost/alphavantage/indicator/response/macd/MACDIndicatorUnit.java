package com.crazzyghost.alphavantage.indicator.response.macd;

public class MACDIndicatorUnit {

    private String date;

    private double macdHistValue;

    private double macdSignalValue;

    private double macdValue;

    public MACDIndicatorUnit(String date, double macdHistValue, double macdSignalValue, double macdValue) {
        this.date = date;
        this.macdHistValue = macdHistValue;
        this.macdSignalValue = macdSignalValue;
        this.macdValue = macdValue;
    }

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getMacdHistValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getMacdSignalValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getMacdValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
