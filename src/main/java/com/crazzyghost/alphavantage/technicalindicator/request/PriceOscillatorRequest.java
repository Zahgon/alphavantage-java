package com.crazzyghost.alphavantage.technicalindicator.request;

import com.crazzyghost.alphavantage.parameters.MAType;
import com.crazzyghost.alphavantage.parameters.SeriesType;

public class PriceOscillatorRequest extends TechnicalIndicatorRequest {

    private SeriesType series_type;

    private int fastPeriod;

    private int slowPeriod;

    private MAType maType;

    private PriceOscillatorRequest(Builder builder) {
        super(builder);
        this.fastPeriod = builder.fastPeriod;
        this.slowPeriod = builder.slowPeriod;
        this.maType = builder.maType;
        this.series_type = builder.seriesType;
    }

    public static class Builder extends TechnicalIndicatorRequest.Builder<Builder> {

        private int fastPeriod = 12;

        private int slowPeriod = 26;

        private MAType maType = MAType.SMA;

        private SeriesType seriesType;

        public Builder fastPeriod(int fastPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder slowPeriod(int slowPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder seriesType(SeriesType seriesType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder maType(MAType maType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public TechnicalIndicatorRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
