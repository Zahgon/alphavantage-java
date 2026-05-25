package com.crazzyghost.alphavantage.technicalindicator.request;

import com.crazzyghost.alphavantage.parameters.Function;
import com.crazzyghost.alphavantage.parameters.MAType;

public class STOCHRequest extends TechnicalIndicatorRequest {

    private int fastKPeriod;

    private int slowKPeriod;

    private int slowDPeriod;

    private MAType slowKMaType;

    private MAType slowDMaType;

    protected STOCHRequest(Builder builder) {
        super(builder);
        this.fastKPeriod = builder.fastKPeriod;
        this.slowKPeriod = builder.slowKPeriod;
        this.slowDPeriod = builder.slowDPeriod;
        this.slowDMaType = builder.slowDMaType;
        this.slowKMaType = builder.slowKMaType;
    }

    public static class Builder extends TechnicalIndicatorRequest.Builder<Builder> {

        private int fastKPeriod = 5;

        private int slowKPeriod = 3;

        private int slowDPeriod = 3;

        private MAType slowKMaType = MAType.SMA;

        private MAType slowDMaType = MAType.SMA;

        public Builder() {
            this.function(Function.STOCH);
        }

        public Builder fastKPeriod(int fastKPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder slowKPeriod(int slowKPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder slowDPeriod(int slowDPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder slowKMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder slowDMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public TechnicalIndicatorRequest build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
