package Day8;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 5, 32};

        for (int pass = 0; pass < numbers.length - 1; pass++) {
            for (int i =0; i < numbers.length -1- pass; i++) {
                if (numbers[i] > numbers[i+1]) {
                    
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                }
            }         
        }
        System.out.println("Sorted Array:" + Arrays.toString(numbers));
    }
}
