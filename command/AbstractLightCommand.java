package pattern.command;

/**
 * @author leishifang
 * @date 2019-07-10 16:22
 */
public abstract class AbstractLightCommand implements ICommand {
    protected Light mLight;

    public AbstractLightCommand(Light light) {
        this.mLight = light;
    }
}
