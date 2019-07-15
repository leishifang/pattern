package pattern.template;

/**
 * @author leishifang
 * @date 2019-07-12 17:39
 */
public class Boss extends Worker {
    @Override
    protected void gotoWork() {
        System.out.println(this.getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + " fly");
    }

    @Override
    protected void working() {
        System.out.println(this.getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + " count money");
    }

    @Override
    protected void afterWork() {
        System.out.println(this.getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + " count money overtime");
    }
}
