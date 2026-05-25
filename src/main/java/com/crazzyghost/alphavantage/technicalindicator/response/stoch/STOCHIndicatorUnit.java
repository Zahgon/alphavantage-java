package com.crazzyghost.alphavantage.technicalindicator.response.stoch;

public class STOCHIndicatorUnit {

    private String date;

    private double slowKValue;

    private double slowDValue;

    public STOCHIndicatorUnit(String date, double slowK, double slowD) {
        this.date = date;
        this.slowKValue = slowK;
        this.slowDValue = slowD;
    }

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getSlowKValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getSlowDValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
