package com.fag.domain.entities;

import java.util.UUID;

public class RechargeBO {
    private UUID id;
    private Double value;
    private String document;
    private Integer providerID;
    private PhoneBO phone;
    private String receipt;
    private Long transactionID;
    private boolean success;

    public RechargeBO(UUID id, Double value, String document, Integer providerID, PhoneBO phone, String receipt,
            Long transactionID, boolean success) {
        this.id = id != null ? id : UUID.randomUUID();
        this.value = value;
        this.document = document;
        this.providerID = providerID;
        this.phone = phone;
        this.receipt = receipt;
        this.transactionID = transactionID;
        this.success = success;

        validate();
    }

    public void handleSuccess(String receipt, Long transactionId) {
        this.receipt = receipt;
        this.transactionID = transactionId;
        this.success = true;
    }

    public void handleError() {
        this.success = false;
    }

    private void validate() {
        if(this.value == null) {
            throw new RuntimeException("Campo obrigatório - Value");
        }

        if(this.document == null || this.document.isEmpty()) {
            throw new RuntimeException("Campo obrigatório - Document");
        }

        if(this.phone == null) {
            throw new RuntimeException("Campo obrigatório - Phone");
        }
    }

    public UUID getId() {
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

    