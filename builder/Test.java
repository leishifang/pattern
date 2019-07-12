package pattern.builder;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * @author leishifang
 * @date 2019-07-10 10:52
 */
public class Test {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("123");
        stringBuilder.append("456");

        System.out.println(stringBuilder.toString());
    }
}
