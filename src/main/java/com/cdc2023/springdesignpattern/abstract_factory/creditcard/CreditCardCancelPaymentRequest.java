package com.cdc2023.springdesignpattern.abstract_factory.creditcard;

import com.cdc2023.springdesignpattern.abstract_factory.CancelPaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class CreditCardCancelPaymentRequest implements CancelPaymentRequest {

    @Getter
    @Setter
    private String id;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.CREDITCARD;
    }
}
