package pattern.nullpattern;

/**
 * @author leishifang
 * @date 2019-07-15 15:36
 */
public abstract class AbsCustomer implements ICustomer {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getName();
}
