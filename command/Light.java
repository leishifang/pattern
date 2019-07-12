package pattern.command;

/**
 * @author leishifang
 * @date 2019-07-10 16:19
 */
public class Light {
    public void turnOn() {
        System.out.println(getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    public void turnOff() {
        System.out.println(getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
