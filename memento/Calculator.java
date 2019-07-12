package pattern.memento;

/**
 * @author leishifang
 * @date 2019-07-11 14:06
 */
public class Calculator implements ICalculator {
    private int firstNumber;
    private int secondNumber;

    @Override
    public void setFirstNumber(int number) {
        this.firstNumber = number;
    }

    @Override
    public void setSecondNumber(int number) {
        this.secondNumber = number;
    }

    @Override
    public int add() {
        return firstNumber + secondNumber;
    }

    @Override
    public int reduce() {
        return firstNumber - secondNumber;
    }

    @Override
    public IMemento saveState() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        return new Memento(firstNumber, secondNumber);
    }

    @Override
    public void restoreFromMemento(IMemento memento) {
        this.firstNumber = memento.getFirstNumber();
        this.secondNumber = memento.getSecondNumber();
    }
}
