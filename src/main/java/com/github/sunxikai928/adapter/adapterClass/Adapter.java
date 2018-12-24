package com.github.sunxikai928.adapter.adapterClass;


/**
 * Created by sunxikai on 18/12/24.
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void sample1() {
        sample2();
    }
}
