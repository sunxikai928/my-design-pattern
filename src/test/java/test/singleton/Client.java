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
        String name = null;
        String name1 = Son1RegisterSingleton.class.getName();
        String name2 = Son2RegisterSingleton.class.getName();
        RegisterSingleton r = RegisterSingleton.getInstance(name);
        RegisterSingleton rr = RegisterSingleton.getInstance(name);
        RegisterSingleton r1 = RegisterSingleton.getInstance(name1);
        RegisterSingleton rr1 = RegisterSingleton.getInstance(name1);
        RegisterSingleton r2 = RegisterSingleton.getInstance(name2);
        RegisterSingleton rr2 = RegisterSingleton.getInstance(name2);
        // 3次单例获取的都是相同的对象
        System.out.println(r == rr);
        System.out.println(r1 == rr1);
        System.out.println(r2 == rr2);
    }

    @Test
    public void test() {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.service();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.service();
    }
}
