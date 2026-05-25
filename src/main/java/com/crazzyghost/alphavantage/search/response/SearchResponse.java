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
package com.crazzyghost.alphavantage.search.response;

import com.crazzyghost.alphavantage.parser.Parser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchResponse {

    private final List<Match> bestMatches;

    private final String errorMessage;

    private SearchResponse(List<Match> bestMatches) {
        this.bestMatches = bestMatches;
        this.errorMessage = null;
    }

    private SearchResponse(String errorMessage) {
        this.errorMessage = errorMessage;
        this.bestMatches = new ArrayList<>();
    }

    public List<Match> getBestMatches() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static SearchResponse of(Map<String, Object> data) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class MarketStatusParser extends Parser<SearchResponse> {

        @Override
        public SearchResponse onParseError(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public SearchResponse parse(Map<String, Object> object) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
