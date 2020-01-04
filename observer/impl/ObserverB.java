package cn.winter.patterns.observer.impl;

import cn.winter.patterns.observer.Observable;
import cn.winter.patterns.observer.Observer;

/**
 * @author winter
 * @date 2020/1/4 10:45
 */
public class ObserverB implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("监听的对象是B,发生状态变化的对象为"+o+"接收到的参数为"+arg);
    }
}
