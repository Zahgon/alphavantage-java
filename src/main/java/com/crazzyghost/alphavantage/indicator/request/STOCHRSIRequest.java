package com.crazzyghost.alphavantage.indicator.request;

import com.crazzyghost.alphavantage.parameters.Function;
import com.crazzyghost.alphavantage.parameters.MAType;
import com.crazzyghost.alphavantage.parameters.SeriesType;

public class STOCHRSIRequest extends IndicatorRequest {

    private int time_period;

    private SeriesType series_type;

    private int fastKPeriod;

    private int fastDPeriod;

    private MAType fastDMaType;

    protected STOCHRSIRequest(Builder builder) {
        super(builder);
        this.fastKPeriod = builder.fastKPeriod;
        this.fastDPeriod = builder.fastDPeriod;
        this.fastDMaType = builder.fastDMaType;
        this.time_period = builder.timePeriod;
        this.series_type = builder.seriesType;
    }

    public static class Builder extends IndicatorRequest.Builder<Builder> {

        private int fastKPeriod = 5;

        private int fastDPeriod = 3;

        private MAType fastDMaType = MAType.SMA;

        private int timePeriod;

        private SeriesType seriesType;

        public Builder() {
            this.function(Function.STOCHRSI);
        }

        public Builder fastKPeriod(int fastKPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder fastDPeriod(int fastDPeriod) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder fastDMaType(MAType type) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder timePeriod(int timePeriod) {
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
