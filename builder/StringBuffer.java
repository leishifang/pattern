package pattern.builder;

/**
 * @author leishifang
 * @date 2019-07-10 12:10
 */
public class StringBuffer extends AbstractStringBuilder {
    @Override
    public String toString() {
        return getClass().getSimpleName()+ " " + Thread.currentThread().getStackTrace()[1].getMethodName()+ "\n"
                + new String(value);
    }
}
