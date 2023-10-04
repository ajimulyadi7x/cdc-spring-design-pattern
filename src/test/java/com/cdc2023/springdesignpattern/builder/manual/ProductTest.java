package com.cdc2023.springdesignpattern.builder.manual;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testBuilder() {
        Product product = new Product.Builder().id("id").name("sabun").sku("sku").price(5000L).build();
        System.out.println(product);

    }

}