package pattern.command;

import com.sun.javafx.binding.StringFormatter;

import java.text.Format;

/**
 * @author leishifang
 * @date 2019-07-10 16:26
 */
public class Test {

    public static void main(String[] args) {
        Light light = new Light();
        Invoker invoker = new Invoker(32);


        invoker.addCommand(new LightOffCommand(light))
                .addCommand(new LightOffCommand(light))
                .addCommand(new LightOnCommand(light))
                .addCommand(new LightOffCommand(light))
                .click()
                .click()
                .click();
    }
}
