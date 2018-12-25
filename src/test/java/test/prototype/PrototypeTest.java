package test.prototype;

import com.github.sunxikai928.prototype.Panda;
import com.github.sunxikai928.prototype.User;
import org.junit.Test;

/**
 * Created by sunxikai on 18/12/24.
 */
public class PrototypeTest {
    @Test
    public void test() throws CloneNotSupportedException {
        User u = new User();
        u.setName("小明");
        u.panda = new Panda();
        User u1 = u.getCloneUSer();
        System.out.println(u == u1);
        System.out.println(u.panda == u1.panda);
        System.out.println(u1.getName());
    }
}
