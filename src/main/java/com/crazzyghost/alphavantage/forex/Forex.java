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
package com.crazzyghost.alphavantage.forex;

import com.crazzyghost.alphavantage.AlphaVantageException;
import com.crazzyghost.alphavantage.Fetcher;
import com.crazzyghost.alphavantage.Config;
import com.crazzyghost.alphavantage.UrlExtractor;
import com.crazzyghost.alphavantage.forex.request.*;
import com.crazzyghost.alphavantage.forex.response.ForexResponse;
import com.crazzyghost.alphavantage.parameters.DataType;
import com.crazzyghost.alphavantage.parameters.Interval;
import com.crazzyghost.alphavantage.parameters.OutputSize;
import com.crazzyghost.alphavantage.parser.Parser;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.io.IOException;

/**
 * Access to Stock Time Series Data
 * @author crazzyghost
 * @since 1.0.0
 */
public final class Forex implements Fetcher {

    private final Config config;

    private ForexRequest.Builder<?> builder;

    private Fetcher.SuccessCallback<ForexResponse> successCallback;

    private Fetcher.FailureCallback failureCallback;

    public Forex(Config config) {
        this.config = config;
    }

    /**
     * Access monthly stock time series data
     * @return {@link WeeklyRequestProxy} instance
     */
    public WeeklyRequestProxy weekly() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Access monthly stock time series data
     * @return {@link DailyRequestProxy} instance
     */
    public DailyRequestProxy daily() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Access monthly stock time series data
     * @return {@link IntraDayRequestProxy} instance
     */
    public IntraDayRequestProxy intraday() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Access monthly stock time series data
     * @return {@link MonthlyRequestProxy} instance
     */
    public MonthlyRequestProxy monthly() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Fetch Foreign Exchange data
     */
    @Override
    public void fetch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Make a blocking synchronous http request to fetch the data.
     * This will be called by the {@link RequestProxy#fetchSync()}.
     * <p>
     * On Android this will throw NetworkOnMainThreadException. In that case you should handle this on
     * another thread
     * </p>
     *
     * <p>Using this method will overwrite any async callback</p>
     * @since 1.4.1
     * @param successCallback internally used {@link SuccessCallback}
     * @throws AlphaVantageException exception thrown
     */
    private void fetchSync(SuccessCallback<ForexResponse> successCallback) throws AlphaVantageException {
        Config.checkNotNullOrKeyEmpty(config);
        this.successCallback = successCallback;
        this.failureCallback = null;
        okhttp3.OkHttpClient client = config.getOkHttpClient();
        try (Response response = client.newCall(UrlExtractor.extract(builder.build(), config.getKey())).execute()) {
            ForexResponse forexResponse = ForexResponse.of(Parser.parseJSON(response.body().string()));
            this.successCallback.onSuccess(forexResponse);
        } catch (IOException e) {
            throw new AlphaVantageException(e.getMessage());
        }
    }

    /**
     * An abstract proxy for building requests. Adds the functionality of adding callbacks and a terminal method for
     * fetching data.
     * @param <T> A Concrete {@link RequestProxy} Implementation
     */
    @SuppressWarnings("unchecked")
    public abstract class RequestProxy<T extends RequestProxy<?>> {

        protected ForexRequest.Builder<?> builder;

        protected ForexResponse syncResponse;

        private RequestProxy() {
            Forex.this.successCallback = null;
            Forex.this.failureCallback = null;
        }

        public T toSymbol(String toSymbol) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T fromSymbol(String fromSymbol) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T dataType(DataType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T onSuccess(SuccessCallback<ForexResponse> callback) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public T onFailure(FailureCallback callback) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public void fetch() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the reponse during a synchronous call
         * @param response
         */
        public void setSyncResponse(ForexResponse response) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the right builder and make a synchronous request using {@link Forex#fetch()}
         * <p>When calling this method, any async callbacks will be overwritten</p>
         * @return The api response
         * @throws AlphaVantageException
         */
        public ForexResponse fetchSync() throws AlphaVantageException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Proxy for building a {@link DailyRequest}
     */
    public class DailyRequestProxy extends RequestProxy<DailyRequestProxy> {

        DailyRequestProxy() {
            super();
            this.builder = new DailyRequest.Builder();
        }

        public DailyRequestProxy outputSize(OutputSize size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Proxy for building a {@link IntraDayRequest}
     */
    public class IntraDayRequestProxy extends RequestProxy<IntraDayRequestProxy> {

        IntraDayRequestProxy() {
            super();
            this.builder = new IntraDayRequest.Builder();
        }

        public IntraDayRequestProxy outputSize(OutputSize size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public IntraDayRequestProxy interval(Interval interval) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Proxy for building a {@link WeeklyRequest}
     */
    public class WeeklyRequestProxy extends RequestProxy<WeeklyRequestProxy> {

        WeeklyRequestProxy() {
            super();
            this.builder = new WeeklyRequest.Builder();
        }
    }

    /**
     * Proxy for building a {@link MonthlyRequest}
     */
    public class MonthlyRequestProxy extends RequestProxy<MonthlyRequestProxy> {

        MonthlyRequestProxy() {
            super();
            this.builder = new MonthlyRequest.Builder();
        }
    }
}
