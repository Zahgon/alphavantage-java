package com.crazzyghost.alphavantage.timeseries.request;

import com.crazzyghost.alphavantage.parameters.Function;

public class MonthlyRequest extends TimeSeriesRequest {

    public MonthlyRequest(Builder builder) {
        super(builder);
    }

    public static class Builder extends TimeSeriesRequest.Builder<Builder> {

        public Builder() {
            super();
            this.function(Function.TIME_SERIES_MONTHLY);
        }

        public Builder adjusted() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public MonthlyRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
