package pattern.decorator;

/**
 * @author leishifang
 * @date 2019-07-16 11:36
 */
public class Customer implements ICustomer {
    @Override
    public void buy() {
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
