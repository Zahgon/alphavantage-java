package com.crazzyghost.alphavantage.marketstatus.request;

import com.crazzyghost.alphavantage.parameters.Function;

public class MarketStatusRequest {

    private final Function function;

    private MarketStatusRequest(Builder builder) {
        this.function = builder.function;
    }

    public static class Builder {

        private final Function function;

        public Builder() {
            this.function = Function.MARKET_STATUS;
        }

        public MarketStatusRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
