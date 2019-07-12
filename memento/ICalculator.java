package pattern.memento;

/**
 * @author leishifang
 * @date 2019-07-11 14:03
 */
public interface ICalculator {

    void setFirstNumber(int number);

    void setSecondNumber(int number);

    int add();

    int reduce();

    IMemento saveState();

    void restoreFromMemento(IMemento memento);
}
