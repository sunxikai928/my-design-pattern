package com.github.sunxikai928.singleton.register;

/**
 * Created by sunxikai on 18/11/23.
 */
public class Son1RegisterSingleton extends RegisterSingleton {
    protected Son1RegisterSingleton() {
    }

    /**
     * 静态方法提供具体实例
     */
    public static RegisterSingleton getInstance() {
        return RegisterSingleton.getInstance(Son1RegisterSingleton.class.getName());
    }
}
