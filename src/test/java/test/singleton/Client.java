package test.singleton;

import com.github.sunxikai928.common.BaseClass;
import com.github.sunxikai928.singleton.eager.EagerSingleton;
import com.github.sunxikai928.singleton.lazy.LazySingleton;
import com.github.sunxikai928.singleton.register.RegisterSingleton;
import com.github.sunxikai928.singleton.register.Son1RegisterSingleton;
import com.github.sunxikai928.singleton.register.Son2RegisterSingleton;
import org.junit.Test;

/**
 * Created by sunxikai on 18/11/16.
 */
public class Client extends BaseClass {

    @Test
    public void test1() {
        RegisterSingleton r = RegisterSingleton.getInstance();
        RegisterSingleton rr = RegisterSingleton.getInstance();
        RegisterSingleton r1 = Son1RegisterSingleton.getInstance();
        RegisterSingleton rr1 = Son1RegisterSingleton.getInstance();
        RegisterSingleton r2 = Son2RegisterSingleton.getInstance();
        RegisterSingleton rr2 = Son2RegisterSingleton.getInstance();
        // 3次单例获取的都是相同的对象
        System.out.println(r == rr);
        System.out.println(r1 == rr1);
        System.out.println(r2 == rr2);
        r.product();
        r1.product();
        r2.product();
    }

    @Test
    public void test() {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.service();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.service();
    }
}
