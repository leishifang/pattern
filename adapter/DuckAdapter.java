package pattern.adapter;

/**
 * 公鸡冒充鸭子
 * （已有鸭子功能，想让公鸡也能呱呱叫）
 *
 * @author leishifang
 * @date 2019-07-15 16:53
 */
public class DuckAdapter implements ICock {
    private IDuck duck;

    public DuckAdapter(IDuck duck) {
        this.duck = duck;
    }

    @Override
    public void crow() {
        System.out.println(getClass().getSimpleName() + " 公鸡冒充鸭子 ");
        duck.quack();
    }
}
