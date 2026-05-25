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

import java.lang.reflect.Field;
import okhttp3.Request;

/**
 * Extracts a valid url from a request object. The request object should contain valid
 * api endpoint parameters
 *
 * @since 1.0.0
 * @author Sylvester Sefa-Yeboah
 */
public class UrlExtractor {

    private UrlExtractor() {
    }

    /**
     * Get an API url from a request object
     *
     * @param object a request object with the valid API parameters
     * @return valid API url
     */
    public static String extract(Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Build an http request with the parameters and the api key
     *
     * @param request any endpoint request object
     * @param apiKey Alphavantage API key
     * @return
     */
    public static Request extract(Object request, String apiKey) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
