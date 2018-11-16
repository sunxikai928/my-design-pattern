package com.github.sunxikai928.factory.four;

import com.github.sunxikai928.common.BaseClass;

/**
 * 型号为2的螺丝帽产品
 * <p>
 * Created by sunxikai on 18/11/15.
 */
public class ProductB2 extends BaseClass implements ProductB {

    @Override
    public void product() {
        println("型号为[2]的螺丝帽:" + this.getClassName());
    }
}
