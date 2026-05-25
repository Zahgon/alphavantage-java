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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.Parser;

/**
 * Crypto Currency Rating Response
 *
 * @author Sylvester Sefa-Yeboah
 * @since 1.0.0
 */
public class RatingResponse {

    private String symbol;

    private String name;

    private String fcasRating;

    private String fcasScore;

    private String developerScore;

    private String marketMaturityScore;

    private String utilityScore;

    private String lastRefreshed;

    private String timeZone;

    private String errorMessage;

    public RatingResponse(String symbol, String name, String fcasRating, String fcasScore, String developerScore, String marketMaturityScore, String utilityScore, String lastRefreshed, String timeZone) {
        this.symbol = symbol;
        this.name = name;
        this.fcasRating = fcasRating;
        this.fcasScore = fcasScore;
        this.developerScore = developerScore;
        this.marketMaturityScore = marketMaturityScore;
        this.utilityScore = utilityScore;
        this.lastRefreshed = lastRefreshed;
        this.timeZone = timeZone;
    }

    private RatingResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public static RatingResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static class RatingParser extends Parser<RatingResponse> {

        @SuppressWarnings("unchecked")
        @Override
        public RatingResponse parse(Map<String, Object> stringObjectMap) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public RatingResponse onParseError(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFcasRating() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFcasScore() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDeveloperScore() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMarketMaturityScore() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getUtilityScore() {
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
