package com.cdc2023.springdesignpattern.abstract_factory;

import com.cdc2023.springdesignpattern.abstract_factory.gopay.GopayCancelPaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.gopay.GopayChargePaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.gopay.GopayGetBalancePaymentRequest;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GopayPaymentFactory implements PaymentFactory {
    @Override
    public ChargePaymentRequest createChargeRequest() {
        return new GopayChargePaymentRequest();
    }

    @Override
    public CancelPaymentRequest createCancelRequest() {
        return new GopayCancelPaymentRequest();
    }

    @Override
    public GetBalancePaymentRequest createGetBalanceRequest() {
        return new GopayGetBalancePaymentRequest();
    }
}
