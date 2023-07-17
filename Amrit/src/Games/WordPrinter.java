package Games;
import java.util.Scanner;

public class WordPrinter {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter an alphabetical character: ");
    String input = scanner.next();

    if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
      System.out.println("Invalid input!");
      return;
    }

    String prefix = input.toLowerCase() + "         "; // 9 spaces after the letter
    for (String word : getWordsStartingWith(prefix)) {
      System.out.println(word);
    }
  }

  private static String[] getWordsStartingWith(String prefix) {
    // You could replace this method with your own logic to retrieve the words from a database or file.
    // For this example, I'm just using a hard-coded list of words starting with the given prefix.
    String[] words = {
      "apple", "apricot", "avocado", "almond", "amaretto",
      "banana", "blueberry", "blackberry", "blood orange", "breadfruit",
      "cherry", "coconut", "cranberry", "clementine", "date",
      "elderberry", "eggplant", "fig", "grapefruit", "guava",
      "honeydew", "huckleberry", "jackfruit", "kiwi", "kumquat",
      "lemon", "lime", "lychee", "mango", "mulberry",
      "nectarine", "orange", "olive", "papaya", "peach",
      "pineapple", "plum", "pomegranate", "raspberry", "strawberry",
      "tangerine", "watermelon"
    };
    return java.util.Arrays.stream(words)
        .filter(word -> word.toLowerCase().startsWith(prefix))
        .limit(5)
        .toArray(String[]::new);
  }
}

