package com.github.sunxikai928.singleton.register;

/**
 * Created by sunxikai on 18/11/23.
 */
public class Son2RegisterSingleton extends RegisterSingleton {
    protected Son2RegisterSingleton() {
    }

    /**
     * 静态方法提供具体实例
     */
    public static RegisterSingleton getInstance() {
        return RegisterSingleton.getInstance(Son2RegisterSingleton.class.getName());
    }
}
