package pattern.observer;

/**
 * @author leishifang
 * @date 2019-07-12 11:31
 */
public class Test {
    public static void main(String[] args) {
        ISubject subject = new Subject();

        IObserver ob1 = new Observer("1");
        IObserver ob2 = new Observer("2");
        IObserver ob3 = new Observer("3");
        IObserver ob4 = new Observer("4");

        subject.registerObserver(ob1);
        subject.registerObserver(ob2);
        subject.registerObserver(ob3);
        subject.registerObserver(ob4);

        subject.notifyAllObserver();

        subject.removeObserver(ob2);
        subject.notifyAllObserver();
    }
}
