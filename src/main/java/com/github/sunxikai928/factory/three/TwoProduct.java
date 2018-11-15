package com.github.sunxikai928.factory.three;

import com.github.sunxikai928.common.BaseClass;

/**
 * 具体产品
 * <p>
 * Created by sunxikai on 18/11/15.
 */
public class TwoProduct extends BaseClass implements Product {
    @Override
    public void product() {
        System.out.println("二号产品:" + getClassName());
    }
}
