package pattern.template;

/**
 * @author leishifang
 * @date 2019-07-12 17:31
 */
public abstract class Worker implements IWorker {

    @Override
    public final void whatADay() {

        gotoWork();
        working();
        afterWork();
    }

    protected abstract void gotoWork();

    protected abstract void working();

    protected abstract void afterWork();

}
