package collections;
//import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
//        System.out.println("Size of map is: " + map.size());
//        System.out.println(map.get("c"));
        System.out.println(map);

//        if(map.containsKey("a")){
//            Integer a = map.get("a");
//            System.out.println("Value of key" + "\"a\" is: " + a);
//        }

//        for(String key: map.keySet()){
//            System.out.println("key: " + key+", value: " + map.get(key));
//        }
        for(Entry<String, Integer> entry : map.entrySet()){
            System.out.println("key " + entry.getKey() + ", value: " + entry.getValue());
        }
    }
}
