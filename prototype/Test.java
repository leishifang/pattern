package pattern.prototype;

/**
 * @author leishifang
 * @date 2019-07-10 14:40
 */
public class Test {

    public static void main(String[] args) {
        PrototypeClass prototypeClass = new PrototypeClass("1");
        PrototypeClass prototypeClass1 = (PrototypeClass) prototypeClass.mClone();
        System.out.println(prototypeClass.toString() + " " + prototypeClass1.toString());
    }
}
