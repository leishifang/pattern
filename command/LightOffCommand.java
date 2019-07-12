package pattern.command;

/**
 * @author leishifang
 * @date 2019-07-10 16:18
 */
public class LightOffCommand extends AbstractLightCommand {
    public LightOffCommand(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        mLight.turnOff();
    }
}
