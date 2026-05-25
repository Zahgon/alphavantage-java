package com.crazzyghost.alphavantage.parser;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.Types;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * @author crazzyghost
 * @since 1.4.0
 * @param <T> Response Type
 */
public abstract class Parser<T> {

    public abstract T onParseError(String error);

    public abstract T parse(Map<String, Object> object);

    public static Map<String, Object> parseJSON(String responseBody) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <U> U parseJSON(String responseBody, Class<U> c) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <U> List<U> parseJSONList(Object object, Class<U> klass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String toJSON(Map<String, Object> data) throws IOException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <N extends Number> N getNumberFromString(String s, Function<String, N> parser) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
