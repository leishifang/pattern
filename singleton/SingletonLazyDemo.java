package pattern.singleton;

/**
 * 懒汉型1-线程不安全
 *
 * @author leishifang
 * @date 2019-07-04 14:37
 */
public class SingletonLazyDemo {


    private static SingletonLazyDemo mInstance;

    private SingletonLazyDemo() {
        System.out.println("construct " + getClass().getSimpleName());
    }

    /**
     * 懒汉型 延迟实例化，需要用到的时候才实例，可节约资源
     * 线程不安全
     *
     * @param data
     * @return
     */
    public static SingletonLazyDemo getInstance() {
        if (mInstance == null) { //多线程环境下，可同时进入
            mInstance = new SingletonLazyDemo();
        }
        return mInstance;
    }
}
