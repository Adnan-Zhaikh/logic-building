public class matrix {
    public static void main(String[] args) {
        
        int[][] dataGrid = {
        {78,58,69},
        {54,76,84},
        {58,96,27}
    };

    System.out.println("----Starting Grid Boundary Scan ---");

    for (int row=0; row < 3; row++){
        for (int col =0; col <3; col++){
            int currentValue = dataGrid[row][col];

            if (currentValue % 2 == 0){
                System.out.println("Found Even num Value: " + currentValue + " at position [" + row +"][" + col + "]");
            }
        }
    }

    System.out.println("\n----Starting Grid Boundary Scan ---");
    for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++) {
                int currentValue = dataGrid[row][col];

                if (currentValue >= 50) {
                    System.out.println("Found High value: " + currentValue + " at position [" + row +"][" + col + "]");
                }
            }
        }
    }
}