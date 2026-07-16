import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String[] args){
        int[] nums = {4,5,4,9,6,7,4,5,2};
        
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }
        int maxKey = -1;
        int maxCount = -1;

        for (Map.Entry<Integer, Integer> entry : counts.entrySet()){
            if (entry.getValue() > maxCount) {
                maxCount= entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Frequency Matrix Map: " + counts);
        System.out.println("Most Frequent Number is: " + maxKey + " (Appeared " + maxCount + " times)");
    }
}
