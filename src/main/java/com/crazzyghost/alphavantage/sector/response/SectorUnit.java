package com.crazzyghost.alphavantage.sector.response;

/**
 * @author crazzyghost
 * @since 1.4.0
 * A sector performance data structure
 */
public final class SectorUnit {

    private String informationTechnology;

    private String consumerDiscretionary;

    private String healthCare;

    private String communicationServices;

    private String realEstate;

    private String utilities;

    private String financials;

    private String materials;

    private String industrials;

    private String consumerStaples;

    private String energy;

    public SectorUnit(String informationTechnology, String consumerDiscretionary, String healthCare, String communicationServices, String realEstate, String utilities, String financials, String materials, String industrials, String consumerStaples, String energy) {
        this.informationTechnology = informationTechnology;
        this.consumerDiscretionary = consumerDiscretionary;
        this.healthCare = healthCare;
        this.communicationServices = communicationServices;
        this.realEstate = realEstate;
        this.utilities = utilities;
        this.financials = financials;
        this.materials = materials;
        this.industrials = industrials;
        this.consumerStaples = consumerStaples;
        this.energy = energy;
    }

    public String getInformationTechnology() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getConsumerDiscretionary() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getHealthCare() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getCommunicationServices() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getRealEstate() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getUtilities() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getFinancials() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMaterials() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getIndustrials() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getConsumerStaples() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getEnergy() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
