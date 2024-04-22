package patterns;

public class DescendingOrderNumber {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++){
            int temp = n;
            for(int j=1; j<=i;j++){
                System.out.print(temp-- +" ");
            }
            System.out.println();
        }
    }
}

