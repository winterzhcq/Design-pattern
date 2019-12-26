package cn.winter.patterns.abstractfactory.productimpl;


import cn.winter.patterns.abstractfactory.ProductB;

/**
 * @author winter
 * @date 2019/12/2 22:17
 */
public class B1Product implements ProductB {
    @Override
    public String BdoSomething() {
        return "B1Product";
    }
}
