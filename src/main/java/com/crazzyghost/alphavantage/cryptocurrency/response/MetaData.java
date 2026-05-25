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
package com.crazzyghost.alphavantage.cryptocurrency.response;

import com.crazzyghost.alphavantage.parameters.Interval;
import com.crazzyghost.alphavantage.parameters.OutputSize;

/**
 * Crypto Currency MetaData
 *
 * @author Sylvester Sefa-Yeboah
 * @since 1.0.0
 */
public class MetaData {

    private final String information;

    private final String digitalCurrencyCode;

    private final String digitalCurrencyName;

    private final String marketCode;

    private final String marketName;

    private final String lastRefreshed;

    private final String timeZone;

    private final String interval;

    private final String outputSize;

    private MetaData(Builder builder) {
        this.information = builder.information;
        this.digitalCurrencyCode = builder.digitalCurrencyCode;
        this.digitalCurrencyName = builder.digitalCurrencyName;
        this.marketCode = builder.marketCode;
        this.marketName = builder.marketName;
        this.lastRefreshed = builder.lastRefreshed;
        this.timeZone = builder.timeZone;
        this.interval = builder.interval;
        this.outputSize = builder.outputSize;
    }

    public static MetaData empty() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Builder builder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDigitalCurrencyCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDigitalCurrencyName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getInformation() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLastRefreshed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTimeZone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMarketCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMarketName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getInterval() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getOutputSize() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder {

        private String information;

        private String digitalCurrencyCode;

        private String digitalCurrencyName;

        private String marketCode;

        private String marketName;

        private String lastRefreshed;

        private String timeZone;

        private String interval;

        private String outputSize;

        public Builder information(String information) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder digitalCurrencyCode(String digitalCurrencyCode) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder digitalCurrencyName(String digitalCurrencyName) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder marketCode(String marketCode) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder marketName(String marketName) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder lastRefreshed(String lastRefreshed) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder timeZone(String timeZone) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder interval(String interval) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder outputSize(String outputSize) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public MetaData build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
