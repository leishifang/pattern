package pattern.bridge.light;

/**
 * @author leishifang
 * @date 2019-07-15 18:19
 */
public class RedLight implements ILight {
    @Override
    public void turnOff() {
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
