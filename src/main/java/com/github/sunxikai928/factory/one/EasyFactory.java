package com.github.sunxikai928.factory.one;

import com.github.sunxikai928.common.BaseClass;

/**
 * 简略版简单工厂模式
 * <p>
 * Created by sunxikai on 18/11/15.
 */
public class EasyFactory extends BaseClass {

    /**
     * 私有化构造函数
     */
    private EasyFactory() {
    }

    /**
     * 获取自身对象
     *
     * @return
     */
    public static EasyFactory getNewEasyFactory() {
        return new EasyFactory();
    }

    public void production() {
        println("简单工厂生产的产品 : " + this.getClassName());
    }
}
