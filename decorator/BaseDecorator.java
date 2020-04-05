package cn.winter.patterns.decorator;

/**
 * @author winter
 * @date 2020/4/5 23:33
 */
public abstract class BaseDecorator implements Compoent {
    private Compoent compoent;
    public BaseDecorator(Compoent compoent){
        this.compoent = compoent;
    }
    @Override
    public void decorator() {
        if (compoent != null)compoent.decorator();
    }
}
