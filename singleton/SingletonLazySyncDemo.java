package pattern.singleton;

/**
 * 懒汉型2-线程安全
 *
 * @author leishifang
 * @date 2019-07-04 16:25
 */
public class SingletonLazySyncDemo {

    private static SingletonLazySyncDemo mInstance;

    /**
     * 标记单例是否已经创建过，防止反射攻击
     */
    private static boolean flag = false;

    private SingletonLazySyncDemo() {
        System.out.println("constructor " + getClass().getSimpleName());
        synchronized (SingletonLazySyncDemo.class) {
            if (flag) {
                throw new RuntimeException("非法创建单例 " + getClass().getSimpleName());
            }
            flag = true;
        }

        //接来下可正常初始化
    }

    /**
     * 对方法加锁，同一时间只能有一个线程能进入此方法。
     *
     * @return
     */
    public static synchronized SingletonLazySyncDemo getInstance() {
        if (mInstance == null) {
            mInstance = new SingletonLazySyncDemo();
        }
        return mInstance;
    }
}
