package com.crazzyghost.alphavantage.sector.response;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.Parser;

/**
 * @author crazzyghost
 * @since 1.4.0
 * A sector performance response
 */
public final class SectorResponse {

    private MetaData metaData;

    private Map<String, SectorUnit> sectorUnits;

    private String errorMessage;

    private SectorResponse(MetaData metaData, Map<String, SectorUnit> sectorUnits) {
        this.metaData = metaData;
        this.sectorUnits = sectorUnits;
    }

    private SectorResponse(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public static SectorResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SectorUnit getRealTimePerformance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SectorUnit getOneDayPerformance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SectorUnit getFiveDayPerformance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SectorUnit getOneMonthPerformance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SectorUnit getThreeMonthPerformance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SectorUnit getYearToDatePerformance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SectorUnit getOneYearPerformance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SectorUnit getThreeYearPerformance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SectorUnit getFiveYearPerformance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SectorUnit getTenYearPerformance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class SectorParser extends Parser<SectorResponse> {

        @SuppressWarnings("unchecked")
        @Override
        public SectorResponse parse(Map<String, Object> stringObjectMap) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public SectorResponse onParseError(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    public static final class MetaData {

        private String information;

        private String lastRefreshed;

        public MetaData(String information, String lastRefreshed) {
            this.information = information;
            this.lastRefreshed = lastRefreshed;
        }

        public String getInformation() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public String getLastRefreshed() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public String toString() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
