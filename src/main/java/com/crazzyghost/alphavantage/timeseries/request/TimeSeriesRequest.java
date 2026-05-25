package com.crazzyghost.alphavantage.timeseries.request;

import com.crazzyghost.alphavantage.parameters.DataType;
import com.crazzyghost.alphavantage.parameters.Function;

public abstract class TimeSeriesRequest {

    private Function function;

    private String symbol;

    private DataType dataType;

    protected TimeSeriesRequest(Builder<?> builder) {
        this.symbol = builder.symbol;
        this.dataType = builder.dataType;
        this.function = builder.function;
    }

    public static abstract class Builder<T extends Builder<T>> {

        protected DataType dataType = DataType.JSON;

        protected String symbol;

        public Function function;

        public Builder() {
        }

        public T dataType(DataType dataType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T forSymbol(String symbol) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T function(Function function) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public abstract TimeSeriesRequest build();
    }
}
