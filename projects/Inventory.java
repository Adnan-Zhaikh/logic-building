import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Inventory {
    public static void main(String[] args){
        int[] itemArrival = {101,102,103,105,101,104,102,101,105};

        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : itemArrival){
            counts.put(num, counts.getOrDefault(num, 0) +1);
        }

        int duplicateCount=0;
        for (int count : counts.values()){
            if (count >= 2){
                duplicateCount++;
            }
        }

        int[] highVolumeItem = new int[duplicateCount];
        
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : counts.entrySet()){
            if(entry.getValue() >= 2){
                highVolumeItem[index] = entry.getKey();
                index++;
            }
        }

        System.out.println("High Volume items in Store: " + Arrays.toString(highVolumeItem));
    }
}