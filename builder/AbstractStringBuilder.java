package pattern.builder;

/**
 * @author leishifang
 * @date 2019-07-10 11:24
 */
public abstract class AbstractStringBuilder {

    protected char[] value;

    protected int length;

    public AbstractStringBuilder() {
        this(1024);
    }

    public AbstractStringBuilder(int capacity) {
        value = new char[capacity];
    }

    public AbstractStringBuilder append(String str) {
//        str.getChars(0, str.length(), value, length);

        add(value, str);
        length += str.length();

        return this;
    }

    public char[] add(char[] chars, String str) {
        //check params
        char[] strChars = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            chars[length + i] = strChars[i];
        }
        return chars;
    }

    public abstract String toString();

    public int getCapacity() {
        return value.length;
    }

    public int getLength() {
        return length;
    }
}
