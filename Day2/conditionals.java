public class conditionals {
    public static void main(String[] args) {
        //Variables 
        int modulesComplete = 12;
        int totalmodules = 12;
        double assessmentScore = 81.64;
        boolean feespaid = true;

        //1. Multi-layered Conditionals (Nested vs Chained)
        if (modulesComplete == totalmodules && assessmentScore >= 75.0) {
            System.out.println("Academin requirement met. Checking adminstrative status....");
            if (feespaid) {
                System.out.println("STATUS: Certificate unlocked and ready to print.");
            } else {
                System.out.println("STATUS: Held due to pending adminstrative clearance");
            }  
        } else if (modulesComplete >= (totalmodules / 2)) {
            System.out.println("STATUS: Course in progress. Evaluation score is stable.");
        } else {
            System.out.println("STATUS: Academic warning.Progress benchmark not met."); 
        }

        //2. short-circuit logic investigation (&& vs &)
        System.out.println("\n---TEsting short-circuit performance ---");
        String testString = null;

        // if you use single '&', the JVM evaluates Both side.
        if (testString != null && testString.length()> 0){
            System.out.println("String has content.");
        } else {
            System.out.println("Short-Circuit Protected: Skipped null lentgh valuation safely.");
        }
    }
}