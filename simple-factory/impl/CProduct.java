package cn.winter.patterns.simplefactory.impl;

import cn.winter.patterns.simplefactory.Product;

/**
 * @author winter
 * @date 2019/12/2 22:17
 */
public class CProduct implements Product {
    @Override
    public String doSomething() {
        return "BProduct";
    }
}
