package pattern.mediator;

import javax.print.attribute.standard.Media;

/**
 * @author leishifang
 * @date 2019-07-11 10:55
 */
public class Mediator implements IMediator {

    private IColleague mColleagueA;
    private IColleague mColleagueB;

    public Mediator(IColleague mColleagueA, IColleague mColleagueB) {
        this.mColleagueA = mColleagueA;
        this.mColleagueB = mColleagueB;
    }

    @Override
    public void notifyEvent(IColleague colleague) {
        if (colleague instanceof ColleagueA) {
            mColleagueB.doSomeThing();
        } else if (colleague instanceof ColleagueB) {
            mColleagueA.doSomeThing();
        }
    }
}
