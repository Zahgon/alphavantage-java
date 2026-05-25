package com.crazzyghost.alphavantage.indicator.response.mama;

public class MAMAIndicatorUnit {

    private String date;

    private double famaValue;

    private double mamaValue;

    public MAMAIndicatorUnit(String date, double fama, double mama) {
        this.date = date;
        this.famaValue = fama;
        this.mamaValue = mama;
    }

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getFamaValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getMamaValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
