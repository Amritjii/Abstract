package Games;

import java.util.Scanner;

public class CountDigitOne {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();
        int count = countDigitOne(n);
        System.out.println("The total number of digit 1 appearing in all non-negative integers less than or equal to " + n + " is: " + count);
    }

    public static int countDigitOne(int n) {
        int count = 0;
        for (long i = 1; i <= n; i *= 10) {
            long divider = i * 10;
            count += (n / divider) * i + Math.min(Math.max(n % divider - i + 1, 0), i);
        }
        return count;
    }
}
