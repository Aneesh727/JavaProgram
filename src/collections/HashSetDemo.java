package collections;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
//        HashSet<Integer> hashSet = new HashSet<Integer>();

        hashSet.add("A");
        hashSet.add("B");
        boolean r1 = hashSet.add("C");
//        System.out.println(r1);
        boolean r2 = hashSet.add("C");
//        System.out.println(r2);

//        hashSet.add(1);
//        hashSet.add(2);
//        hashSet.add(3);
//        hashSet.add(4);

        System.out.println(hashSet);
        System.out.println("List contains C or not? " + hashSet.contains("C"));

        hashSet.remove("A");
        System.out.println(hashSet);

        for(String item:hashSet){
            System.out.print(item + " ");
        }
    }
}
