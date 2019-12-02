package cn.winter.patterns.factorymethod.factoryimpl;

import cn.winter.patterns.abstractfactory.productimpl.CProduct;
import cn.winter.patterns.factorymethod.Factory;

/**
 * @author winter
 * @date 2019/12/2 22:36
 */
public class CFactory implements Factory<CProduct> {
    @Override
    public CProduct product() {
        return new CProduct();
    }
}
