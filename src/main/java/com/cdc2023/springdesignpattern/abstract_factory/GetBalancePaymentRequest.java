package com.cdc2023.springdesignpattern.abstract_factory;

public interface GetBalancePaymentRequest {
    String getUserId();
    void setUserId(String userId);
    PaymentMethod getMethod();
}
