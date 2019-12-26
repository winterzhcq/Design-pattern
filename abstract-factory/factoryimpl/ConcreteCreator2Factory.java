package cn.winter.patterns.abstractfactory.factoryimpl;

import cn.winter.patterns.abstractfactory.Factory;
import cn.winter.patterns.abstractfactory.ProductA;
import cn.winter.patterns.abstractfactory.ProductB;
import cn.winter.patterns.abstractfactory.productimpl.A2Product;
import cn.winter.patterns.abstractfactory.productimpl.B2Product;

/**
 * @author winter
 * @date 2019/12/2 22:36
 */
public class ConcreteCreator2Factory implements Factory {

    @Override
    public ProductA factoryA() {
        return new A2Product();
    }

    @Override
    public ProductB factoryB() {
        return new B2Product();
    }
}
