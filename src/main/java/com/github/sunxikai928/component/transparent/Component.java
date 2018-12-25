package com.github.sunxikai928.component.transparent;

import java.util.Enumeration;

/**
 * Created by sunxikai on 18/12/25.
 */
public interface Component {
    /**
     * 返回自己的实例
     *
     * @return
     */
    Component getComposite();

    /**
     * 商业方法
     */
    void sampleOperation();

    /**
     * 聚集管理的方法,增加一个子构件
     *
     * @param component
     */
    void add(Component component);

    /**
     * 聚集管理的方法,删除一个子构件
     *
     * @param component
     */
    void remove(Component component);

    /**
     * 聚集管理的方法,返还聚集的Enumeration对象
     *
     * @return
     */
    Enumeration components();
}
