import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to check palindrome: ");
        String word = sc.nextLine();
        char[] chars = word.toCharArray();

        int left = 0;
        int right = chars.length - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left ++;
            right --;
        }
        System.out.println("Is It Palindrome: " + isPalindrome);
    }
}