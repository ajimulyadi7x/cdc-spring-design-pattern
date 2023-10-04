package com.cdc2023.springdesignpattern.abstract_factory;

public interface PaymentFactory {
    ChargePaymentRequest createChargeRequest();
    CancelPaymentRequest createCancelRequest();

    GetBalancePaymentRequest createGetBalanceRequest();
}
