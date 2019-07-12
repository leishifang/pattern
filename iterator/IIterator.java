package pattern.iterator;

/**
 * @author leishifang
 * @date 2019-07-10 18:18
 */
public interface IIterator<T> {
    T next();

    boolean hasNext();
}
