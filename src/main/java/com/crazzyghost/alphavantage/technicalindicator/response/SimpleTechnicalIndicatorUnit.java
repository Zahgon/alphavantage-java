package com.crazzyghost.alphavantage.technicalindicator.response;

public class SimpleTechnicalIndicatorUnit {

    String date;

    Double value;

    String indicatorKey;

    public SimpleTechnicalIndicatorUnit(String date, Double value) {
        this.date = date;
        this.value = value;
    }

    public SimpleTechnicalIndicatorUnit(String date, Double value, String indicatorKey) {
        this(date, value);
        this.indicatorKey = indicatorKey;
    }

    public String getDate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
