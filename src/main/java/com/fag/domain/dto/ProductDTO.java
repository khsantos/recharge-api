package com.fag.domain.dto;

public class ProductDTO {
    private String name;
    private Double value;
    private Integer due;

    public void setDue(Integer due) {
        this.due = due;
    }
    
    public Integer getDue() {
        return due;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
