package designmode.observer;

import designmode.observer.impl.MyObserver1;
import designmode.observer.impl.MyObserver2;
import designmode.observer.impl.MySubject;

public class Test {
    public static void main(String[] args) {
        Observer observer1 = new MyObserver1();
        Observer observer2 = new MyObserver2();

        Subject subject = new MySubject();
        subject.register(observer1);
        subject.register(observer2);

        subject.notifyMessage("hello world");

        subject.unregister(observer1);
        subject.notifyMessage("good bye");
    }
}
