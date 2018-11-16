package com.github.sunxikai928.singleton.lazy;

import com.github.sunxikai928.common.BaseClass;

/**
 * 懒汉式
 * <p>
 * 1. 构造函数私有化
 * 2. 提供获取实例的方法
 * <p>
 * Created by sunxikai on 18/11/16.
 */
public class LazySingleton extends BaseClass {

    private static LazySingleton LazySingleton = null;

    private LazySingleton() {
    }

    /**
     * 必须加锁,防止多线程并发访问
     *
     * @return
     */
    public synchronized static LazySingleton getInstance() {
        if (LazySingleton == null) {
            LazySingleton = new LazySingleton();
        }
        return LazySingleton;
    }

    /**
     * 业务方法
     */
    public void service() {
        println("懒汉式单例业务方法 : " + getClassName());
    }
}
