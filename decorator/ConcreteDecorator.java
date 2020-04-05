package cn.winter.patterns.decorator;

/**
 * @author winter
 * @date 2020/4/5 23:36
 */
public class ConcreteDecorator extends BaseDecorator {
    public ConcreteDecorator(Compoent compoent) {
        super(compoent);
    }
    @Override
    public void decorator(){
        System.out.println("增强的装饰器！");
        super.decorator();
    }
}
