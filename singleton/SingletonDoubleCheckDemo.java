package pattern.singleton;

import java.io.Serializable;

/**
 * 双重校验锁-保证线程安全
 * 实现cloneable,serializable.防止clone攻击和序列化攻击
 *
 * @author leishifang
 * @date 2019-07-04 17:52
 */
public class SingletonDoubleCheckDemo implements Cloneable, Serializable {

    /**
     * 使用volatile，禁止指令重排
     * <p>
     * uniqueInstance = new singleton(); 这段代码其实是分为三步执行：
     * 1。为 singleton 分配内存空间
     * 2。初始化 uniqueInstance
     * 3。将 uniqueInstance 指向分配的内存地址
     */
    private static volatile SingletonDoubleCheckDemo mInstance;

    /**
     * 增加flag标记，防止反射攻击
     */
    private static boolean flag = false;

    private SingletonDoubleCheckDemo() {

        System.out.println("constructor " + getClass().getSimpleName());

        synchronized (SingletonDoubleCheckDemo.class) {
            if (flag) {
                throw new RuntimeException("非法创建单例");
            }
            flag = true;
        }

        //接下来正常初始化
    }

    public static SingletonDoubleCheckDemo getInstance() {

        if (mInstance == null) {
            synchronized (SingletonDoubleCheckDemo.class) {//避免重复实例化
                if (mInstance == null) {
                    mInstance = new SingletonDoubleCheckDemo();
                }
            }
        }

        return mInstance;
    }

    /**
     * 重写clone方法防止clone攻击
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }

    /**
     * 防止序列化攻击
     *
     * @return
     */
    private Object readResolve() {
        return getInstance();
    }
}
