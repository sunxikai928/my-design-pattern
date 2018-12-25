package com.github.sunxikai928.component.safe;

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
}
