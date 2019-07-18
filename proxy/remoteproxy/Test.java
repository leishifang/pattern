package pattern.proxy.remoteproxy;

/**
 * @author leishifang
 * @date 2019-07-18 10:29
 */
public class Test {
    public static void main(String[] args) {
        IOrderEngine orderEngine = new OrderEngineProxy();
        orderEngine.createOrder("😯", "💩");
    }
}
