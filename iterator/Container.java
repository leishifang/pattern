package pattern.iterator;

/**
 * @author leishifang
 * @date 2019-07-10 18:12
 */
public class Container implements IContainer<Node, Iterator>{
    private Node[] mNodes;
    private int count;

    public Container(int capacity) {
        this.mNodes = new Node[capacity];
    }

    @Override
    public void put(Node node) {
        mNodes[count++] = node;
    }

    @Override
    public Iterator getIterator() {
        return new Iterator<>(mNodes);
    }
}
