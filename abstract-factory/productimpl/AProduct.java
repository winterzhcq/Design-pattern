package cn.winter.patterns.abstractfactory.productimpl;


import cn.winter.patterns.abstractfactory.Product;

/**
 * @author winter
 * @date 2019/12/2 22:17
 */
public class AProduct implements Product {
    @Override
    public String doSomething() {
        return "AProduct";
    }
}
