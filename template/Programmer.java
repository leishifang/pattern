package pattern.template;

/**
 * @author leishifang
 * @date 2019-07-12 17:34
 */
public class Programmer extends Worker {
    @Override
    protected void gotoWork() {
        System.out.println(this.getClass().getSimpleName()
                + " " + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + " by subway");
    }

    @Override
    protected void working() {
        System.out.println(this.getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + " coding");
    }

    @Override
    protected void afterWork() {
        System.out.println(this.getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + " go home");
    }
}
