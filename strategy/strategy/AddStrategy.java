package pattern.strategy.strategy;

/**
 * @author leishifang
 * @date 2019-07-12 16:38
 */
public class AddStrategy implements IStrategy {
    @Override
    public int execute(int num1, int num2) {
        return num1 + num2;
    }
}
