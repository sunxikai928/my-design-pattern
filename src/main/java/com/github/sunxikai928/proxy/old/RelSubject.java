package com.github.sunxikai928.proxy.old;

/**
 * 真实主题角色
 * Created by sunxikai on 18/12/28.
 */
public class RelSubject extends Subject {
    @Override
    public void request() {
        System.out.println("这是真实主题角色");
    }
}
