package pattern.flyweight;

/**
 * @author leishifang
 * @date 2019-07-17 11:39
 */
public class Test {
    public static void main(String[] args) {

        IntegerFactory integerFactory = new IntegerFactory();
        MyInteger integer = integerFactory.getInteger(1);
        MyInteger integer1 = integerFactory.getInteger(1);

        MyInteger integer2 = integerFactory.getInteger(2);

        System.out.println(integer == integer1);
        System.out.println(integer == integer2);
    }

    private static void testInteger() {
        //内部使用了享元模式实现的缓存池
        Integer i = Integer.valueOf("1");
        Integer j = Integer.valueOf(1);

        Integer j2 = new Integer(1);

        System.out.println(i == j); //true 说明内部返回了同一个缓存对象
        System.out.println(i == j2); //false
    }
}
