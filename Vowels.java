public class Vowels {
    public static void main(String[] args) {
        
        char[][] matrix = {
            {'a','b','c'},
            {'d','e','f'},
            {'g','h','i'},
        };
        
        int vowelCount = 0;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[r].length; c++){
                char ch = matrix[r][c];

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                }
            }
        }
        System.out.println("Total Vowels in Matrix: " + vowelCount);
    }
    
}
