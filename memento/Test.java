package pattern.memento;

import java.io.Serializable;

/**
 * @author leishifang
 * @date 2019-07-11 15:24
 */
public class Test implements Serializable {

    public static void main(String[] args) {
        ICalculator calculator = new Calculator();
        ICareTaker careTaker = new CareTaker();

        //初始设置
        calculator.setFirstNumber(10);
        calculator.setSecondNumber(20);
        System.out.println("-----------init-------------");
        System.out.println(calculator.add());
        System.out.println(calculator.reduce());
        //保存
        careTaker.add(calculator.saveState());

        //更改
        calculator.setFirstNumber(1);
        calculator.setSecondNumber(2);
        System.out.println("-----------modify 1-------------");
        System.out.println(calculator.add());
        System.out.println(calculator.reduce());
        careTaker.add(calculator.saveState());

        //恢复
        calculator.restoreFromMemento(careTaker.get(0));
        System.out.println("-----------restore 0-------------");
        System.out.println(calculator.add());
        System.out.println(calculator.reduce());

        //更改
        calculator.setFirstNumber(3);
        calculator.setSecondNumber(4);
        System.out.println("-----------modify 2-------------");
        System.out.println(calculator.add());
        System.out.println(calculator.reduce());
        careTaker.add(calculator.saveState());

        //恢复
        calculator.restoreFromMemento(careTaker.get(1));
        System.out.println("-----------restore 1-------------");
        System.out.println(calculator.add());
        System.out.println(calculator.reduce());
    }
}
