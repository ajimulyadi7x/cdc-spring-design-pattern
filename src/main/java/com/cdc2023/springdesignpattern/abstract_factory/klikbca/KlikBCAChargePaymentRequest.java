package com.cdc2023.springdesignpattern.abstract_factory.klikbca;

import com.cdc2023.springdesignpattern.abstract_factory.ChargePaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class KlikBCAChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return 5000L;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
