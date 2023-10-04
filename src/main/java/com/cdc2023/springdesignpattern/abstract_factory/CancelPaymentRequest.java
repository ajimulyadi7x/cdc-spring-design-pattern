package com.cdc2023.springdesignpattern.abstract_factory;

public interface CancelPaymentRequest {

    String getId();
    void setId(String id);
    PaymentMethod getMethod();

}
