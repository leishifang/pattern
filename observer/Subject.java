package pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leishifang
 * @date 2019-07-12 11:32
 */
public class Subject implements ISubject {
    List<IObserver> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (IObserver observer : observers) {
            observer.onReceive();
        }
    }
}
