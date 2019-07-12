package pattern.command;

/**
 * @author leishifang
 * @date 2019-07-10 16:34
 */
public class Invoker {

    private ICommand[] commands;
    private int count;

    public Invoker(int capacity) {
        commands = new ICommand[capacity];
    }

    public Invoker addCommand(ICommand command) {
        commands[count++] = command;
        return this;
    }

    public Invoker click() {
        commands[count - 1].execute();
        count--;
        return this;
    }
}
