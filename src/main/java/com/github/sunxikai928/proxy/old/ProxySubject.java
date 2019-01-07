package com.github.sunxikai928.proxy.old;

/**
 * 代理主题角色
 * Created by sunxikai on 18/12/28.
 */
public class ProxySubject extends Subject {

    private Subject subject;

    public ProxySubject() {
    }

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        if (this.subject == null) {
            this.subject = new RelSubject();
        }
        System.out.println("这是代理");
        subject.request();
    }
}
