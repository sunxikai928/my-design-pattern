package com.github.sunxikai928.proxy.jvm;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by sunxikai on 18/12/28.
 */
public class ObjectProxy implements InvocationHandler {
    /**
     * 持有一个对象的引用,只对该对象的类型进行代理
     */
    private Object object;

    public ObjectProxy(Object object) {
        this.object = object;
    }

    public static Object factory(Object obj) {
        Class cls = obj.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new ObjectProxy(obj));
    }

    /**
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理开始");
        Object o = method.invoke(proxy, args);
        System.out.println("代理结束");
        return o;
    }
}
