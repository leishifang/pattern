package pattern.memento;

/**
 * @author leishifang
 * @date 2019-07-11 15:39
 */
public class Memento implements IMemento {
    private int firstNumber;
    private int secondNumber;

    public Memento(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    public int getFirstNumber() {
        return firstNumber;
    }


    @Override
    public int getSecondNumber() {
        return secondNumber;
    }


}
