package operators;

public class PrePost {
    public static void main(String[] args) {
        int i = 3;
        i++;  // in this case value of i is assigned first and then incremented
        // prints 4
        System.out.println(i);
        ++i;  // in this case value of i is incremented first and then assigned
        // prints 5
        System.out.println(i);
        //prints 6
        System.out.println(++i);
        // prints 6
        System.out.println(i++);
        // prints 7
        System.out.println(i);
    }
}
