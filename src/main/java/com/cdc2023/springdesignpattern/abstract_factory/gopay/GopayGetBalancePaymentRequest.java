package com.cdc2023.springdesignpattern.abstract_factory.gopay;

import com.cdc2023.springdesignpattern.abstract_factory.GetBalancePaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class GopayGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.GOPAY;
    }
}
