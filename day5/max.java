public class max {
    public static void main(String[] args) {
        
        int[] trafficLogs = {420, 750, 150, 980, 320};

        System.out.println("--- Initializing Traffic Peak Analysis ---");
        int maxTraffic = trafficLogs[0];

        for (int i = 1; i < trafficLogs.length; i++) {
            if (trafficLogs[i] > maxTraffic){
                maxTraffic = trafficLogs[i];
            }
        };
        System.out.println("Peak traffic volume detected: " + maxTraffic);

    }
}
