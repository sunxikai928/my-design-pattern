package com.github.sunxikai928.factory.client;

import com.github.sunxikai928.factory.four.FourClient;
import com.github.sunxikai928.factory.one.OneClient;
import com.github.sunxikai928.factory.three.ThreeClient;
import com.github.sunxikai928.factory.two.TwoClient;

/**
 * 工厂模式的客户端
 * <p>
 * Created by sunxikai on 18/11/15.
 */
public class EasyClient {

    public static void main(String[] args) {
        int who = 1;
        switch (who) {
            case 1:
                testOne();
//                break;
            case 2:
                testTwo();
//                break;
            case 3:
                testThree();
//                break;
            case 4:
                testfour();
                break;
            default:
                break;
        }
    }

    private static void testfour() {
        new FourClient().test();
    }

    public static void testThree() {
        new ThreeClient().test();
    }

    public static void testTwo() {
        new TwoClient().test();
    }

    public static void testOne() {
        new OneClient().test();
    }

}
