public class Expenses {
    public static void main(String[] args) {
        int[] dailyExpense = {45, 12,90,37,68};

        System.out.println("--- Starting Expense Calculation ---");

        int totalSpent  = 0;

        for (int i = 0; i< dailyExpense.length; i++) {
            totalSpent += dailyExpense[i];
                       
        }
        System.out.println("Total amount spent: " + totalSpent);
    }
}