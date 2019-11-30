package cn.winter.patterns.strategy;

/**
 * @author winter
 * @date 2019/11/30 21:25
 */
public class Context {

    private IStrategy strategy;

    public Context(IStrategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doSomething();
    }

}
