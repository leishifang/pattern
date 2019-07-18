package pattern.flyweight;

/**
 * @author leishifang
 * @date 2019-07-17 11:50
 */
public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
