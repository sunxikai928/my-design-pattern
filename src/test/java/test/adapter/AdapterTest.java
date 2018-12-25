package test.adapter;

import org.junit.Test;

/**
 * Created by sunxikai on 18/12/24.
 */
public class AdapterTest {

    @Test
    public void test() {
        com.github.sunxikai928.adapter.adapterClass.Target target = new com.github.sunxikai928.adapter.adapterClass.Adapter();
        target.sample1();
    }

    @Test
    public void test2() {
        com.github.sunxikai928.adapter.adapterObject.Target target = new com.github.sunxikai928.adapter.adapterObject.Adapter();
        target.sample1();
    }
}
