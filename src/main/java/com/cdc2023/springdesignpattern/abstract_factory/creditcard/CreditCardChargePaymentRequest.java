package com.cdc2023.springdesignpattern.abstract_factory.creditcard;

import com.cdc2023.springdesignpattern.abstract_factory.ChargePaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CreditCardChargePaymentRequest implements ChargePaymentRequest {

    @Getter
    @Setter
    private String id;

    @Getter
    @Setter
    private Long amount;

    @Override
    public Long getFee() {
        return getAmount() * 5 / 100;
    }

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDITCARD;
    }
}
