package com.crazzyghost.alphavantage.timeseries.request;

import com.crazzyghost.alphavantage.parameters.Function;
import com.crazzyghost.alphavantage.parameters.OutputSize;

public class DailyRequest extends TimeSeriesRequest {

    private OutputSize outputSize;

    private DailyRequest(Builder builder) {
        super(builder);
        this.outputSize = builder.outputSize;
    }

    public static class Builder extends TimeSeriesRequest.Builder<Builder> {

        Function function;

        OutputSize outputSize = OutputSize.COMPACT;

        public Builder() {
            super();
            this.function(Function.TIME_SERIES_DAILY);
        }

        public Builder adjusted() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder outputSize(OutputSize outputSize) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public DailyRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
