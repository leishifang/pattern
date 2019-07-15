package pattern.adapter;

import java.text.CollationKey;

/**
 * @author leishifang
 * @date 2019-07-15 16:45
 */
public class Test {
    public static void main(String[] args) {
        ICock cock = new Cock();
//        cock.crow();

        IDuck duck = new Duck();
//        duck.quack();

        IDuck duck1 = new CockAdapter2(cock);
        System.out.println("duck1.quack()");
        duck1.quack();

        //(公鸡冒充鸭子）
        ICock cock1 = new DuckAdapter(duck);
        System.out.println("cock1.crow()");
        cock1.crow();
    }
}
