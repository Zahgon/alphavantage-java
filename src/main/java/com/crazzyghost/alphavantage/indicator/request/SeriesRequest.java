package com.crazzyghost.alphavantage.indicator.request;

import com.crazzyghost.alphavantage.parameters.SeriesType;

public class SeriesRequest extends IndicatorRequest {

    private SeriesType series_type;

    private SeriesRequest(Builder builder) {
        super(builder);
        this.series_type = builder.seriesType;
    }

    public static class Builder extends IndicatorRequest.Builder<Builder> {

        private SeriesType seriesType;

        public Builder seriesType(SeriesType seriesType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public IndicatorRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
