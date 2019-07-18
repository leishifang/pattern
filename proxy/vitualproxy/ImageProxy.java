package pattern.proxy.vitualproxy;

/**
 * @author leishifang
 * @date 2019-07-18 11:07
 */
public class ImageProxy implements IImage {
    private Image image;

    public ImageProxy(Image image) {
        this.image = image;
    }


    @Override
    public void showImg() {
        if (image.isLoad()) {
            image.showImg();
        } else {
            System.out.println("show placeholder img");
        }
    }
}
