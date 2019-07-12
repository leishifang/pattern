package pattern.singleton;

/**
 * @author leishifang
 * @date 2019-07-04 18:22
 */
public class SingletonStaticInnerClassDemo {

    private SingletonStaticInnerClassDemo() {
        System.out.println("construct " + getClass().getSimpleName());
    }

    private static class InstanceHolder {
        private static SingletonStaticInnerClassDemo INSTANCE = new SingletonStaticInnerClassDemo();
    }

    public static SingletonStaticInnerClassDemo getInstance() {
        return InstanceHolder.INSTANCE;
    }
}
