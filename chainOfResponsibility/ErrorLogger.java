package pattern.chainOfResponsibility;

/**
 * @author leishifang
 * @date 2019-07-10 15:24
 */
public class ErrorLogger extends AbstractLogger {
    public ErrorLogger() {
        super(AbstractLogger.TYPE_ERROR);
    }

    @Override
    AbstractLogger setNextLogger() {
        return DebugLogger.getInstance();
    }

    @Override
    String write(String msg) {
        System.out.println(getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + msg);
        return msg;
    }
}
