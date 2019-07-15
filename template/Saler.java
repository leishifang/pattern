package pattern.template;

/**
 * @author leishifang
 * @date 2019-07-12 17:37
 */
public class Saler extends Worker {

    @Override
    protected void gotoWork() {
        System.out.println(this.getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + " by bus");
    }

    @Override
    protected void working() {
        System.out.println(this.getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + " talking");
    }

    @Override
    protected void afterWork() {
        System.out.println(this.getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + " drinking");
    }
}
