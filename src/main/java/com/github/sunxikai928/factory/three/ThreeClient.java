package com.github.sunxikai928.factory.three;

/**
 * Created by sunxikai on 18/11/15.
 */
public class ThreeClient {
    public void test() {
        Factory factory;
        Product product;

        factory = new OneFactory();
        product = factory.factory();
        product.product();

        factory = new TwoFactory();
        product = factory.factory();
        product.product();
    }
}
