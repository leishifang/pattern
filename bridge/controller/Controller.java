package pattern.bridge.controller;

import pattern.bridge.light.ILight;

/**
 * @author leishifang
 * @date 2019-07-15 18:08
 */
public class Controller extends AbsController {

    public Controller(ILight ILight) {
        super(ILight);
    }

    @Override
    public void pressTurnOffBtn() {
        System.out.println(getClass().getSimpleName()+" " + Thread.currentThread().getStackTrace()[1].getMethodName());

        mLight.turnOff();
    }

    @Override
    public void pressTurnOnBtn() {
        System.out.println(getClass().getSimpleName()+" " + Thread.currentThread().getStackTrace()[1].getMethodName());

        mLight.turnOn();
    }
}
