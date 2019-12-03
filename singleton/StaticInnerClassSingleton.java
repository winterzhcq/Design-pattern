package cn.winter.patterns.singleton;

/**
 * @author winter
 * @date 2019/12/3 22:03
 */
public class StaticInnerClassSingleton {
    /*
     * 利用类加载来保证同步，同时又能让外部来控制类加载的时机
     * 是懒汉模式和恶汉模式的中和
     * */
    private static class SingletongHolder{
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }
    private StaticInnerClassSingleton(){}
    public static final StaticInnerClassSingleton getInstance(){
        return SingletongHolder.instance;
    }
}
