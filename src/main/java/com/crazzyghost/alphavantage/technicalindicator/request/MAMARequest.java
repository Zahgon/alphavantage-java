package com.crazzyghost.alphavantage.technicalindicator.request;

import com.crazzyghost.alphavantage.parameters.Function;
import com.crazzyghost.alphavantage.parameters.SeriesType;

public class MAMARequest extends TechnicalIndicatorRequest {

    private SeriesType series_type;

    private double fastLimit;

    private double slowLimit;

    private MAMARequest(Builder builder) {
        super(builder);
        this.fastLimit = builder.fastLimit;
        this.slowLimit = builder.slowLimit;
        this.series_type = builder.seriesType;
    }

    public static class Builder extends TechnicalIndicatorRequest.Builder<Builder> {

        private double fastLimit = 0.1;

        private double slowLimit = 0.1;

        private SeriesType seriesType;

        public Builder() {
            this.function(Function.MAMA);
        }

        public Builder fastLimit(double fastLimit) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder slowLimit(double slowLimit) {
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
