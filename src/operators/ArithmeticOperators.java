package operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        // addition
        int result = 1 + 2;
        // result is now 3
        System.out.println("1 + 2 = " + result);
        // subtraction
        int original_result = result;
        result = result - 1;
        // result is now 2
        System.out.println(original_result + " - 1 = " + result);
        //multiplication
        original_result = result;
        result = result * 2;
        // result is now 4
        System.out.println(original_result + " * 2 = " + result);
        // division
        original_result = result;
        result = result / 2;
        // result is now 2
        System.out.println(original_result + " / 2 = " + result);
        // remainder
        original_result = result;
        result = result + 8;
        // result is now 10
        System.out.println(original_result + " + 8 = " + result);
        result = result % 7;
        // result is now 3
        System.out.println(original_result + " % 7 = " + result);




    }
}
