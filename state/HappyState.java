package pattern.state;

/**
 * @author leishifang
 * @date 2019-07-12 14:12
 */
public class HappyState extends AbsState {
    public HappyState(Women women) {
        super(women);
    }

    @Override
    public void say() {
        System.out.println(women.getName() + " hello boy~" +this.getClass().getSimpleName());
    }

    @Override
    public void doSomeThing() {
        System.out.println(women.getName() + " cook for your~" + this.getClass().getSimpleName());
    }
}
