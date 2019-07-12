package pattern.singleton;

/**
 * 饿汉型-线程安全
 *
 * @author leishifang
 * @date 2019-07-04 16:10
 */
public class SingletonHungeryDemo {


    private static SingletonHungeryDemo mInstance = new SingletonHungeryDemo();

    private SingletonHungeryDemo() {
        System.out.println("construct " + getClass().getSimpleName());
    }

    /**
     * 饿汉型
     * 可处理线程安全问题，但是静态实例化可能导致资源浪费
     * 线程安全
     *
     * @return
     */
    public static SingletonHungeryDemo getInstance() {
        return mInstance;
    }
}
