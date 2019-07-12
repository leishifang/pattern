package pattern.chainOfResponsibility;

/**
 * @author leishifang
 * @date 2019-07-10 15:25
 */
public class InfoLogger extends AbstractLogger {
    public InfoLogger() {
        super(AbstractLogger.TYPE_INFO);
    }

    @Override
    AbstractLogger setNextLogger() {
        return null;
    }

    @Override
    String write(String msg) {
        System.out.println(getClass().getSimpleName() + " "
                + Thread.currentThread().getStackTrace()[1].getMethodName() + " " + msg);
        return msg;
    }
}
