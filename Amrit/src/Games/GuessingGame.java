package Games;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public class GuessingGame {
  
  private JFrame mainFrame;
  private JLabel headerLabel;
  private JLabel statusLabel;
  private JPanel controlPanel;
  private JTextField guessField;
  private JButton guessButton;
  private int targetNumber;
  private int attempts;

  public GuessingGame() 
  {
    targetNumber = (int) (Math.random() * 100 + 1);
    attempts = 0;
    prepareGUI();
  }

  public static void main(String[] args) {
    GuessingGame guessingGame = new GuessingGame();
    guessingGame.play();
  }

  private void prepareGUI() 
  {
    mainFrame = new JFrame("Guessing Game");
    mainFrame.setSize(400, 400);
    mainFrame.setLayout(new GridLayout(3, 1));
    mainFrame.addWindowListener(new WindowAdapter() 
    {
      public void windowClosing(WindowEvent windowEvent) 
      {
        System.exit(0);
      }
    });
    headerLabel = new JLabel("", JLabel.CENTER);
    statusLabel = new JLabel("", JLabel.CENTER);
    statusLabel.setSize(350, 100);
    controlPanel = new JPanel();
    controlPanel.setLayout(new FlowLayout());
    mainFrame.add(headerLabel);
    mainFrame.add(controlPanel);
    mainFrame.add(statusLabel);
    mainFrame.setVisible(true);
  }

  private void play() 
  {
    headerLabel.setText("Guess the number between 1 and 100:");
    guessField = new JTextField(10);
    guessButton = new JButton("Guess");
    guessButton.addActionListener(new ActionListener() 
    {
      public void actionPerformed(ActionEvent e) 
      {
        int guess = Integer.parseInt(guessField.getText());
        attempts++;
        if (guess == targetNumber) {
          statusLabel.setText("You got it! You took " + attempts + " attempts.");
          guessButton.setEnabled(false);
          if (attempts == 5) {
            JOptionPane.showMessageDialog(mainFrame, "Excellent!");
          } else if (attempts > 5 && attempts <= 10) {
            JOptionPane.showMessageDialog(mainFrame, "Good!");
          } else if (attempts > 10 && attempts <= 15) {
            JOptionPane.showMessageDialog(mainFrame, "Fair.");
          } else {
            JOptionPane.showMessageDialog(mainFrame, "rahne de bhai");
          }
        } else if (guess < targetNumber) {
          statusLabel.setText("Too low. Guess again.");
        } else {
          statusLabel.setText("Too high. Guess again.");
        }
      }
    });
    controlPanel.add(guessField);
    controlPanel.add(guessButton);
    mainFrame.setVisible(true);
  }
  
}
