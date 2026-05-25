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
package com.crazzyghost.alphavantage.timeseries;

import com.crazzyghost.alphavantage.AlphaVantageException;
import com.crazzyghost.alphavantage.Config;
import com.crazzyghost.alphavantage.Fetcher;
import com.crazzyghost.alphavantage.UrlExtractor;
import com.crazzyghost.alphavantage.parameters.DataType;
import com.crazzyghost.alphavantage.parameters.Interval;
import com.crazzyghost.alphavantage.parameters.OutputSize;
import com.crazzyghost.alphavantage.parser.Parser;
import com.crazzyghost.alphavantage.timeseries.request.*;
import com.crazzyghost.alphavantage.timeseries.response.QuoteResponse;
import com.crazzyghost.alphavantage.timeseries.response.RealtimeBulkQuoteResponse;
import com.crazzyghost.alphavantage.timeseries.response.TimeSeriesResponse;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import java.io.IOException;
import java.util.Map;

/**
 * Access to Stock Time Series Data
 * @author crazzyghost
 * @since 1.0.0
 */
public final class TimeSeries implements Fetcher {

    private final Config config;

    private TimeSeriesRequest.Builder<?> builder;

    private boolean adjusted = false;

    private Fetcher.SuccessCallback<?> successCallback;

    private Fetcher.FailureCallback failureCallback;

    public TimeSeries(Config config) {
        this.config = config;
    }

    /**
     * Access monthly stock time series data
     * @return {@link MonthlyRequestProxy} instance
     */
    public MonthlyRequestProxy monthly() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Access weekly stock time series data
     * @return {@link WeeklyRequestProxy} instance
     */
    public WeeklyRequestProxy weekly() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Access daily stock time series data
     * @return {@link DailyRequestProxy} instance
     */
    public DailyRequestProxy daily() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Access intraday stock time series data
     * @return {@link IntraDayRequestProxy} instance
     */
    public IntraDayRequestProxy intraday() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Access global quote data
     * @return {@link GlobalQuoteRequestProxy} instance
     */
    public GlobalQuoteRequestProxy quote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Access realtime bulk quote data
     * @return {@link RealtimeBulkQuoteRequestProxy} instance
     */
    public RealtimeBulkQuoteRequestProxy realtimeBulkQuote() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Fetch Stock Time Series data
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
    private void fetchSync(SuccessCallback<?> successCallback) throws AlphaVantageException {
        Config.checkNotNullOrKeyEmpty(config);
        this.successCallback = successCallback;
        this.failureCallback = null;
        okhttp3.OkHttpClient client = config.getOkHttpClient();
        try (Response response = client.newCall(UrlExtractor.extract(builder.build(), config.getKey())).execute()) {
            parseResponse(Parser.parseJSON(response.body().string()));
        } catch (IOException e) {
            throw new AlphaVantageException(e.getMessage());
        }
    }

