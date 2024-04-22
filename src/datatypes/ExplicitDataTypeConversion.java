package datatypes;

public class ExplicitDataTypeConversion {
    public static void main(String[] args) {
        double a = 50.50;
        System.out.println("Dobule representation: " + a);

        float f = (float)a;          // (float)a -> this is called type-casting(to explicitly cast a value to f
        System.out.println("Float representation: " + f);

        long b = (long)a;
        System.out.println("Long representation: " + b);

        int c = (int)b;
        System.out.println("Int representation: " + c);
    }
}
