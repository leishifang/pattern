package pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leishifang
 * @date 2019-07-11 15:48
 */
public class CareTaker implements ICareTaker {
    List<IMemento> mementos;

    public CareTaker() {
        mementos = new ArrayList<>();
    }

    @Override
    public void add(IMemento memento) {
        mementos.add(memento);
    }

    @Override
    public IMemento get(int index) {
        return mementos.get(index);
    }

    @Override
    public List<IMemento> get() {
        return mementos;
    }
}
