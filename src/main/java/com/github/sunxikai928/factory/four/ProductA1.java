package com.github.sunxikai928.factory.four;

import com.github.sunxikai928.common.BaseClass;

/**
 * 型号为1的螺丝头
 * Created by sunxikai on 18/11/15.
 */
public class ProductA1 extends BaseClass implements ProductA {
    @Override
    public void product() {
        println("型号为[1]的螺丝头:" + this.getClassName());
    }
}
