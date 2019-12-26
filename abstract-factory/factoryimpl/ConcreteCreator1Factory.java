package cn.winter.patterns.abstractfactory.factoryimpl;

import cn.winter.patterns.abstractfactory.Factory;
import cn.winter.patterns.abstractfactory.ProductA;
import cn.winter.patterns.abstractfactory.ProductB;
import cn.winter.patterns.abstractfactory.productimpl.A1Product;
import cn.winter.patterns.abstractfactory.productimpl.B1Product;

/**
 * @author winter
 * @date 2019/12/2 22:36
 */
public class ConcreteCreator1Factory implements Factory {

    @Override
    public ProductA factoryA() {
        return new A1Product();
    }

    @Override
    public ProductB factoryB() {
        return new B1Product();
    }
}
