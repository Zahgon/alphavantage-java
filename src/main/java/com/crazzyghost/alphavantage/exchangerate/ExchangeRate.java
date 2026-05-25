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

import java.io.IOException;
import com.crazzyghost.alphavantage.AlphaVantageException;
import com.crazzyghost.alphavantage.Config;
import com.crazzyghost.alphavantage.Fetcher;
import com.crazzyghost.alphavantage.UrlExtractor;
import com.crazzyghost.alphavantage.parser.Parser;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * Access to Exchange Rate Data
 *
 * @author Sylvester Sefa-Yeboah
 * @since 1.0.0
 */
public final class ExchangeRate implements Fetcher {

    private final Config config;

    private final ExchangeRateRequest.Builder builder;

    private Fetcher.SuccessCallback<ExchangeRateResponse> successCallback;

    private Fetcher.FailureCallback failureCallback;

    public ExchangeRate(Config config) {
        this.config = config;
        this.builder = new ExchangeRateRequest.Builder();
    }

    public ExchangeRate toCurrency(String toCurrency) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ExchangeRate fromCurrency(String fromCurrency) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Handles request success
     *
     * @param callback successful fetch handler
     * @return current instance of {@link ExchangeRateResponse}
     */
    public ExchangeRate onSuccess(SuccessCallback<ExchangeRateResponse> callback) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Handles request failure
     *
     * @param callback failed fetch handler
     * @return current instance of {@link ExchangeRateResponse}
     */
    public ExchangeRate onFailure(FailureCallback callback) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Make a blocking synchronous http request to fetch the data.
     *
     * Using this method will overwrite any async callback
     *
     * @since 1.5.0
     * @throws AlphaVantageException exception thrown
     */
    public ExchangeRateResponse fetchSync() throws AlphaVantageException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void fetch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
