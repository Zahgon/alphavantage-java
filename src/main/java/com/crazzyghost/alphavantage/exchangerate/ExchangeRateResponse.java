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
package com.crazzyghost.alphavantage.exchangerate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.Parser;

/**
 * ExchangeRate Response
 *
 * @author Sylvester Sefa-Yeboah
 * @since 1.0.0
 */
public class ExchangeRateResponse {

    private String fromCurrencyCode;

    private String fromCurrencyName;

    private String toCurrencyCode;

    private String toCurrencyName;

    private double exchangeRate;

    private String lastRefreshed;

    private String timeZone;

    private Double bidPrice;

    private Double askPrice;

    private final String errorMessage;

    private ExchangeRateResponse(String fromCurrencyCode, String fromCurrencyName, String toCurrencyCode, String toCurrencyName, Double exchangeRate, String lastRefreshed, String timeZone, Double bidPrice, Double askPrice) {
        this.fromCurrencyCode = fromCurrencyCode;
        this.fromCurrencyName = fromCurrencyName;
        this.toCurrencyCode = toCurrencyCode;
        this.toCurrencyName = toCurrencyName;
        this.exchangeRate = exchangeRate;
        this.lastRefreshed = lastRefreshed;
        this.timeZone = timeZone;
        this.bidPrice = bidPrice;
        this.askPrice = askPrice;
        this.errorMessage = null;
    }

    private ExchangeRateResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public static ExchangeRateResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class ExchangeRateParser extends Parser<ExchangeRateResponse> {

        @SuppressWarnings("unchecked")
        @Override
        public ExchangeRateResponse parse(Map<String, Object> stringObjectMap) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public ExchangeRateResponse onParseError(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getAskPrice() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Double getBidPrice() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFromCurrencyCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getExchangeRate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFromCurrencyName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getToCurrencyCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getToCurrencyName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLastRefreshed() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTimeZone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
