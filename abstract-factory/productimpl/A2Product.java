package cn.winter.patterns.abstractfactory.productimpl;


import cn.winter.patterns.abstractfactory.ProductA;

/**
 * @author winter
 * @date 2019/12/2 22:17
 */
public class A2Product implements ProductA {
    @Override
    public String AdoSomething() {
        return "A2Product";
    }
}
