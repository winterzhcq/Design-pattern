package cn.winter.patterns.observer;

import cn.winter.patterns.observer.impl.ObserverA;
import cn.winter.patterns.observer.impl.ObserverB;
import cn.winter.patterns.observer.impl.ObserverC;

/**
 * @author winter
 * @date 2020/1/4 10:51
 */
public class Client {
    public static void main(String[] args) {
        Observable observer = new Observable();
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        Observer observerC = new ObserverC();
        observer.addObserver(observerA);
        observer.addObserver(observerB);
        observer.addObserver(observerC);
        observer.setChanged();
        observer.notifyObservers();
    }
}
