package pattern.factorymethod.factory;

import pattern.factorymethod.product.IProduct;
import pattern.factorymethod.product.ProductA;

/**
 * @author leishifang
 * @date 2019-07-05 15:50
 */
public class FactoryA extends Factory {
    @Override
    public IProduct createProduct() {
        return new ProductA();
    }
}
