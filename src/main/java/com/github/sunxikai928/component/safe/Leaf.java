package com.github.sunxikai928.component.safe;

/**
 * 树叶节点
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
}
