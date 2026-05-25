package com.crazzyghost.alphavantage.search.request;

import com.crazzyghost.alphavantage.parameters.Function;

public class SearchRequest {

    private final Function function;

    private final String keywords;

    private SearchRequest(Builder builder) {
        this.function = builder.function;
        this.keywords = builder.keywords;
    }

    public static class Builder {

        private final Function function;

        private String keywords;

        public Builder() {
            this.function = Function.SYMBOL_SEARCH;
        }

        public Builder keywords(String keywords) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public SearchRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
