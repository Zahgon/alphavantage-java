package com.crazzyghost.alphavantage.forex.request;

import com.crazzyghost.alphavantage.parameters.DataType;
import com.crazzyghost.alphavantage.parameters.OutputSize;

public abstract class ForexRequest {

    protected String from_symbol;

    protected String to_symbol;

    protected DataType dataType;

    protected ForexRequest(Builder<?> builder) {
        this.to_symbol = builder.toSymbol;
        this.from_symbol = builder.fromSymbol;
        this.dataType = builder.dataType;
    }

    public abstract static class Builder<T extends Builder<?>> {

        private String fromSymbol;

        private String toSymbol;

        private DataType dataType = DataType.JSON;

        public T fromSymbol(String fromSymbol) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T toSymbol(String fromSymbol) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T dataType(DataType dataType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public abstract ForexRequest build();
    }
}
