package com.cdc2023.springdesignpattern.abstract_factory;

import com.cdc2023.springdesignpattern.abstract_factory.klikbca.KlikBCACancelPaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.klikbca.KlikBCAChargePaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.klikbca.KlikBCAGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KlikBCAPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new KlikBCAChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new KlikBCACancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new KlikBCAGetBalancePaymentRequest();
    }
}
