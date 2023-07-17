package Games;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String inputString) {
        int length = inputString.length();

        for (int i = 0; i < length / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
