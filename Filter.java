public class Filter{
    public static void main(String[] args){
        int[] rawData = {11, 22, 33, 44, 55, 66};
        int evenCount= 0;

        for (int num : rawData) {
            if (num % 2 == 0) {
                evenCount ++;
            }
        }

        int[] filteredData = new int[evenCount];
        int targetIndex = 0;

        for (int num : rawData){
            if (num % 2 == 0) {
                filteredData[targetIndex] = num;
                targetIndex++;
            }
        }

        System.out.println(java.util.Arrays.toString(filteredData));
    }
}