package com.github.sunxikai928.factory.three;

/**
 * 具体工厂
 * <p>
 * Created by sunxikai on 18/11/15.
 */
public class TwoFactory implements Factory {

    @Override
    public Product factory() {
        return new TwoProduct();
    }
}
