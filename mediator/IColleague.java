package pattern.mediator;

/**
 * @author leishifang
 * @date 2019-07-11 10:53
 */
public interface IColleague {
    void doSomeThing();

    void notifyOther(IMediator mediator);
}
