package com.github.sunxikai928.adapter.adapterObject;


/**
 * Created by sunxikai on 18/12/24.
 */
public class Adapter implements Target {

    protected Adaptee adaptee = new Adaptee();

    @Override
    public void sample1() {
        adaptee.sample2();
    }
}
