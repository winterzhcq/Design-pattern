package cn.winter.patterns.decorator;

/**
 *
 * @author winter
 * @date 2020/4/5 23:32
 */
public  class Decorator implements Compoent {

    @Override
    public void decorator() {
        System.out.println("基本的装饰器实现！");
    }
}
