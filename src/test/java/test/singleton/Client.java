package test.singleton;

import com.github.sunxikai928.singleton.eager.EagerSingleton;
import com.github.sunxikai928.singleton.lazy.LazySingleton;
import org.junit.Test;

/**
 * Created by sunxikai on 18/11/16.
 */
public class Client {

    @Test
    public void test() {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.service();
        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.service();
    }
}
