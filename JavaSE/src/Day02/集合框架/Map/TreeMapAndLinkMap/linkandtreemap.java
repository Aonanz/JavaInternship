package Day02.集合框架.Map.TreeMapAndLinkMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class linkandtreemap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        // 按输入顺序排
        LinkedHashMap<Integer, String> linkedhashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        // 无序
        testMap(hashMap);
        System.out.println("-------------------------------------");
        // 有序正序，利用给的顺序排序
        testMap(linkedhashMap);
        System.out.println("-------------------------------------");
        // 有序排序，会按真正的自然排序（123456789）
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(9,"Will");
        map.put(8,"Willa");
        map.put(7,"Willb");
        map.put(6,"Willc");
        map.put(5,"Willd");
        map.put(4,"Wille");
        map.put(3,"Willf");
        map.put(2,"Willg");
        map.put(1,"Willh");
        map.put(0,"Willi");

        for(Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ":" + value);
        }
    }
}
