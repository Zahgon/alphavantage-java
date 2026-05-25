package com.crazzyghost.alphavantage.technicalindicator.request;

import com.crazzyghost.alphavantage.parameters.Function;
import com.crazzyghost.alphavantage.parameters.MAType;
import com.crazzyghost.alphavantage.parameters.SeriesType;

public class BBANDSRequest extends TechnicalIndicatorRequest {

    private SeriesType series_type;

    private int time_period;

    private int nbdevup;

    private int nbdevdn;

    private MAType maType;

    private BBANDSRequest(Builder builder) {
        super(builder);
        this.time_period = builder.timePeriod;
        this.series_type = builder.seriesType;
        this.nbdevdn = builder.nbdevdn;
        this.nbdevup = builder.nbdevup;
        this.maType = builder.maType;
    }

    public static class Builder extends TechnicalIndicatorRequest.Builder<Builder> {

        private SeriesType seriesType;

        private int timePeriod;

        private int nbdevup = 2;

        private int nbdevdn = 2;

        private MAType maType = MAType.SMA;

        public Builder() {
            this.function(Function.BBANDS);
        }

        public Builder timePeriod(int timePeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder seriesType(SeriesType seriesType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder nbdevup(int nbdevup) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder nbdevdn(int nbdevdn) {
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
