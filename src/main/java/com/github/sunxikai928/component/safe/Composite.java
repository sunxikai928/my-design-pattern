package com.github.sunxikai928.component.safe;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 树枝节点
 * Created by sunxikai on 18/12/25.
 */
public class Composite implements Component {
    private Vector vector = new Vector();

    @Override
    public Component getComposite() {
        return this;
    }

    /**
     * 实际是最终调用叶子节点的商业方法
     */
    @Override
    public void sampleOperation() {
        Enumeration enumeration = components();
        while (enumeration.hasMoreElements()) {
            ((Component) enumeration.nextElement()).sampleOperation();
        }
    }

    /**
     * 聚集管理的方法,增加一个子构件
     *
     * @param component
     */
    public void add(Component component) {
        vector.addElement(component);
    }

    /**
     * 聚集管理的方法,删除一个子构件
     *
     * @param component
     */
    public void remove(Component component) {
        vector.removeElement(component);
    }

    /**
     * 聚集管理的方法,返还聚集的Enumeration对象
     *
     * @return
     */
    public Enumeration components() {
        return vector.elements();
    }
}
