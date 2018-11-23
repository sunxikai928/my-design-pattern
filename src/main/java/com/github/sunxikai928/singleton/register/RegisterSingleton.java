package com.github.sunxikai928.singleton.register;

import com.github.sunxikai928.common.BaseClass;

import java.util.HashMap;
import java.util.Objects;

/**
 * 注册式单例
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
    public static synchronized RegisterSingleton getInstance(String name) {
        if (Objects.isNull(name)) {
            name = RegisterSingleton.class.getName();
        }
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
