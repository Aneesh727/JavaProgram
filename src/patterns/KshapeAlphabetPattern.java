package patterns;

public class KshapeAlphabetPattern {
    public static void main(String[] args) {
        int a = 65;
        // downward triangle
        for(int i=3;i>=0;i--){
            for(int j =0;j<=i;j++){
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(a+j)+" ");
            }
            System.out.println();
        }
    }
}
