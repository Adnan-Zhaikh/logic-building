public class transpose {
    public static void main(String[] args) {
        
        int[][] matrix = { {1,2}, {3,4}, {5,6} };
        
        int[][] transpose = new int[2][3];

        
        for( int cols = 0; cols < matrix[0].length; cols++){
            for (int rows = 0; rows < matrix.length; rows++) {
            
                transpose[cols][rows] = matrix[rows][cols];
            }
        }

        System.out.println("--- Transposed Matrix OUTPUT ---");
        for (int r = 0; r < transpose.length; r++) {
            for (int c = 0; c < transpose[r].length; c++)
                System.out.print(transpose[r][c] + " ");
        }
        System.out.println();
    }
}