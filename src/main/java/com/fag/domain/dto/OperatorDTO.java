package com.fag.domain.dto;

public class OperatorDTO {
    private Integer category;
    private String name;
    private Integer providerID;
    private Double maxValue;
    private Double minValue;

    public void setCategory(Integer category) {
        this.category = category;
    }
    
    public Integer getCategory() {
        return category;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }
    public Double getMinValue() {
        return minValue;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setProviderID(Integer providerID) {
        this.providerID = providerID;
    }

    public Integer getProviderID() {
        return providerID;
    }

}
