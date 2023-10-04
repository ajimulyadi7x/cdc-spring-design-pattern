package com.cdc2023.springdesignpattern.abstract_factory.klikbca;

import com.cdc2023.springdesignpattern.abstract_factory.GetBalancePaymentRequest;
import com.cdc2023.springdesignpattern.abstract_factory.PaymentMethod;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class KlikBCAGetBalancePaymentRequest implements GetBalancePaymentRequest {

    @Getter
    @Setter
    private String userId;

    @Override
    public PaymentMethod getMethod() {
        return PaymentMethod.BCA_KLIKPAY;
    }
}
