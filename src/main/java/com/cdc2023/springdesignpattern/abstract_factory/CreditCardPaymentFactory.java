package com.cdc2023.springdesignpattern.abstract_factory;

import com.cdc2023.springdesignpattern.abstract_factory.creditcard.CreditCardCancelPaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.creditcard.CreditCardChargePaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.creditcard.CreditCardGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreditCardPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new CreditCardChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new CreditCardCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        throw new UnsupportedOperationException("Get Balance is not supported for Credit Card");
    }
}
