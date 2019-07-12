package pattern.observer;

/**
 * @author leishifang
 * @date 2019-07-12 11:32
 */
public class Observer implements IObserver {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    @Override
    public void onReceive() {
        System.out.println(name + "  " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
