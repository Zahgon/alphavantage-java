package com.crazzyghost.alphavantage.technicalindicator.response.stochrsi;

public class STOCHRSIIndicatorUnit {

    private String date;

    private double fastKValue;

    private double fastDValue;

    public STOCHRSIIndicatorUnit(String date, double fastK, double fastD) {
        this.date = date;
        this.fastKValue = fastK;
        this.fastDValue = fastD;
    }

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getFastKValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getFastDValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
