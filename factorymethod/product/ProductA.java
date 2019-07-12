package pattern.factorymethod.product;

import pattern.factorymethod.product.IProduct;

/**
 * @author leishifang
 * @date 2019-07-05 15:47
 */
public class ProductA implements IProduct {
    @Override
    public void saySomeThing() {
        System.out.println(getClass().getSimpleName());
    }
}
