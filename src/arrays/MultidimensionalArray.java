package arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][][] arr = { { {1, 2, 10}, {3, 4, 11} }, { {5, 6, 12}, {7, 8, 13} } };
        // {1st dimension
        // {2nd dimension {3rd dimension}, {3rd dimension } 2nd dimension},
        // {2nd dimension{3rd dimension },{3rd dimension } 2nd dimension} 1st dimension}
        System.out.println(arr[1][1][2]);
    }
}
