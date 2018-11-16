package com.github.sunxikai928.factory.two;

import com.github.sunxikai928.common.BaseClass;

/**
 * Created by sunxikai on 18/11/15.
 */
public class StoneProduct extends BaseClass implements Product {
    @Override
    public void production() {
        println("具体产品 : " + this.getClassName());
    }
}
