public class LeftTrianglePat {
    public static void main(String[] args) {
        int row = 4;
        for(int i=1;i<=4;i++){  //for i loop
            for(int k=3;k>=i;k--){   //for space loop
                System.out.print(" ");
            }
                for(int j=1;j<=i;j++) {  //for j loop
                    System.out.print("*");
                }
            System.out.println();
        }

    }
}
