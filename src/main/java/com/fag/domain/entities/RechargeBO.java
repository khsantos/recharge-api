package com.fag.domain.entities;

import java.util.UUID;

public class RechargeBO {
    private Integer id;
    private Double value;
    private String document;
    private Integer providerID;
    private PhoneBO phone;
    private String receipt;
    private Long transactionID;
    private boolean success;

    public RechargeBO(Integer id, Double value, String document, Integer providerID, PhoneBO phone, String receipt,
            Long transactionID, boolean success) {
        this.id = id;
        this.value = value;
        this.document = document;
        this.providerID = providerID;
        this.phone = phone;
        this.receipt = receipt;
        this.transactionID = transactionID;
        this.success = success;
    }

    public Integer getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    public String getDocument() {
        return document;
    }

    public Integer getProviderID() {
        return providerID;
    }

    public PhoneBO getPhone() {
        return phone;
    }

    public String getReceipt() {
        return receipt;
    }

    public Long getTransactionID() {
        return transactionID;
    }

    public boolean isSuccess() {
        return success;
    }
}

    