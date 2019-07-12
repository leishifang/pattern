package pattern.state;

/**
 * @author leishifang
 * @date 2019-07-12 14:12
 */
public class Women {
    private IState happyState;
    private IState sadState;
    private IState angryState;

    private String name;
    private IState mCurrentState;

    public Women(String name) {
        this.name = name;

        happyState = new HappyState(this);
        sadState = new SadState(this);
        angryState = new AngryState(this);

        mCurrentState = happyState;
    }

    public void giveMoney(float amount) {
        if (amount > 1000) {
            mCurrentState = happyState;
        } else if (amount > 100 && amount < 1000) {
            mCurrentState = sadState;
        } else {
            mCurrentState = angryState;
        }
    }

    public void talk() {
        mCurrentState.say();
    }

    public void play() {
        mCurrentState.doSomeThing();
    }

    public String getName() {
        return name;
    }
}
