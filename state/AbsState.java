package pattern.state;

/**
 * @author leishifang
 * @date 2019-07-12 14:18
 */
public abstract class AbsState implements IState{
    protected Women women;

    public AbsState(Women women) {
        this.women = women;
    }
}
