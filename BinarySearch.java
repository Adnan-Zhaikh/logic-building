public class BinarySearch {
    public static void main(String[] args) {
        int[] num = {10,20,30,40,50,60,70};
        int target = 50;

        int left = 0;
        int right = num.length - 1;
        int foundIndex = -1;

        while (left <= right) {
            int mid = left + (right - left)/2;
            if (num[mid] == target) {
                foundIndex = mid;
                break;
            } else if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(foundIndex);       
    }
}