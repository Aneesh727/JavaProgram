package arrays;

public class ArrayExample3 {
    public static void main(String[] args) {
        // to store any number of elements
        int a[] = {100, 200, 300, 400, 500};

        int sum = 0;
        for(int i:a){
            System.out.println(i);
            sum = sum+i; // 100 300 600 1000 1500

        }
        System.out.println("Sum of array elements: "+ sum);
    }
}
