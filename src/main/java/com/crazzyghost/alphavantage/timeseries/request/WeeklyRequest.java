package com.crazzyghost.alphavantage.timeseries.request;

import com.crazzyghost.alphavantage.parameters.Function;

public class WeeklyRequest extends TimeSeriesRequest {

    public WeeklyRequest(Builder builder) {
        super(builder);
    }

    public static class Builder extends TimeSeriesRequest.Builder<Builder> {

        public Builder() {
            super();
            this.function(Function.TIME_SERIES_WEEKLY);
        }

        public Builder adjusted() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public WeeklyRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
