package com.cdc2023.springdesignpattern.abstract_factory.klikbca;

import com.cdc2023.springdesignpattern.abstract_factory.CancelPaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class KlikBCACancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
