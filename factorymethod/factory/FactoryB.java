package pattern.factorymethod.factory;

import pattern.factorymethod.product.IProduct;
import pattern.factorymethod.product.ProductB;

/**
 * @author leishifang
 * @date 2019-07-05 15:50
 */
public class FactoryB extends Factory {
    @Override
    public IProduct createProduct() {
        return new ProductB();
    }
}
