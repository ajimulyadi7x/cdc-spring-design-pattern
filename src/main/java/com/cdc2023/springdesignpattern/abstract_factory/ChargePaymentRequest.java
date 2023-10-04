package com.cdc2023.springdesignpattern.abstract_factory;

public interface ChargePaymentRequest {

    String getId();
    void setId(String id);
    Long getAmount();
    void setAmount(Long amount);
    Long getFee();
    PaymentMethod getMethod();
}
