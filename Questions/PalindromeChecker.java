import java.util.Scanner;

public class PalindromeChecker {

    public static boolean isPalindrome(String str, int left, int right) {
        // Base case: If left index is greater than or equal to the right, it's a palindrome
        if (left >= right) {
            return true;
        }

        // Check if characters at the current positions are the same
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive case: Check the next inner pair of characters
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = sc.nextLine();

        // Check if the input string is a palindrome
        boolean result = isPalindrome(input, 0, input.length() - 1);

        // Output the result
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
