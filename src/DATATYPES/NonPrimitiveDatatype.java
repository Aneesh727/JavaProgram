package DATATYPES;

public class NonPrimitiveDatatype {
    public static void main(String[] args){
        String str = "test";     // String will reuse the variable again and again eveytime we call it
        System.out.println("String is: " + str);

        String str1 = new String("test");  // String will make a new string variable again and again everytime we call it.
        System.out.println("Another string: " + str1);

        int arr[];
        arr = new int[2];
        arr[0] = 0;
        arr[1] = 1;
//        arr[2] = 2;
        System.out.println(arr);
        System.out.println(arr[0]);
    }
}
