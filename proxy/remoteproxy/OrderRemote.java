package pattern.proxy.remoteproxy;

/**
 * @author leishifang
 * @date 2019-07-18 10:28
 */
public class OrderRemote implements IOrderEngine {
    @Override
    public void createOrder(String name, String food) {
        System.out.println(getClass().getSimpleName()
                + " " + Thread.currentThread().getStackTrace()[1].getMethodName()
                + " name=" + name
                + " food=" + food);
    }
}
