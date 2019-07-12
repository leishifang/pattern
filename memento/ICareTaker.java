package pattern.memento;

import java.util.List;

/**
 * @author leishifang
 * @date 2019-07-11 15:47
 */
public interface ICareTaker {
    void add(IMemento memento);

    IMemento get(int index);

    List<IMemento> get();
}
