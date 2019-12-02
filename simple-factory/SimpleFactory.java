package cn.winter.patterns.simplefactory;

import cn.winter.patterns.simplefactory.impl.AProduct;
import cn.winter.patterns.simplefactory.impl.BProduct;
import cn.winter.patterns.simplefactory.impl.CProduct;

/**
 * @author winter
 * @date 2019/12/2 22:19
 */
public class SimpleFactory {
    public static Product createProduct(String s) {
        Product product = null;
        if ("A".equals(s)) {
            product = new AProduct();
        } else if ("B".equals(s)) {
            product = new BProduct();
        } else
            product = new CProduct();
        return product;
    }
}
