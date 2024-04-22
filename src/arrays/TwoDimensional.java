package arrays;

public class TwoDimensional {
    public static void main(String[] args) {
//        int a[][] = new int[3][2];   // declartion

        int a[][] = {{10,20}, {30,40}, {50,60}};

        // storing elements/values in array
//        a[0][0] = 10;
//        a[0][1] = 20;
//
//        a[1][0] = 30;
//        a[1][1] = 40;
//
//        a[2][0] = 50;
//        a[2][1] = 60;

        // classic for loop
//        for(int i=0; i<=2; i++){
//            for(int j=0; j<=1; j++){
//                System.out.print(a[i][j] + " "); // 10 20 30 40 50 60
//            }
//            System.out.println();
//        }
//----------------------------------------------------------------------------------------------------

        // modified for ...each loop
        for(int i[]:a){
            for(int j:i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
