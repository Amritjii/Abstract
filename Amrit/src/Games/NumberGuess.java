package Games;
import java.util.Scanner;

public class NumberGuess {
  public static void main(String[] args) {
    int randomNumber = (int) (Math.random() * 100 + 1);
    Scanner sc = new Scanner(System.in);
    int guess;
    int attempts = 0;

    while (true) {
      System.out.print("Enter your guess: ");
      guess = sc.nextInt();
      attempts++;

      if (guess == randomNumber) {
        System.out.println("Correct! You got it in " + attempts + " attempts.");
        break;
      } else if (guess < randomNumber) {
        System.out.println("Your guess is too low.");
      } else {
        System.out.println("Your guess is too high.");
      }

      if (attempts == 5) {
        System.out.println("Excellent!");
      } else if (attempts > 5 && attempts <= 10) {
        System.out.println("Good!");
      } else if (attempts > 10 && attempts <= 15) {
        System.out.println("Fair!");
      } else if (attempts > 15) {
        System.out.println("Rahne de bhai.");
        break;
      }
    }
  }
}
