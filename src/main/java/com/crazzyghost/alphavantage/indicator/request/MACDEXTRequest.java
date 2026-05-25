package com.crazzyghost.alphavantage.indicator.request;

import com.crazzyghost.alphavantage.parameters.Function;
import com.crazzyghost.alphavantage.parameters.MAType;
import com.crazzyghost.alphavantage.parameters.SeriesType;

public class MACDEXTRequest extends IndicatorRequest {

    private SeriesType series_type;

    private int fastPeriod;

    private int slowPeriod;

    private int signalPeriod;

    private MAType fastMaType;

    private MAType slowMaType;

    private MAType signalMaType;

    private MACDEXTRequest(Builder builder) {
        super(builder);
        this.fastPeriod = builder.fastPeriod;
        this.slowPeriod = builder.slowPeriod;
        this.signalPeriod = builder.signalPeriod;
        this.fastMaType = builder.fastMaType;
        this.slowMaType = builder.slowMaType;
        this.signalMaType = builder.signalMaType;
        this.series_type = builder.seriesType;
    }

    public static class Builder extends IndicatorRequest.Builder<Builder> {

        private int fastPeriod = 12;

        private int slowPeriod = 26;

        private int signalPeriod = 9;

        private MAType fastMaType = MAType.SMA;

        private MAType slowMaType = MAType.SMA;

        private MAType signalMaType = MAType.SMA;

        private SeriesType seriesType;

        public Builder() {
            this.function(Function.MACDEXT);
        }

        public Builder fastPeriod(int fastPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder slowPeriod(int slowPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder signalPeriod(int signalPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder fastMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder slowMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder signalMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder seriesType(SeriesType seriesType) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public IndicatorRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
