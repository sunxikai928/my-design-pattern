package com.github.sunxikai928.decorator;

/**
 * 具体构件角色
 * Created by sunxikai on 18/12/26.
 */
public class ConcreteComponent implements Component {

    @Override
    public void sampleOperation() {
        System.out.println("具体角色执行商业方法");
    }
}
