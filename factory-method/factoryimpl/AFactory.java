package cn.winter.patterns.factorymethod.factoryimpl;

import cn.winter.patterns.abstractfactory.Product;
import cn.winter.patterns.abstractfactory.productimpl.AProduct;
import cn.winter.patterns.factorymethod.Factory;

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
