package cn.winter.patterns.simplefactory;

/**
 * @author winter
 * @date 2019/12/2 22:23
 */
public class Main {
    public static void main(String[] args) {
        Product a = SimpleFactory.createProduct("A");
        System.out.println(a.doSomething());

        Product b = SimpleFactory.createProduct("B");
        System.out.println(b.doSomething());
    }
}
