package cn.winter.patterns.strategy.impl;

import cn.winter.patterns.strategy.IStrategy;

/**
 * @author winter
 * @date 2019/11/30 21:22
 */
public class BStrategy implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("执行B策略");
    }
}
