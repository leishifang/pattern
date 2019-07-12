package pattern.abstractfactory.factory;

import pattern.abstractfactory.product.*;

/**
 * @author leishifang
 * @date 2019-07-09 17:14
 */
public class Factory1 extends AbstractFactory {
    @Override
    public IProduct createProductA() {
        return new ProductA1();
    }

    @Override
    public IProduct createProductB() {
        return new ProductB1();
    }
}
