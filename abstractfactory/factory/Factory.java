package pattern.abstractfactory.factory;

import pattern.abstractfactory.product.IProduct;
import pattern.abstractfactory.product.ProductA;
import pattern.abstractfactory.product.ProductB;

/**
 * @author leishifang
 * @date 2019-07-09 17:14
 */
public class Factory extends AbstractFactory {

    @Override
    public IProduct createProductA() {
        return new ProductA();
    }

    @Override
    public IProduct createProductB() {
        return new ProductB();
    }
}
