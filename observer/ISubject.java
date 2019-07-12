package pattern.observer;

/**
 * @author leishifang
 * @date 2019-07-12 11:29
 */
public interface ISubject {
    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyAllObserver();
}
