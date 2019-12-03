package cn.winter.patterns.singleton;

/**
 * 懒汉式
 *
 * @author winter
 * @date 2019/12/3 21:55
 */
public class HungrySingleton {
    private HungrySingleton() {}//防止外界通过构造方法创建实例

    private static final HungrySingleton singleton = new HungrySingleton();//方法二:使用私有修饰符修饰实例，外界可以通过getSingleton得到该实例

    public static HungrySingleton getSingleton() {
        return singleton;
    }
}
