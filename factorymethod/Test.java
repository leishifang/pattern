package pattern.factorymethod;

import pattern.factorymethod.factory.Factory;
import pattern.factorymethod.factory.FactoryA;
import pattern.factorymethod.factory.FactoryB;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author leishifang
 * @date 2019-07-05 15:12
 */
public class Test {

    public static void main(String[] args) {

//        System.out.println(NumberFormat.getCurrencyInstance(Locale.US).format(12345.678));
//        System.out.println(NumberFormat.getCurrencyInstance(Locale.CHINA).format(12345.678));
//        System.out.println(NumberFormat.getCurrencyInstance(Locale.US) == NumberFormat.getCurrencyInstance(Locale.US));


        Factory factory = new FactoryA();
        factory.saySomeThing();

        Factory factoryB = new FactoryB();
        factoryB.saySomeThing();
    }
}
