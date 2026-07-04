public class budgets {
    public static void main(String[] args) {
        int[][] departmentExpenses = {
            {500,250,175},
            {850,100,500},
            {300,400,400}
        };
        
        int[] rowTotals = new int[3];
        
        for (int r = 0; r < departmentExpenses.length; r++) {
            
            int currentSum = 0;

            for (int c =0; c< departmentExpenses[r].length; c++) {
                currentSum += departmentExpenses[r][c];
            }
            rowTotals[r] = currentSum;
        }

        System.out.println("--- Department Totals ---");
        for(int i= 0; i < rowTotals.length; i++) {
            System.out.println("Department " + i +" Total: "+ rowTotals[i]);
        }

    
    }
}