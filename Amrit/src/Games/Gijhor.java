package Games;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Gijhor {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 100) + 1;
        int numberOfAttempts = 0;
        Scanner Guessing_game = new Scanner(System.in);

        while (true) {
            numberOfAttempts++;
            int guess = Integer.parseInt(JOptionPane.showInputDialog("Enter your guess (1-100):"));
            if (guess == targetNumber) {
                if (numberOfAttempts == 5) {
                    JOptionPane.showMessageDialog(null, "Excellent!");
                } else if (numberOfAttempts > 5 && numberOfAttempts <= 10) {
                    JOptionPane.showMessageDialog(null, "Good!");
                } else if (numberOfAttempts > 10 && numberOfAttempts <= 15) {
                    JOptionPane.showMessageDialog(null, "Fair!");
                } else {
                    JOptionPane.showMessageDialog(null, "Rahne de Bhai!");
                }
                break;
            } else if (guess < targetNumber) {
                JOptionPane.showMessageDialog(null, "Too low. Try again.");
            } else {
                JOptionPane.showMessageDialog(null, "Too high. Try again.");
            }
            if (numberOfAttempts >= 15) {
                JOptionPane.showMessageDialog(null, "Rahne de Bhai!");
                break;
            }
        }
    }
}

