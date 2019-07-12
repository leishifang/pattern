package pattern.state;

/**
 * @author leishifang
 * @date 2019-07-12 14:12
 */
public class AngryState extends AbsState {

    public AngryState(Women women) {
        super(women);
    }

    @Override
    public void say() {
        System.out.println(women.getName() + " say: " + "fuck off!" + this.getClass().getSimpleName());
    }

    @Override
    public void doSomeThing() {
        System.out.println(women.getName() + " play with your ball!" +this.getClass().getSimpleName());
    }
}
