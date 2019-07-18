package pattern.proxy.vitualproxy;

/**
 * @author leishifang
 * @date 2019-07-18 11:03
 */
public class Image implements IImage {
    private String url;
    private int height;
    private int weight;

    public Image(String url) {
        this.url = url;
        this.weight = 100;
        this.height = 40;
    }

    public boolean isLoad() {
        return false;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void showImg() {
        System.out.println(getClass().getSimpleName() +
                " " + Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}
