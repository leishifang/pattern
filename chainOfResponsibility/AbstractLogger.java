package pattern.chainOfResponsibility;

import sun.security.jca.GetInstance;

/**
 * @author leishifang
 * @date 2019-07-10 15:24
 */
public abstract class AbstractLogger {

    public static final int TYPE_ERROR = 3;
    public static final int TYPE_DEBUG = 2;
    public static final int TYPE_INFO = 1;

    protected int mLevel;

    protected AbstractLogger mNextLogger;

    protected AbstractLogger(int level) {
        this.mLevel = level;
        mNextLogger = setNextLogger();
    }


    public void writeMsg(int level, String msg) {
        if (mLevel <= level) {
            write(msg);
        } else {
            mNextLogger.writeMsg(level, msg);
        }
    }

    abstract AbstractLogger setNextLogger();

    abstract String write(String msg);
}
