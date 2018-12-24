package com.github.sunxikai928.builder;

/**
 * 抽象建造者
 * Created by sunxikai on 18/12/24.
 */
public interface Builder {

    /**
     * 建造方法
     */
    void buildMessage(String message);

    /**
     * 建造方法
     */
    void buildBody(String body);

    /**
     * 获得产品
     */
    Product getProduct();
}
