package com.crazzyghost.alphavantage.timeseries.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.Parser;

public class QuoteResponse {

    private String symbol;

    private double open;

    private double high;

    private double low;

    private double price;

    private double volume;

    private String latestTradingDay;

    private double previousClose;

    private double change;

    private double changePercent;

    private String errorMessage;

    public QuoteResponse(String symbol, double open, double high, double low, double price, double volume, String latestTradingDay, double previousClose, double change, double changePercent) {
        this.symbol = symbol;
        this.open = open;
        this.high = high;
        this.low = low;
        this.price = price;
        this.volume = volume;
        this.latestTradingDay = latestTradingDay;
        this.previousClose = previousClose;
        this.change = change;
        this.changePercent = changePercent;
    }

    public String getSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getOpen() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getHigh() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getLow() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getVolume() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLatestTradingDay() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getPreviousClose() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getChange() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public double getChangePercent() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public QuoteResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public static QuoteResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class QuoteParser extends Parser<QuoteResponse> {

        @SuppressWarnings("unchecked")
        @Override
        public QuoteResponse parse(Map<String, Object> stringObjectMap) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public QuoteResponse onParseError(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
