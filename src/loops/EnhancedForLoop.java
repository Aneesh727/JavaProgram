package loops;

public class EnhancedForLoop {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        for(int item:numbers)
        // specify collection(array,list,map) on the right side of the bracket
            // then colon(":")
            // then we put the representation of member of this collection
        {
            System.out.println("Count is: " + item);
        }
    }
}
