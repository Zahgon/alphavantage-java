package com.crazzyghost.alphavantage.indicator.response.htsine;

public class HTSINEIndicatorUnit {

    private String date;

    private double leadSineValue;

    private double sineValue;

    public HTSINEIndicatorUnit(String date, double leadSine, double sine) {
        this.date = date;
        this.leadSineValue = leadSine;
        this.sineValue = sine;
    }

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getLeadSineValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getSineValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
