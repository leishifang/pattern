package pattern.prototype;

/**
 * @author leishifang
 * @date 2019-07-10 14:38
 */
public class PrototypeClass extends AbstractPrototypeClass {

    String type;

    public PrototypeClass(String type) {
        this.type = type;
    }


    @Override
    public AbstractPrototypeClass mClone() {
        return new PrototypeClass(type);
    }

    @Override
    public String toString() {
        return type + " "+this.hashCode();
    }
}