    /**
     * parse {@link TimeSeriesResponse}
     * @param data parsed JSON data
     */
    @SuppressWarnings("unchecked")
    private void parseTimeSeriesResponse(Map<String, Object> data) {
        TimeSeriesResponse response = TimeSeriesResponse.of(data, adjusted);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null) {
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
            }
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<TimeSeriesResponse>) successCallback).onSuccess(response);
        }
    }

    /**
     * parse {@link QuoteResponse}
     * @param data parsed JSON data
     */
    @SuppressWarnings("unchecked")
    private void parseGlobalQuoteResponse(Map<String, Object> data) {
        QuoteResponse response = QuoteResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null) {
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
            }
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<QuoteResponse>) successCallback).onSuccess(response);
        }
    }

    /**
     * parse {@link QuoteResponse}
     * @param data parsed JSON data
     */
    @SuppressWarnings("unchecked")
    private void parseRealtimeBulkQuoteResponse(Map<String, Object> data) {
        RealtimeBulkQuoteResponse response = RealtimeBulkQuoteResponse.of(data);
        if (response.getErrorMessage() != null) {
            if (failureCallback != null) {
                failureCallback.onFailure(new AlphaVantageException(response.getErrorMessage()));
            }
        }
        if (successCallback != null) {
            ((Fetcher.SuccessCallback<RealtimeBulkQuoteResponse>) successCallback).onSuccess(response);
        }
    }

    /**
     * parse a JSON response to a {@link TimeSeriesResponse} or {@link QuoteResponse} object
     * @param data parsed JSON response
     */
    private void parseResponse(Map<String, Object> data) {
        switch(builder.function) {
            case TIME_SERIES_DAILY:
            case TIME_SERIES_DAILY_ADJUSTED:
            case TIME_SERIES_MONTHLY:
            case TIME_SERIES_MONTHLY_ADJUSTED:
            case TIME_SERIES_WEEKLY:
            case TIME_SERIES_WEEKLY_ADJUSTED:
            case TIME_SERIES_INTRADAY:
                parseTimeSeriesResponse(data);
                break;
            case GLOBAL_QUOTE:
                parseGlobalQuoteResponse(data);
                break;
            case REALTIME_BULK_QUOTES:
                parseRealtimeBulkQuoteResponse(data);
                break;
            default:
                break;
        }
    }

    /**
     * An abstract proxy for building requests. Adds the functionality of adding callbacks and a terminal method for
     * fetching data.
     * @param <T> A Concrete {@link RequestProxy} Implementation
     * @param <U> A Response Type to return during a synchronous call
     */
    @SuppressWarnings("unchecked")
    public abstract class RequestProxy<T extends RequestProxy<?, U>, U> {

        protected TimeSeriesRequest.Builder<?> builder;

        protected U syncResponse;

        private RequestProxy() {
        }

        /**
         * Set the symbol for the request
         * @param symbol
         * @return
         */
        public T forSymbol(String symbol) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the dataType for the request
         * @param type the datatype {@link DataType}
         * @return
         */
        public T dataType(DataType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the success callback during an async call
         * @param callback
         * @return
         */
        public T onSuccess(SuccessCallback<?> callback) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the failure callback during an async call
         * @param callback
         * @return
         */
        public T onFailure(FailureCallback callback) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the right builder and make an async http request using the {@link TimeSeries#fetch()}
         */
        public void fetch() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the reponse during a synchronous call
         * @param response
         */
        public void setSyncResponse(U response) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the right builder and make a synchronous request using {@link TimeSeries#fetch()}
         * <p>When calling this method, any async callbacks will be overwritten</p>
         * @return The api response
         * @throws AlphaVantageException
         */
        public U fetchSync() throws AlphaVantageException {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Proxy for building a {@link DailyRequest}
     */
    public class DailyRequestProxy extends RequestProxy<DailyRequestProxy, TimeSeriesResponse> {

        DailyRequestProxy() {
            super();
            this.builder = new DailyRequest.Builder();
        }

        /**
         * Set the output size of the request
         * @param size {@link OutputSize}
         * @return
         */
        public DailyRequestProxy outputSize(OutputSize size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the time series function to adjusted
         * @return
         */
        public DailyRequestProxy adjusted() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Proxy for building an {@link IntraDayRequest}
     */
    public class IntraDayRequestProxy extends RequestProxy<IntraDayRequestProxy, TimeSeriesResponse> {

        IntraDayRequestProxy() {
            super();
            this.builder = new IntraDayRequest.Builder();
        }

        /**
         * Set the output size of the request
         * @param size {@link OutputSize}
         * @return
         */
        public IntraDayRequestProxy outputSize(OutputSize size) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Set the interval of the request
         * @param interval {@link Interval}
         * @return
         */
        public IntraDayRequestProxy interval(Interval interval) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Adjust the timeseries output by historical split and dividend events
         *
         * @return
         */
        public IntraDayRequestProxy adjusted() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Include extended and regular trading hours
         *
         * @return
         */
        public IntraDayRequestProxy extendedHours() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        /**
         * Query data in a specific month
         *
         * @param month
         * @return
         */
        public IntraDayRequestProxy month(String month) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Proxy for building a {@link WeeklyRequest}
     */
    public class WeeklyRequestProxy extends RequestProxy<WeeklyRequestProxy, TimeSeriesResponse> {

        WeeklyRequestProxy() {
            super();
            this.builder = new WeeklyRequest.Builder();
        }

        /**
         * Set the request function to adjusted
         * @return
         */
        public WeeklyRequestProxy adjusted() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Proxy for building a {@link MonthlyRequest}
     */
    public class MonthlyRequestProxy extends RequestProxy<MonthlyRequestProxy, TimeSeriesResponse> {

        MonthlyRequestProxy() {
            super();
            this.builder = new MonthlyRequest.Builder();
        }

        /**
         * Set the request function to adjusted
         * @return
         */
        public MonthlyRequestProxy adjusted() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    /**
     * Proxy for building a {@link QuoteRequest}
     */
    public class GlobalQuoteRequestProxy extends RequestProxy<GlobalQuoteRequestProxy, QuoteResponse> {

        GlobalQuoteRequestProxy() {
            super();
            this.builder = new QuoteRequest.Builder();
        }
    }

    /**
     * Proxy for building a {@link RealtimeBulkQuoteRequest}
     */
    public class RealtimeBulkQuoteRequestProxy extends RequestProxy<RealtimeBulkQuoteRequestProxy, RealtimeBulkQuoteResponse> {

        RealtimeBulkQuoteRequestProxy() {
            super();
            this.builder = new RealtimeBulkQuoteRequest.Builder();
        }
    }
}
