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

/**
 * Crypto Currency Unit
 *
 * @author Sylvester Sefa-Yeboah
 * @since 1.0.0
 */
public class CryptoUnit {

    private final Double open;

    private final Double close;

    private final Double high;

    private final Double low;

    private final Double volume;

    public CryptoUnit(Builder builder) {
        this.open = builder.open;
        this.close = builder.close;
        this.high = builder.high;
        this.low = builder.low;
        this.volume = builder.volume;
    }

    public static class Builder {

        private Double open;

        private Double high;

        private Double low;

        private Double close;

        private Double volume;

        public Builder open(Double open) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder high(Double high) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder low(Double low) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder close(Double close) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder volume(Double volume) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public CryptoUnit build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public Double getOpen() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getClose() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getHigh() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getLow() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getVolume() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
