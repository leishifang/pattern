package pattern.command;

import javax.management.loading.MLet;

/**
 * @author leishifang
 * @date 2019-07-10 16:16
 */
public class LightOnCommand extends AbstractLightCommand{
    public LightOnCommand(Light light) {
        super(light);
    }

    @Override
    public void execute() {
        mLight.turnOn();
    }
}
