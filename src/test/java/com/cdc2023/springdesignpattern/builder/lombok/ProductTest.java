package com.cdc2023.springdesignpattern.builder.lombok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testBuilderLombok() {
        Product product = new Product.ProductBuilder().id("idLombok").name("lombokName").sku("skuLombok").price(100000L).build();

        System.out.println(product);
    }

}