package com.github.sunxikai928.factory.two;

/**
 * Created by sunxikai on 18/11/15.
 */
public class TwoClient {
    public void test() {
        Product easyFactory = ProductFactory.getProduct(ProductFactory.CONCRETE);
        easyFactory.production();
        easyFactory = ProductFactory.getProduct(ProductFactory.STONE);
        easyFactory.production();
    }
}
