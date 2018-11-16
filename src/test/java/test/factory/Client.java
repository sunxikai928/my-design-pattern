package test.factory;

import com.github.sunxikai928.factory.four.FourClient;
import com.github.sunxikai928.factory.one.OneClient;
import com.github.sunxikai928.factory.three.ThreeClient;
import com.github.sunxikai928.factory.two.TwoClient;
import org.junit.Test;

/**
 * Created by sunxikai on 18/11/16.
 */
public class Client {

    @Test
    public void testfour() {
        new FourClient().test();
    }

    @Test
    public void testThree() {
        new ThreeClient().test();
    }

    @Test
    public void testTwo() {
        new TwoClient().test();
    }

    @Test
    public void testOne() {
        new OneClient().test();
    }
}
