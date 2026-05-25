package com.crazzyghost.alphavantage.forex.response;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.crazzyghost.alphavantage.parser.DefaultParser;
import com.crazzyghost.alphavantage.parser.Parser;

public class ForexResponse {

    private MetaData metaData;

    private List<ForexUnit> forexUnits;

    private String errorMessage;

    private ForexResponse(MetaData metaData, List<ForexUnit> forexUnits) {
        this.metaData = metaData;
        this.forexUnits = forexUnits;
        this.errorMessage = null;
    }

    private ForexResponse(String errorMessage) {
        this.metaData = MetaData.empty();
        this.forexUnits = new ArrayList<>();
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public MetaData getMetaData() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<ForexUnit> getForexUnits() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static ForexResponse of(Map<String, Object> stringObjectMap) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class ForexParser extends DefaultParser<ForexResponse> {

        @Override
        public ForexResponse onParseError(String error) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        @Override
        public ForexResponse parse(Map<String, String> metaDataMap, Map<String, Map<String, String>> units) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
