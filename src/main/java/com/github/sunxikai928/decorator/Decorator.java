package com.github.sunxikai928.decorator;

/**
 * 抽象装饰角色
 * Created by sunxikai on 18/12/26.
 */
public abstract class Decorator implements Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public Decorator() {
    }

    @Override
    public void sampleOperation() {
        component.sampleOperation();
    }
}
