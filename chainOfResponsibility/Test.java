package pattern.chainOfResponsibility;

import sun.security.ssl.Debug;

/**
 * @author leishifang
 * @date 2019-07-10 15:53
 */
public class Test {

    public static void main(String[] args) {
        AbstractLogger errorLogger = new ErrorLogger();
        errorLogger.writeMsg(AbstractLogger.TYPE_INFO,"error");
    }
}
