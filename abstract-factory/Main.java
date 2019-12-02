package cn.winter.patterns.abstractfactory;

import cn.winter.patterns.abstractfactory.factoryimpl.AFactory;
import cn.winter.patterns.abstractfactory.factoryimpl.BFactory;

/**
 * @author winter
 * @date 2019/12/2 22:40
 */
public class Main {
    public static void main(String[] args) {
        // 把A交给A工厂处理
        Factory<Product> factoryA = new AFactory();
        Product productA = factoryA.product();
        System.out.println(productA.doSomething());

        // 把B交给B工厂处理
        Factory<Product> factoryB = new BFactory();
        Product productb = factoryB.product();
        System.out.println(productb.doSomething());
    }
}
