package pattern.simplefactory;

/**
 * @author leishifang
 * @date 2019-07-05 14:10
 */
public class ProductA implements IProduct {

    @Override
    public void saySomeThing() {
        System.out.println(getClass().getSimpleName());
    }
}
