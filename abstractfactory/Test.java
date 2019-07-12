package pattern.abstractfactory;

import pattern.abstractfactory.factory.AbstractFactory;
import pattern.abstractfactory.factory.Factory;
import pattern.abstractfactory.factory.Factory1;

/**
 * @author leishifang
 * @date 2019-07-09 17:16
 */
public class Test {

    public static void main(String[] args) {
        AbstractFactory factory = new Factory();

        factory.createProductA().doo();
        factory.createProductB().doo();

        factory = new Factory1();
        factory.createProductA().doo();
        factory.createProductB().doo();
    }
}
