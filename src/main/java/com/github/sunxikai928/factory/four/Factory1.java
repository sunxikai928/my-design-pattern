package com.github.sunxikai928.factory.four;

/**
 * Created by sunxikai on 18/11/15.
 */
public class Factory1 implements Factory{

    @Override
    public ProductA factoryProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB factoryProductB() {
        return new ProductB1();
    }
}
