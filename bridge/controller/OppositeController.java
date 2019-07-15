package pattern.bridge;

/**
 * @author leishifang
 * @date 2019-07-15 18:17
 */
public class OppositeController extends AbsController {
    public OppositeController(ILight ILight) {
        super(ILight);
    }

    @Override
    public void pressTurnOffBtn() {
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName());
        mLight.turnOn();
    }

    @Override
    public void pressTurnOnBtn() {
        System.out.println(getClass().getSimpleName() + " " + Thread.currentThread().getStackTrace()[1].getMethodName());
        mLight.turnOff();
    }
}
