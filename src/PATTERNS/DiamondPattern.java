package PATTERNS;

public class DiamondPattern {
    public static void main(String[] args) {
        // pyramid star
        for(int i=1;i<5;i++){
            for(int k=3; k>=i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // reversed pyramid star
        for(int i=1; i<5;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=1; j<5-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
