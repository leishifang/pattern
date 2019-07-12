package pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * @author leishifang
 * @date 2019-07-04 14:44
 */
public class Test {

    public static void main(String[] args) {
//        testLazy();
        reflectAttack();
    }

    /**
     * 反射攻击
     */
    private static void reflectAttack() {
        Class clz = SingletonDoubleCheckDemo.class;
        try {
            Constructor constructor = clz.getDeclaredConstructor();
            constructor.setAccessible(true);//放开访问权限
            //通过反射创建的单例对象
            SingletonDoubleCheckDemo singleton = (SingletonDoubleCheckDemo) constructor.newInstance();
            //正常获取的单例对象
            SingletonDoubleCheckDemo singleton2 = SingletonDoubleCheckDemo.getInstance();
            //判断两个对象是否相等，为false说明创建了两个单例对象，即攻击成功
            System.out.println(singleton == singleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void testHungery() {
        for (int i = 0; i < 1000; i++) {
            new Thread() {
                @Override
                public void run() {
                    SingletonStaticInnerClassDemo.getInstance();
                }
            }.start();
        }
    }

    private static void testInnerClass() {
        for (int i = 0; i < 1000; i++) {
            new Thread() {
                @Override
                public void run() {
                    SingletonStaticInnerClassDemo.getInstance();
                }
            }.start();
        }
    }

    private static void testLazy() {
        for (int i = 0; i < 1000; i++) {
            new Thread() {
                @Override
                public void run() {
                    SingletonLazyDemo.getInstance();
                }
            }.start();
        }
    }
}
