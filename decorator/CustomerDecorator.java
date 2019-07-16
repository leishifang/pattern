package pattern.decorator;

/**
 * @author leishifang
 * @date 2019-07-16 11:37
 */
public class CustomerDecorator implements ICustomer {
    private ICustomer mCustomer;

    /**
     * @param mCustomer 欲被修饰的已有类
     */
    public CustomerDecorator(ICustomer mCustomer) {
        this.mCustomer = mCustomer;
    }

    /**
     * 不改变已有类的结构
     */
    @Override
    public void buy() {
        mCustomer.buy();
    }

    /**
     * 相当于往已有的Customer类添加了新功能
     */
    public void pay() {
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
