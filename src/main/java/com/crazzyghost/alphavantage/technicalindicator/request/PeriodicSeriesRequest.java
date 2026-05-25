package com.crazzyghost.alphavantage.technicalindicator.request;

import com.crazzyghost.alphavantage.parameters.SeriesType;

public class PeriodicSeriesRequest extends TechnicalIndicatorRequest {

    private SeriesType series_type;

    private int time_period;

    private PeriodicSeriesRequest(Builder builder) {
        super(builder);
        this.time_period = builder.timePeriod;
        this.series_type = builder.seriesType;
    }

    public static class Builder extends TechnicalIndicatorRequest.Builder<Builder> {

        private SeriesType seriesType;

        private int timePeriod;

        public Builder timePeriod(int timePeriod) {
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
