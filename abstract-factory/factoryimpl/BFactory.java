package cn.winter.patterns.abstractfactory.factoryimpl;

import cn.winter.patterns.abstractfactory.Factory;
import cn.winter.patterns.abstractfactory.Product;
import cn.winter.patterns.abstractfactory.productimpl.BProduct;

/**
 * @author winter
 * @date 2019/12/2 22:36
 */
public class BFactory implements Factory<Product> {
    @Override
    public BProduct product() {
        return  new BProduct();
    }
}
