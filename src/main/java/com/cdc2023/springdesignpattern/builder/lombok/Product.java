package com.cdc2023.springdesignpattern.builder.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@Getter
@ToString
public class Product {
    private String id;
    private String name;
    private Long price;
    private String sku;
}
