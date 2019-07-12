package pattern.simplefactory;

/**
 * @author leishifang
 * @date 2019-07-05 14:10
 */
public class SimpleFactory {

    public static final int A = 55;
    public static final int B = 948;

    private static volatile SimpleFactory mInstance;

    private SimpleFactory() {

    }

    public static SimpleFactory getInstance() {
        if (mInstance == null) {
            synchronized (SimpleFactory.class) {
                if (mInstance == null) {
                    mInstance = new SimpleFactory();
                }
            }
        }
        return mInstance;
    }

    public IProduct createProduct(int type) {
        switch (type) {
            case A:
                return new ProductA();
            case B:
                return new ProductB();
            default:
                return null;
        }
    }
}
