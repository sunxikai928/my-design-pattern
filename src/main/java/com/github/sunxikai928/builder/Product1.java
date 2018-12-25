package com.github.sunxikai928.builder;

/**
 * Created by sunxikai on 18/12/24.
 */
public class Product1 extends Product {
    @Override
    public void product() {
        System.out.println("Product1" + " body " + getBody() + " message " + getMessage());
    }
}
