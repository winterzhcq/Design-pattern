package cn.winter.patterns.abstractfactory.factoryimpl;

import cn.winter.patterns.abstractfactory.Factory;
import cn.winter.patterns.abstractfactory.Product;
import cn.winter.patterns.abstractfactory.productimpl.AProduct;

/**
 * @author winter
 * @date 2019/12/2 22:36
 */
public class AFactory implements Factory<Product> {
    @Override
    public AProduct product() {
        return  new AProduct();
    }
}
