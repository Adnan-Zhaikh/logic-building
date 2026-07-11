package Day7;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] data = {10,20,30,40,50,60};

        int left = 0, right = data.length -1;

        while ( left < right ) {
            int temp = data[left];
            data[left] = data[right];
            
            data[right] = temp;

            left++;
            right--;
        }
        System.out.println("Array after reverse: "+ Arrays.toString(data));
            
 }
}
