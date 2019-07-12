package pattern.simplefactory;

/**
 * @author leishifang
 * @date 2019-07-05 14:17
 */
public class Test {

    public static void main(String[] args) {
       IProduct product;
        product = getProductBySimpleFactory(SimpleFactory.B);
//        product = getProduct(SimpleFactory.A);
        product.saySomeThing();
    }

    /**
     * 不漂亮的实现方式，出现这种场景。应考虑使用简单工厂来实现
     */
    private  static IProduct getProduct(int type) {
        IProduct product = null;

        if (type == SimpleFactory.A) {
            product = new ProductA();
        } else if (type == SimpleFactory.B) {
            product = new ProductB();
        }
        return product;
    }

    /**
     * 通过简单工厂获取具体子类
     *
     * @param type
     * @return
     */
    private static IProduct getProductBySimpleFactory(int type) {
        return SimpleFactory.getInstance().createProduct(type);
    }
}
