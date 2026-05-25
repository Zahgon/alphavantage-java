package com.crazzyghost.alphavantage.technicalindicator.response.bbands;

public class BBANDSIndicatorUnit {

    private String date;

    private double realUpperBandValue;

    private double realLowerBandValue;

    private double realMiddleBandValue;

    public BBANDSIndicatorUnit(String date, double realUpperBandValue, double realLowerBandValue, double realMiddleBandValue) {
        this.date = date;
        this.realUpperBandValue = realUpperBandValue;
        this.realLowerBandValue = realLowerBandValue;
        this.realMiddleBandValue = realMiddleBandValue;
    }

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getRealUpperBandValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getRealLowerBandValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getRealMiddleBandValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
