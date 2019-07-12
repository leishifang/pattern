package pattern.strategy;

import pattern.strategy.Context;
import pattern.strategy.IContext;
import pattern.strategy.strategy.AddStrategy;
import pattern.strategy.strategy.IStrategy;
import pattern.strategy.strategy.SubtractionStrategy;

import java.util.Comparator;
import java.util.function.Function;

/**
 * @author leishifang
 * @date 2019-07-12 16:47
 */
public class Test {
    public static void main(String[] args) {
        IContext context = new Context();

        context.setStrategy(new AddStrategy());
        System.out.println("AddStrategy " + context.handleNumbers(3, 4));

        context.setStrategy(new SubtractionStrategy());
        System.out.println("SubtractionStrategy " + context.handleNumbers(3, 4));

        context.setStrategy(new IStrategy() {
            @Override
            public int execute(int num1, int num2) {
                return num2 - num1;
            }
        });
        System.out.println("custon strategy = " + context.handleNumbers(3, 4));
    }
}
