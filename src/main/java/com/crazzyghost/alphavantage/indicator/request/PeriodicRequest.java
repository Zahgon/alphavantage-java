package com.crazzyghost.alphavantage.indicator.request;

public class PeriodicRequest extends IndicatorRequest {

    private int time_period;

    private PeriodicRequest(Builder builder) {
        super(builder);
        this.time_period = builder.timePeriod;
    }

    public static class Builder extends IndicatorRequest.Builder<Builder> {

        private int timePeriod = 60;

        public Builder timePeriod(int timePeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public IndicatorRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
