package com.github.sunxikai928.decorator;

/**
 * 抽象装饰角色
 * Created by sunxikai on 18/12/26.
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    /**
     * 具体如何增强要看业务需要
     */
    @Override
    public void sampleOperation() {
        super.sampleOperation();
        System.out.println("增强类执行了");
    }
}
