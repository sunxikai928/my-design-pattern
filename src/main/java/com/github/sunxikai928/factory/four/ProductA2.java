package com.github.sunxikai928.factory.four;

import com.github.sunxikai928.common.BaseClass;

/**
 * 型号为2的螺丝头
 * Created by sunxikai on 18/11/15.
 */
public class ProductA2 extends BaseClass implements ProductA {
    @Override
    public void product() {
        println("型号为[2]的螺丝头:" + this.getClassName());
    }
}
