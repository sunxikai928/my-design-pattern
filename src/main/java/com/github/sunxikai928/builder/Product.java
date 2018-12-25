package com.github.sunxikai928.builder;

/**
 * 抽象产品
 * Created by sunxikai on 18/12/24.
 */
public abstract class Product {

    private String body;

    private String message;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public abstract void product();
}
