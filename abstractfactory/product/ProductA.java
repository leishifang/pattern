package pattern.abstractfactory.product;

/**
 * @author leishifang
 * @date 2019-07-09 17:08
 */
public class ProductA implements IProduct {


    @Override
    public void doo() {
        System.out.println(getClass().getSimpleName()+ " "+Thread.currentThread().getStackTrace()[1].getMethodName());

    }
}
