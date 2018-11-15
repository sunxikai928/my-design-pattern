package com.github.sunxikai928.factory.four;

/**
 * 抽象工厂模式
 * <p>
 * 生产一系列的产品,螺丝头(A)和螺丝帽(B)的关系
 * 产品大小必须一一对应
 * Created by sunxikai on 18/11/15.
 */
public interface Factory {

    ProductA factoryProductA();

    ProductB factoryProductB();
}
