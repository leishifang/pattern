package pattern.strategy;

import pattern.strategy.strategy.IStrategy;

/**
 * @author leishifang
 * @date 2019-07-12 16:35
 */
public interface IContext {
    void setStrategy(IStrategy strategy);

    int handleNumbers(int num1, int num2);
}
