package cn.winter.patterns.abstractfactory;


import cn.winter.patterns.abstractfactory.factoryimpl.ConcreteCreator1Factory;

/**
 * 工厂中的两个工厂方法代表不同的产品等级，组合在一起叫做一个产品族
 * 抽象工厂就是为了简化工厂方法，系统的产品多余一个产品族，而系统的
 * 去消费某一个族的产品，详细参考java与模式
 * @author winter
 * @date 2019/12/2 22:40
 */
public class Main {
    public static void main(String[] args) {
        // 处理不同A1，B1两种不同等级产品，合起来叫一个产品族
        Factory factory1 = new ConcreteCreator1Factory();
        ProductA productA1 = factory1.factoryA();
        productA1.AdoSomething();
        ProductB productB1 = factory1.factoryB();
        productB1.hashCode();

        // 处理不同A2，B2两种不同等级产品，合起来叫一个产品族
        Factory factory2 = new ConcreteCreator1Factory();
        ProductA productA2 = factory2.factoryA();
        productA1.AdoSomething();
        ProductB productB2 = factory2.factoryB();
        productB2.hashCode();
    }
}
