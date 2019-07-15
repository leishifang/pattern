package pattern.bridge;

import pattern.bridge.controller.Controller;
import pattern.bridge.controller.IController;
import pattern.bridge.controller.OppositeController;
import pattern.bridge.light.BlackLight;
import pattern.bridge.light.ILight;
import pattern.bridge.light.RedLight;

/**
 * @author leishifang
 * @date 2019-07-15 17:57
 */
public class bridge {

    public static void main(String[] args) {

        ILight blackLight = new BlackLight();
        ILight redLight = new RedLight();

        IController controller = new Controller(redLight);
        IController oppositeController = new OppositeController(blackLight);

        controller.pressTurnOnBtn();
        controller.pressTurnOffBtn();

        oppositeController.pressTurnOnBtn();
        oppositeController.pressTurnOffBtn();
    }
}
