import java.lang.Math;

public class SlidingWindow {
    public static void main(String[] args) {
        int[] sales = {2, 1, 5, 1, 3, 6};
        int k = 3;

        int windowSum = 0;
        
        for (int i = 0; i < k; i++){
            windowSum += sales[i];
        }
        int maxSum = windowSum;

        for (int i = k; i < sales.length; i++) {
            windowSum += sales[i] - sales[i -k];
            maxSum = Math.max(maxSum, windowSum);
        }
        
        System.out.println("Maximun continous "+ k+ "-day sales sum: "+ maxSum);
    }
}
