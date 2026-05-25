package com.crazzyghost.alphavantage.indicator.request;

import com.crazzyghost.alphavantage.parameters.Function;

public class SARRequest extends IndicatorRequest {

    private double acceleration;

    private double maximum;

    private SARRequest(Builder builder) {
        super(builder);
        this.acceleration = builder.acceleration;
        this.maximum = builder.maximum;
    }

    public static class Builder extends IndicatorRequest.Builder<Builder> {

        private double acceleration = 0.01;

        private double maximum = 0.20;

        public Builder() {
            this.function(Function.SAR);
        }

        public Builder acceleration(double acceleration) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder maximum(double maximum) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public IndicatorRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
