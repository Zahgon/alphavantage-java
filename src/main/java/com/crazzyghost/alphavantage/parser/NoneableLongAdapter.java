package com.crazzyghost.alphavantage.parser;

import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;

public class NoneableLongAdapter {

    @ToJson
    public Long toJson(@NoneableLong Long l) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @FromJson
    @NoneableLong
    public Long fromJson(String s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
