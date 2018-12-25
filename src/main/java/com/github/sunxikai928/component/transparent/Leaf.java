package com.github.sunxikai928.component.transparent;

import java.util.Enumeration;

/**
 * Created by sunxikai on 18/12/25.
 */
public class Leaf implements Component {

    @Override
    public Component getComposite() {
        return null;
    }

    @Override
    public void sampleOperation() {
        System.out.println("树叶节点");
    }

    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Enumeration components() {
        return null;
    }
}
