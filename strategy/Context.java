package pattern.strategy;

import pattern.strategy.strategy.IStrategy;

/**
 * @author leishifang
 * @date 2019-07-12 16:36
 */
public class Context implements IContext {
    private IStrategy strategy;

    @Override
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public int handleNumbers(int num1, int num2) {
        return strategy.execute(num1,num2);
    }
}
