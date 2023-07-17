package Patterns;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MesmerizingPattern extends JPanel {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 800;
    private static final double DELTA_THETA = 0.005;
    private static final int MAX_ITERATIONS = 100000;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mesmerizing Pattern");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.add(new MesmerizingPattern());
        frame.setVisible(true);
    }

    public MesmerizingPattern() {
        setBackground(Color.BLACK);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE);

        int centerX = WINDOW_WIDTH / 2;
        int centerY = WINDOW_HEIGHT / 2;

        double theta = 0;
        double r = 0;
        int x1 = (int) (centerX + r * Math.cos(theta));
        int y1 = (int) (centerY + r * Math.sin(theta));

        for (int i = 0; i < MAX_ITERATIONS; i++) {
            theta += DELTA_THETA;
            r = 200 * Math.sin(4 * theta) * Math.cos(2 * theta);
            int x2 = (int) (centerX + r * Math.cos(theta));
            int y2 = (int) (centerY + r * Math.sin(theta));
            g.drawLine(x1, y1, x2, y2);
            x1 = x2;
            y1 = y2;
        }
    }
}
