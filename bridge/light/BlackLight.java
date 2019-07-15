package pattern.bridge.light;

/**
 * @author leishifang
 * @date 2019-07-15 18:23
 */
public class BlackLight implements ILight {
    @Override
    public void turnOff() {
        System.out.println(getClass().getSimpleName()+" " + Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @Override
    public void turnOn() {
        System.out.println(getClass().getSimpleName()+" " + Thread.currentThread().getStackTrace()[1].getMethodName());

    }
}
