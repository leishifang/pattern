package pattern.nullpattern;

/**
 * @author leishifang
 * @date 2019-07-15 15:06
 */
public class Test {
    public static void main(String[] args) {


        System.out.println(CustomerFactory.getInstance().getCustomer("a").getName());
        System.out.println(CustomerFactory.getInstance().getCustomer("a ").getName());
        System.out.println(CustomerFactory.getInstance().getCustomer(null).getName());

    }
}
