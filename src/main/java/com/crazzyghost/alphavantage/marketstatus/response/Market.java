package com.crazzyghost.alphavantage.marketstatus.response;

import com.squareup.moshi.Json;

public class Market {

    @Json(name = "market_type")
    private String marketType;

    @Json(name = "region")
    private String region;

    @Json(name = "primary_exchanges")
    private String primaryExchanges;

    @Json(name = "local_open")
    private String localOpen;

    @Json(name = "local_close")
    private String localClose;

    @Json(name = "current_status")
    private String currentStatus;

    @Json(name = "notes")
    private String notes;

    public String getMarketType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getRegion() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getPrimaryExchanges() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLocalOpen() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getLocalClose() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getCurrentStatus() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getNotes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
