package cn.winter.patterns.abstractfactory.factoryimpl;

import cn.winter.patterns.abstractfactory.Factory;
import cn.winter.patterns.abstractfactory.productimpl.CProduct;

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
