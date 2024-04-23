package collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("A");
        list.add("B");
        list.addLast("C");  // it will add the element at the very end of linked-list
        list.addFirst("D"); // it will add the element at the very begining linked-list
        list.add(2,"E");
        System.out.println(list);
        System.out.println(list.size());

        list.remove("B");
        System.out.println(list);

        list.remove(3);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);

        list.removeLast();
        System.out.println(list);
    }
}
