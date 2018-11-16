package com.github.sunxikai928.singleton.eager;

import com.github.sunxikai928.common.BaseClass;

/**
 * 饿汉式
 * <p>
 * 1. 构造函数私有化
 * 2. 提供获取实例的方法
 * <p>
 * Created by sunxikai on 18/11/16.
 */
public class EagerSingleton extends BaseClass {

    private static final EagerSingleton eagerSingleton = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return eagerSingleton;
    }

    /**
     * 业务方法
     */
    public void service() {
        println("饿汉式单例业务方法 : " + getClassName());
    }

}
