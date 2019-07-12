package pattern.mediator;

/**
 * @author leishifang
 * @date 2019-07-11 10:54
 */
public class ColleagueA implements IColleague {
    @Override
    public void doSomeThing() {
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @Override
    public void notifyOther(IMediator mediator) {
        mediator.notifyEvent(this);
    }
}
