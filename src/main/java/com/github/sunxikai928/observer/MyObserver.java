package com.github.sunxikai928.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 实现观察者接口{@link Observer}
 * 并且注入到被观察着中{@link Observable}
 * Created by sunxikai on 18/12/13.
 */
public class MyObserver implements Observer {

    public MyObserver(Observable observable) {
        observable.addObserver(this);
    }

    /**
     * 当被观察者发生特定工作时被调用
     *
     * @param o   具体的被观察者
     * @param arg 传递的参数
     */
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(arg);
    }
}
