package com.github.sunxikai928.observer;

import java.util.Observable;

/**
 * 被观察者{@link Observable}
 * 当被观察者执行{@link Observable#notifyObservers()}的时候就会通知所有已经在本对象中注册的观察者{@link java.util.Observer}
 * 当被观察者执行{@link Observable#notifyObservers(Object)}的时候就会通知所有已经在本对象中注册的观察者{@link java.util.Observer}并可传递参数
 * Created by sunxikai on 18/12/13.
 */
public class MyObservable extends Observable {
    public void test() {
        System.out.println("宇宙飞船上天");
        notifyHandle("宇宙飞船已经上天");
    }

    /**
     * 通知并还原状态
     */
    protected void notifyHandle(Object obj){
        // 表示该对象的状态已经改变
        setChanged();
        // 调用notifyObservers 通知观察者
        notifyObservers(obj);
        // 本次通知完成后将状态还原
        clearChanged();
    }
}
