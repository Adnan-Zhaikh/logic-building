package Day5;
public class Search {
    public static void main(String[] args) {
        
        int[] accountIds = {1004, 2004, 5564, 3000, 7748};
        int targetFraudId = 3000;

        System.out.println("--- Initializing Security Database Scan ---");

        boolean isFound = false;
        for (int i = 0; i < accountIds.length; i++) {
            if (accountIds[i] == targetFraudId) {
                System.out.println("CRITICAL: Fraudulent account detected at index "+ i);
                isFound = true;
                break;
            }
            
        };
        if (isFound == false) {
            System.out.println("Scan Clean. No threat Detected.");
        }
    }
}