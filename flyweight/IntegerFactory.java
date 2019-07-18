package pattern.flyweight;

/**
 * @author leishifang
 * @date 2019-07-17 11:52
 */
public class IntegerFactory {
    //*********使用Map等容器来存储细粒度对象***************
    private MyInteger[] cache = new MyInteger[1000];

    public MyInteger getInteger(int i) {
        if (cache[i] == null) {
            return cache[i] = new MyInteger(i);
        }
        return cache[i];
    }
}
