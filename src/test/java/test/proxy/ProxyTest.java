package test.proxy;

import com.github.sunxikai928.proxy.jvm.KKK;
import com.github.sunxikai928.proxy.jvm.ObjectProxy;
import com.github.sunxikai928.proxy.jvm.TestKKK;
import com.github.sunxikai928.proxy.old.ProxySubject;
import com.github.sunxikai928.proxy.old.RelSubject;
import com.github.sunxikai928.proxy.old.Subject;
import org.junit.Test;

/**
 * Created by sunxikai on 18/12/28.
 */
public class ProxyTest {

    @Test
    public void test() {

        Subject subject = new ProxySubject(new RelSubject());
        subject.request();

        Subject ps = new ProxySubject();
        ps.request();
    }

    @Test
    public void test1() {
        KKK o = (KKK) ObjectProxy.factory(new TestKKK());
        o.hahah();
    }
}
