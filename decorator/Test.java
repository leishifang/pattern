package pattern.decorator;

/**
 * @author leishifang
 * @date 2019-07-16 11:38
 */
public class Test {
    public static void main(String[] args) {
        ICustomer customer = new Customer();

        customer.buy();

        customer = new CustomerDecorator(customer);
        ((CustomerDecorator) customer).pay();
    }
}
