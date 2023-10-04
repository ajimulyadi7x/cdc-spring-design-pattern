package com.cdc2023.springdesignpattern.abstract_factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = AbstractFactoryApplication.class)
class AbstractFactoryApplicationTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testAbstractFactory() {
        CreditCardPaymentFactory creditCardPaymentFactory = applicationContext.getBean(CreditCardPaymentFactory.class);
        GopayPaymentFactory gopayPaymentFactory = applicationContext.getBean(GopayPaymentFactory.class);
        KlikBCAPaymentFactory klikBCAPaymentFactory = applicationContext.getBean(KlikBCAPaymentFactory.class);

        charge(creditCardPaymentFactory);
        charge(gopayPaymentFactory);
        charge(klikBCAPaymentFactory);

    }

    public void charge(PaymentFactory paymentFactory) {
        ChargePaymentRequest request = paymentFactory.createChargeRequest();
        request.setId("xxx");
        request.setAmount(10000L);

        System.out.println(request);
    }

    public void cancel(PaymentFactory paymentFactory) {
        CancelPaymentRequest cancelPaymentRequest = paymentFactory.createCancelRequest();
        cancelPaymentRequest.setId("xxx");

        System.out.println(cancelPaymentRequest);
    }

    public void getBalance(PaymentFactory paymentFactory) {
        GetBalancePaymentRequest request = paymentFactory.createGetBalanceRequest();
        request.setUserId("userxxx");

        System.out.println(request);
    }
}