package pattern.iterator;

import java.util.ArrayList;

/**
 * @author leishifang
 * @date 2019-07-11 10:00
 */
public class Container2 implements IContainer<Item, Iterator<Item>> {

    ArrayList<Item> items;

    public Container2() {
        items = new ArrayList<>();
    }

    @Override
    public void put(Item data) {
        items.add(data);
    }

    @Override
    public Iterator<Item> getIterator() {
        return new Iterator<>(transfer(items));
    }

    private Item[] transfer(ArrayList<Item> list) {
        Item[] items = new Item[list.size()];
        for (int i = 0; i < list.size(); i++) {
            items[i] = list.get(i);
        }
        return items;
    }
}
