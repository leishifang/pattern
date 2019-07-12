package pattern.state;

/**
 * @author leishifang
 * @date 2019-07-12 14:12
 */
public class SadState extends AbsState {
    public SadState(Women women) {
        super(women);
    }

    @Override
    public void say() {
        System.out.println(women.getName() + " just leave me alone " +this.getClass().getSimpleName());
    }

    @Override
    public void doSomeThing() {
        System.out.println(women.getName() + " hit you " +this.getClass().getSimpleName());
    }
}
