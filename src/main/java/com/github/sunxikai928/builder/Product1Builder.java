package com.github.sunxikai928.builder;

/**
 * Created by sunxikai on 18/12/24.
 */
public class Product1Builder implements Builder {

    private Product product = new Product1();

    @Override
    public void buildMessage(String message) {
        product.setMessage(message);
    }

    @Override
    public void buildBody(String body) {
        product.setBody(body);
    }

    @Override
    public Product getProduct() {
        return product;
    }

    public static Builder newBuilder() {
        return new Product1Builder();
    }
}
