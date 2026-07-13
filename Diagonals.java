public class Diagonals {
    public static void main(String[] args) {
        int[][] grid = {
            {1,2,3},
            {4,5,6},
            {5,8,9}
        };

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < grid.length; i++) {
            
            primarySum += grid[i][i];
            secondarySum += grid[i][grid.length - 1 - i];
            
            
        }
        System.out.println("Primary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
    }
}