package pattern.mediator;

import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author leishifang
 * @date 2019-07-11 10:48
 */
public class Test {

    public static void main(String[] args) {
        IColleague colleagueA = new ColleagueA();
        IColleague colleagueB = new ColleagueB();
        Mediator mediator = new Mediator(colleagueA,colleagueB);


        colleagueA.doSomeThing();
        colleagueA.notifyOther(mediator);
    }
}
