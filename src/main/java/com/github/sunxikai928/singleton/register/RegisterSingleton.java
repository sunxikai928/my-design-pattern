package com.github.sunxikai928.singleton.register;

import com.github.sunxikai928.common.BaseClass;
import com.sun.tools.javac.util.Assert;

import java.util.HashMap;
import java.util.Objects;

/**
 * 注册式单例
 * 子类的构造函数必须是 public 否则父类无法创建
 * <p>
 * Created by sunxikai on 18/11/23.
 */
public class RegisterSingleton extends BaseClass {
    // HashMap保存已生成的实例
    private static HashMap<String, Object> bean_map = new HashMap<>();

    /**
     * 限制级构造函数
     */
    protected RegisterSingleton() {
    }

    /**
     * 静态方法提供具体实例
     */
    public static RegisterSingleton getInstance() {
        return RegisterSingleton.getInstance(RegisterSingleton.class.getName());
    }

    /**
     * 静态方法提供具体实例
     * 方法限制为受保护的这样可以保证不会有未知方法的调用
     *
     * java与模式原书中该方法是 public 的,任何地方都可调用并未对类型是否该类的子类进行判断
     */
    protected static synchronized RegisterSingleton getInstance(String name) {
        Assert.checkNonNull(name);
        if (Objects.isNull(bean_map.get(name))) {
            try {
                bean_map.put(name,
                        Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (RegisterSingleton) bean_map.get(name);
    }

    public void product() {
        println("注册单例的商业方法 : " + getClassName());
    }
}
