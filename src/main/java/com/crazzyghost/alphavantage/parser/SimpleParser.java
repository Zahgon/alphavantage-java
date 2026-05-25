package com.crazzyghost.alphavantage.parser;

import java.util.Map;

public abstract class SimpleParser<T, U> extends Parser<T> {

    @Override
    final public T parse(Map<String, Object> object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public abstract T parse(U data);
}
