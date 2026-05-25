/*
 *
 * Copyright (c) 2020 Sylvester Sefa-Yeboah
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.crazzyghost.alphavantage;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;

/**
 * Allows you to set the library configuration parameters.
 *
 * @since 1.0.0
 * @author Sylvester Sefa-Yeboah
 */
public class Config {

    public static final String BASE_URL = "https://www.alphavantage.co/query?";

    private final String key;

    private final int timeOut;

    private final OkHttpClient httpClient;

    private Config(Builder builder) {
        this.key = builder.key;
        this.timeOut = builder.timeOut;
        this.httpClient = builder.httpClient == null ? defaultClient(builder.timeOut) : builder.httpClient;
    }

    public int getTimeOut() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getKey() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public OkHttpClient getOkHttpClient() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Get a builder instance
     *
     * @return {@link Builder}
     */
    public static Builder builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Configure a default http client for the library
     *
     * @param timeOut connect timeout
     * @return a default HTTP client for fetching data
     */
    private OkHttpClient defaultClient(int timeOut) {
        return new OkHttpClient.Builder().connectTimeout(timeOut, TimeUnit.SECONDS).build();
    }

    /**
     * Make sure the config is not null and is with an api key
     *
     * @since 1.4.0
     * @param config config instance
     * Check if a config instance is null or has an empty key
     */
    public static void checkNotNullOrKeyEmpty(Config config) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder {

        private String key;

        private int timeOut;

        private OkHttpClient httpClient;

        public Builder key(String key) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder timeOut(int timeOut) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder httpClient(OkHttpClient httpClient) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Config build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
