package com.crazzyghost.alphavantage.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author crazzyghost
 * @since 1.4.0
 * @param <T> Response Type
 */
public abstract class DefaultParser<T> extends Parser<T> {

    public abstract T parse(Map<String, String> metaData, Map<String, Map<String, String>> data);

    @Override
    @SuppressWarnings("unchecked")
    public T parse(Map<String, Object> object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
