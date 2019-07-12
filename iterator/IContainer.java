package pattern.iterator;

/**
 * @author leishifang
 * @date 2019-07-10 18:17
 */
public interface IContainer<T, ITERATOR> {
    void put(T data);

    ITERATOR getIterator();
}
