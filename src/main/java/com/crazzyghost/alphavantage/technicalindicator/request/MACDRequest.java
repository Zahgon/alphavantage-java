package com.crazzyghost.alphavantage.technicalindicator.request;

import com.crazzyghost.alphavantage.parameters.Function;
import com.crazzyghost.alphavantage.parameters.SeriesType;

public class MACDRequest extends TechnicalIndicatorRequest {

    private SeriesType series_type;

    private int fastPeriod;

    private int slowPeriod;

    private int signalPeriod;

    private MACDRequest(Builder builder) {
        super(builder);
        this.fastPeriod = builder.fastPeriod;
        this.slowPeriod = builder.slowPeriod;
        this.signalPeriod = builder.signalPeriod;
        this.series_type = builder.seriesType;
    }

    public static class Builder extends TechnicalIndicatorRequest.Builder<Builder> {

        private int fastPeriod = 12;

        private int slowPeriod = 26;

        private int signalPeriod = 9;

        private SeriesType seriesType;

        public Builder() {
            this.function(Function.MACD);
        }

        public Builder fastPeriod(int fastPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder slowPeriod(int slowPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder signalPeriod(int signalPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder seriesType(SeriesType seriesType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public TechnicalIndicatorRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
