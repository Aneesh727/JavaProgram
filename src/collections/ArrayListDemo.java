package collections;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

//        interface declaration = concrete implementation

        List<Integer> arrayList = new ArrayList<Integer>(5);

//        ArrayList<Integer> arrayList = new ArrayList<Integer>(5);

        for (int i = 1; i <= 5; i++) {
            arrayList.add(i);
        }
        // printing elements
        System.out.println(arrayList);

        // remove element at index 3
        arrayList.remove(3);

        // displaying the arrayList after deletion
        System.out.println(arrayList);

        // printing elements one by one
//        for(int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i) + " ");
//        }

        for( int i : arrayList){
            System.out.print(i + " ");
        }


    }
}
