package pattern.iterator;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentNavigableMap;

/**
 * @author leishifang
 * @date 2019-07-10 17:57
 */
public class Test {

    public static void main(String[] args) {
//        HashMap<Object, Object> hashMap = new HashMap<>(16);
//        hashMap.put("", null);
//        hashMap.put("", "");
//
//        hashMap.put(null, "");
//        hashMap.put(null, null);
//
//        Set<Map.Entry<Object, Object>> set = hashMap.entrySet();
//        Iterator<Map.Entry<Object, Object>> iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry<Object,Object> entry = iterator.next();
//            System.out.println("("+entry.getKey()+"," + entry.getValue()+")");
//        }

//        Container container = new Container(32);
//        container.put(new Node("1", "11"));
//        container.put(new Node("2", "22"));
//        container.put(new Node("3", "33"));
//        container.put(new Node("4", "44"));
//        Iterator<Node> iterator = container.getIterator();
//        while (iterator.hasNext()) {
//            Node node = iterator.next();
//            System.out.println("("+node.key +","+ node.value+")");
//        }
//
//

        Container2 container2 = new Container2();
        container2.put(new Item(1, 11));
        container2.put(new Item(2, 22));
        container2.put(new Item(3, 33));

        Iterator<Item> iterator = container2.getIterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            System.out.println("(" + item.key + "," + item.value + ")");
        }
    }
}
