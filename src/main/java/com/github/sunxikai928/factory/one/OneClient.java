package com.github.sunxikai928.factory.one;

/**
 * Created by sunxikai on 18/11/15.
 */
public class OneClient {
    public void test() {
        EasyFactory easyFactory = EasyFactory.getNewEasyFactory();
        System.out.println(easyFactory.production());
    }
}
