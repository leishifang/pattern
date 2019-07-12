package pattern.iterator;

/**
 * @author leishifang
 * @date 2019-07-10 18:19
 */
public class Iterator<T> implements IIterator<T> {
    private T[] items;
    private int position;

    public Iterator(T[] items) {
        this.items = items;
    }

    @Override
    public T next() {
        return items[position++];
    }

    @Override
    public boolean hasNext() {
        return position < items.length;
    }
}
