package pattern.proxy.vitualproxy;

/**
 * @author leishifang
 * @date 2019-07-18 11:08
 */
public class Test {
    public static void main(String[] args) {
        Image image = new Image("aa.com/aa.jpg");

        ImageProxy imageProxy = new ImageProxy(image);
        imageProxy.showImg();
    }
}
