package test.component.safe;

import com.github.sunxikai928.component.safe.Component;
import com.github.sunxikai928.component.safe.Composite;
import com.github.sunxikai928.component.safe.Leaf;
import org.junit.Test;

/**
 * 可以明确区分树枝节点与树叶节点,但是它们的类型不一样了
 * Created by sunxikai on 18/12/25.
 */
public class ComponentTest {

    @Test
    public void safe() {
        Composite composite = new Composite();
        // 添加树叶节点
        composite.add(new Leaf());
        // 添加有树叶的树枝节点
        Composite composite1 = new Composite();
        composite1.add(new Leaf());
        composite.add(composite1);
        // 添加空树枝节点
        composite.add(new Composite());
        // 向上转为父类型
        Component component = composite;
        // 调用商业方法所有的,所有树枝上的树叶节点的商业方法都会执行
        component.sampleOperation();
    }
}
