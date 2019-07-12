package pattern.strategy.strategy;

import pattern.strategy.strategy.IStrategy;

/**
 * @author leishifang
 * @date 2019-07-12 16:43
 */
public class SubtractionStrategy implements IStrategy {
    @Override
    public int execute(int num1, int num2) {
        return num1 - num2;
    }
}
