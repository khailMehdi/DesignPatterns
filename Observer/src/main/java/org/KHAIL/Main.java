package org.KHAIL;

import org.KHAIL.obs.*;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();

        Observer observer=new ObserverImpl();
        Observer observer2=new ObserverImpl2();
        observable.subscribe(observer);
        observable.subscribe(observer2);
        observable.setState(40);
        observable.setState(50);
        observable.unsubscribe(observer);
        observable.unsubscribe(observer2);
        observable.setState(70);

    }
}