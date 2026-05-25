package com.crazzyghost.alphavantage.forex.request;

import com.crazzyghost.alphavantage.parameters.Function;
import com.crazzyghost.alphavantage.parameters.OutputSize;

public class DailyRequest extends ForexRequest {

    private Function function;

    private OutputSize outputSize;

    private DailyRequest(Builder builder) {
        super(builder);
        this.function = Function.FX_DAILY;
        this.outputSize = builder.outputSize;
    }

    public static class Builder extends ForexRequest.Builder<Builder> {

        Function function;

        OutputSize outputSize = OutputSize.COMPACT;

        public Builder outputSize(OutputSize outputSize) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public ForexRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
