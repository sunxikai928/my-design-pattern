package test.decorator;

import com.github.sunxikai928.decorator.Component;
import com.github.sunxikai928.decorator.ConcreteComponent;
import com.github.sunxikai928.decorator.ConcreteDecorator;
import org.junit.Test;

/**
 * Created by sunxikai on 18/12/26.
 */
public class DecoratorTest {
    @Test
    public void test() {
        Component component = new ConcreteComponent();
        // 增强
        component = new ConcreteDecorator(component);
        component.sampleOperation();
    }
}
