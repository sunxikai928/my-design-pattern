package com.github.sunxikai928.builder;

/**
 * Created by sunxikai on 18/12/24.
 */
public class Product2 extends Product {
    @Override
    public void product() {
        System.out.println("Product2" + " body " + getBody() + " message " + getMessage());
    }
}
