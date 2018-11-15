package com.github.sunxikai928.factory.two;

/**
 * 这种也是简单工厂模式
 * <p>
 * Created by sunxikai on 18/11/15.
 */
public class ProductFactory {

    public static final String CONCRETE = "CONCRETE";
    public static final String STONE = "STONE";

    /**
     * 默认返回
     *
     * @return
     */
    public static Product getProduct() {
        return getProduct(CONCRETE);
    }

    /**
     * 根据参数返回
     *
     * @return
     */
    public static Product getProduct(String param) {
        switch (param) {
            case CONCRETE:
                return new ConcreteProduct();
            case STONE:
                return new StoneProduct();
            default:
                return null;
        }
    }

}
