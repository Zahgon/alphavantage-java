package com.crazzyghost.alphavantage.search.response;

import com.squareup.moshi.Json;

public class Match {

    @Json(name = "1. symbol")
    private String symbol;

    @Json(name = "2. name")
    private String name;

    @Json(name = "3. type")
    private String type;

    @Json(name = "4. region")
    private String region;

    @Json(name = "5. marketOpen")
    private String marketOpen;

    @Json(name = "6. marketClose")
    private String marketClose;

    @Json(name = "7. timezone")
    private String timezone;

    @Json(name = "8. currency")
    private String currency;

    @Json(name = "9. matchScore")
    private String matchScore;

    public String getSymbol() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getRegion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMarketOpen() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMarketClose() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTimezone() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getCurrency() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMatchScore() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
