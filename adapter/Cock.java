package pattern.adapter;

/**
 * @author leishifang
 * @date 2019-07-15 16:44
 */
public class Cock implements ICock {
    @Override
    public void crow() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
