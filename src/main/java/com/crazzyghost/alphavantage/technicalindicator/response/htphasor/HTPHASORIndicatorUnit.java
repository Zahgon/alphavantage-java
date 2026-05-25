package com.crazzyghost.alphavantage.technicalindicator.response.htphasor;

public class HTPHASORIndicatorUnit {

    private String date;

    private double phaseValue;

    private double quadratureValue;

    public HTPHASORIndicatorUnit(String date, double leadSine, double sine) {
        this.date = date;
        this.phaseValue = leadSine;
        this.quadratureValue = sine;
    }

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getPhaseValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getQuadratureValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
