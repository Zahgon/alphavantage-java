package com.crazzyghost.alphavantage.indicator.response.aroon;

public class AROONIndicatorUnit {

    private String date;

    private double aroonUp;

    private double aroonDown;

    public AROONIndicatorUnit(String date, double aroonUp, double aroonDown) {
        this.date = date;
        this.aroonUp = aroonUp;
        this.aroonDown = aroonDown;
    }

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getAroonUpValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getAroonDownValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
