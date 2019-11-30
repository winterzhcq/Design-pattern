package cn.winter.patterns.strategy;

import cn.winter.patterns.strategy.impl.AStrategy;
import cn.winter.patterns.strategy.impl.BStrategy;
import cn.winter.patterns.strategy.impl.CStrategy;

/**
 * @author winter
 * @date 2019/11/30 21:30
 */
public class Main {

    public static void main(String[] args) {
        // A策略
        Context A = new Context(new AStrategy());
        A.execute();
        // B策略
        Context B = new Context(new BStrategy());
        B.execute();
        // C策略
        Context C = new Context(new CStrategy());
        C.execute();
    }

}
