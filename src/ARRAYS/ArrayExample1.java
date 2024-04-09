package ARRAYS;

public class ArrayExample1 {
    public static void main(String[] args) {
        int a[] = new int[5];      // declaration of array with 5 elements

        // store elements into array
        a[0] =10;
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;          // storing elements into locations

        // read elements from an array
//        for(int i=0;i<=4;i++)
//        {
//            System.out.println(a[i]);  // 10 20...
//        }

        // for ...each loop
        for(int i:a)
        {
            System.out.println(i);  // 10 20...
        }
    }
}
