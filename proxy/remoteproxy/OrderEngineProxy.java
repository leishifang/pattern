package pattern.proxy.remoteproxy;

/**
 * @author leishifang
 * @date 2019-07-18 10:30
 */
public class OrderEngineProxy implements IOrderEngine {
    private OrderRemote orderRemote;

    public OrderEngineProxy() {

    }

    @Override
    public void createOrder(String name, String food) {
        if (orderRemote == null) {
            //从远端获取具体实现类
            orderRemote = new OrderRemote();
        }
        orderRemote.createOrder(name, food);
    }
}
