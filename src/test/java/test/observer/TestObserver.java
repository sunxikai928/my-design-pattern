package test.observer;

import com.github.sunxikai928.observer.MyObservable;
import com.github.sunxikai928.observer.MyObserver;
import org.junit.Test;

import java.util.Observable;
import java.util.Observer;

/**
 * 实现观察者接口{@link Observer}
 * 并且注入到被观察着中{@link Observable}
 * Created by sunxikai on 18/12/13.
 */
public class TestObserver {
    @Test
    public void test(){
        MyObservable observable = new MyObservable();
        new MyObserver(observable);
        observable.test();
    }
}
