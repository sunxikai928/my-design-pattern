package com.github.sunxikai928.factory.four;

/**
 * Created by sunxikai on 18/11/15.
 */
public class FourClient {
    public void test() {
        System.out.println("需要型号为[1]的螺丝一套");
        Factory f1 = new Factory1();
        f1.factoryProductA().product();
        f1.factoryProductB().product();

        System.out.println();

        System.out.println("需要型号为[2]的螺丝一套");
        Factory f2 = new Factory2();
        f2.factoryProductA().product();
        f2.factoryProductB().product();
    }
}
