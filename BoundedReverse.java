public class BoundedReverse {
    public static void main(String[] args){
        int[] data = {10, 20, 30, 40, 50, 60, 70};

        int startIndex = 2;
        int endIndex = 5;

        int left = startIndex;
        int right = endIndex;

        while (left<right) {
            int temp = data[left];
            data[left] = data[right];
            
            data[right] = temp;

            left++;
            right--;
        }

        System.out.println(java.util.Arrays.toString(data));
    }
}