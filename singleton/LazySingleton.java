package cn.winter.patterns.singleton;

/**
 * @author winter
 * @date 2019/12/3 21:59
 */
public class LazySingleton {
    /**
     * volatile实现多线程下的原子性，解决指令重排问题
     */
    private static volatile LazySingleton singleton4;
    private LazySingleton(){}
    public static LazySingleton getSingleton4(){
        if (singleton4 == null){
            synchronized(LazySingleton.class){
                if (singleton4 == null)
                    singleton4 = new LazySingleton();
            }
        }
        return singleton4;
    }
}
