package com.crazzyghost.alphavantage.timeseries.request;

import com.crazzyghost.alphavantage.parameters.Function;
import com.crazzyghost.alphavantage.parameters.Interval;
import com.crazzyghost.alphavantage.parameters.OutputSize;

public class IntraDayRequest extends TimeSeriesRequest {

    private Interval interval;

    private OutputSize outputSize;

    private boolean adjusted;

    private boolean extended_hours;

    private String month;

    private IntraDayRequest(Builder builder) {
        super(builder);
        this.interval = builder.interval;
        this.outputSize = builder.outputSize;
        this.adjusted = builder.adjusted;
        this.extended_hours = builder.extendedHours;
        this.month = builder.month;
    }

    public static class Builder extends TimeSeriesRequest.Builder<Builder> {

        private Interval interval = Interval.ONE_MIN;

        private OutputSize outputSize = OutputSize.COMPACT;

        private boolean adjusted = false;

        private boolean extendedHours = false;

        private String month;

        public Builder() {
            super();
            this.function(Function.TIME_SERIES_INTRADAY);
        }

        public Builder interval(Interval interval) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder outputSize(OutputSize outputSize) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder adjusted() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder extendedHours() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder month(String month) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public IntraDayRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
