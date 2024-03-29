package pattern.bridge.controller;

import pattern.bridge.light.ILight;

/**
 * @author leishifang
 * @date 2019-07-15 18:07
 */
public abstract class AbsController implements IController {
    protected ILight mLight;

    public AbsController(ILight ILight) {
        this.mLight = ILight;
    }
}
