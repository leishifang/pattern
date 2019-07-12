package pattern.chainOfResponsibility;

/**
 * @author leishifang
 * @date 2019-07-10 15:24
 */
public class DebugLogger extends AbstractLogger {

    private static volatile DebugLogger mInstance;

    public static DebugLogger getInstance() {
        if (mInstance == null) {
            synchronized (DebugLogger.class) {
                if (mInstance == null) {
                    mInstance = new DebugLogger();
                }
            }
        }
        return mInstance;
    }

    private DebugLogger() {
        super(AbstractLogger.TYPE_DEBUG);
    }

    @Override
    AbstractLogger setNextLogger() {
        return new InfoLogger();
    }

    @Override
    String write(String msg) {
        System.out.println(getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + msg);
        return msg;
    }
}
