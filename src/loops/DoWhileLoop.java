package loops;

import java.util.Arrays;

public class DoWhileLoop {
    public static void main(String[] args) {
        int count = 1;
        do{
            System.out.println("Count is: " + count);
            count++;
        }
        while(count < 10);

        System.out.println(2);
        System.out.printf("count");
        System.out.println("DoWhileLoop.main");
        System.out.println("args = " + Arrays.toString(args));
        System.out.println("count = " + count);

    }
}
