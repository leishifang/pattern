package pattern.nullpattern;

/**
 * @author leishifang
 * @date 2019-07-15 15:27
 */
public class CustomerFactory {

    private static volatile CustomerFactory mInstance;

    public static CustomerFactory getInstance() {
        if (mInstance == null) {
            synchronized (CustomerFactory.class) {
                if (mInstance == null) {
                    mInstance = new CustomerFactory();
                }
            }
        }
        return mInstance;
    }

    private static String[] names = {"a", "b", "c"};

    public ICustomer getCustomer(String name) {
        for (String n : names) {
            if (n.equals(name)) {
                Customer customer = new Customer();
                customer.setName(name);
                return customer;
            }
        }
        return new NullCustomer();
    }
}
