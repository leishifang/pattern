package pattern.adapter;

/**
 * 鸭子冒充公鸡
 * 已有公鸡crow，想让duck也能crow
 *
 * @author leishifang
 * @date 2019-07-15 17:20
 */
public class CockAdapter2 implements IDuck {
    private ICock cock;

    public CockAdapter2(ICock cock) {
        this.cock = cock;
    }

    @Override
    public void quack() {
        System.out.println(getClass().getSimpleName() + " 鸭子冒充公鸡 ");
        cock.crow();
    }
}
