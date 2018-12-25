package test.component.transparent;

import com.github.sunxikai928.component.transparent.Component;
import com.github.sunxikai928.component.transparent.Composite;
import com.github.sunxikai928.component.transparent.Leaf;
import org.junit.Test;

/**
 * 无法明确区分树枝节点与树叶节点
 * Created by sunxikai on 18/12/25.
 */
public class CompositeTest {

    @Test
    public void transparent() {
        // 父类接口就拥有了 聚集管理的方法
        Component composite = new Composite();
        // 添加树叶节点
        composite.add(new Leaf());
        // 添加有树叶的树枝节点
        Composite composite1 = new Composite();
        composite1.add(new Leaf());
        composite.add(composite1);
        // 添加空树枝节点
        composite.add(new Composite());
        // 调用商业方法所有的,所有树枝上的树叶节点的商业方法都会执行
        composite.sampleOperation();
    }
}
