package com.crazzyghost.alphavantage.indicator.request;

import com.crazzyghost.alphavantage.parameters.Function;

public class ADOSCRequest extends IndicatorRequest {

    private int fastPeriod;

    private int slowPeriod;

    private ADOSCRequest(Builder builder) {
        super(builder);
        this.fastPeriod = builder.fastPeriod;
        this.slowPeriod = builder.slowPeriod;
    }

    public static class Builder extends IndicatorRequest.Builder<Builder> {

        private int fastPeriod = 3;

        private int slowPeriod = 10;

        public Builder() {
            this.function(Function.ADOSC);
        }

        public Builder fastPeriod(int fastPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder slowPeriod(int slowPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public IndicatorRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
