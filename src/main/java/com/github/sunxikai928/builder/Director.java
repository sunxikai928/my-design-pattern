package com.github.sunxikai928.builder;

/**
 * 导演角色
 * Created by sunxikai on 18/12/24.
 */
public class Director {

    /**
     * 建造者角色
     */
    protected Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildBody("body");
        builder.buildMessage("message");
        Product p = builder.getProduct();
        p.product();
    }


}
