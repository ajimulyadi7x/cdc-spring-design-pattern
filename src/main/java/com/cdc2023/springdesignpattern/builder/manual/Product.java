package com.cdc2023.springdesignpattern.builder.manual;

public class Product {
    private String id;
    private String name;
    private Long price;
    private String sku;

    private Product() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public static class Builder {
        private final Product product = new Product();

        public Builder id(String id) {
            product.id = id;
            return this;
        }

        public Builder name(String name) {
            product.name = name;
            return this;
        }

        public Builder price(Long price) {
            product.price = price;
            return this;
        }

        public Builder sku(String sku) {
            product.sku = sku;
            return this;
        }

        public Product build() {
            return product;
        }
    }

    @Override
    public String toString() {
        return "Product{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", price=" + price + ", sku='" + sku + '\''
                + '}';
    }
}
