/*
 *
 * Copyright (c) 2025 Sylvester Sefa-Yeboah
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
package com.crazzyghost.alphavantage.search;

import com.crazzyghost.alphavantage.AlphaVantageException;
import com.crazzyghost.alphavantage.Config;
import com.crazzyghost.alphavantage.Fetcher;
import com.crazzyghost.alphavantage.UrlExtractor;
import com.crazzyghost.alphavantage.parser.Parser;
import com.crazzyghost.alphavantage.search.request.SearchRequest;
import com.crazzyghost.alphavantage.search.response.SearchResponse;
import okhttp3.Call;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;

/**
 * Symbol Search
 *
 * @author Sylvester Sefa-Yeboah
 * @since 1.8.0
 */
public final class Search implements Fetcher {

    private final Config config;

    private final SearchRequest.Builder builder;

    private SuccessCallback<SearchResponse> successCallback;

    private FailureCallback failureCallback;

    public Search(Config config) {
        this.config = config;
        this.builder = new SearchRequest.Builder();
    }

    public Search keywords(String keywords) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Handles request success
     *
     * @param callback successful fetch handler
     * @return current instance of {@link SearchResponse}
     */
    public Search onSuccess(SuccessCallback<SearchResponse> callback) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Handles request failure
     *
     * @param callback failed fetch handler
     * @return current instance of {@link SearchResponse}
     */
    public Search onFailure(FailureCallback callback) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Make a blocking synchronous http request to fetch the data.
     * <p>
     * Using this method will overwrite any async callback
     *
     * @throws AlphaVantageException exception thrown
     * @since 1.8.0
     */
    public SearchResponse fetchSync() throws AlphaVantageException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void fetch() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
