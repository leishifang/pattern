package pattern.factorymethod.factory;

import pattern.factorymethod.product.IProduct;

/**
 * @author leishifang
 * @date 2019-07-05 15:35
 */
public abstract class Factory {

    public void saySomeThing() {
        IProduct product = createProduct();
        product.saySomeThing();
    }

    public abstract IProduct createProduct();
}
