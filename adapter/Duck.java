package pattern.adapter;

/**
 * @author leishifang
 * @date 2019-07-15 16:40
 */
public class Duck implements IDuck {
    @Override
    public void quack() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
