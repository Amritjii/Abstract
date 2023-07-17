package Games;

import javax.swing.*;
import java.awt.*;

public class Windows extends JFrame {

    public static void main(String[] args) {
        new Windows();
    }

    public Windows() {
        setTitle("My Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new BorderLayout());

        // Create the game panel
        JPanel gamePanel = new JPanel();
        gamePanel.setPreferredSize(new Dimension(400, 300));
        gamePanel.setBackground(Color.BLACK);
        add(gamePanel, BorderLayout.CENTER);

        // Add the game loop
        while (true) {
            // Update game logic
            // ...

            // Repaint the game panel
            gamePanel.repaint();

            // Delay for 16 milliseconds (60 FPS)
            try {
                Thread.sleep(16);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw game objects
        // ...
    }
}