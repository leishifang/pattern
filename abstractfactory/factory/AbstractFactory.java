package pattern.abstractfactory.factory;

import pattern.abstractfactory.product.*;

/**
 * @author leishifang
 * @date 2019-07-09 14:52
 */
public abstract class AbstractFactory {

    public abstract IProduct createProductA();

    public abstract IProduct createProductB();
}
