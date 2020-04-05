package cn.winter.patterns.decorator;

/**
 * @author winter
 * @date 2020/4/5 23:38
 */
public class Main {
    public static void main(String[] args) {
        Compoent compoent = new Decorator();
        Compoent cucreateDecorator = new ConcreteDecorator(compoent);
        cucreateDecorator.decorator();
    }
}
