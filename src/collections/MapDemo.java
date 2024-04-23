package collections;
//import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();

        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        System.out.println("Size of map is: " + map.size());
        System.out.println(map);

    }
}
