package Patterns;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Line2D;

public class SpiralPattern extends JPanel {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 800;
    private static final int POINT_COUNT = 2000;
    private static final int COLOR_PERIOD = 255;
    private static final int COLOR_INCREMENT = 20;
    private static final double SPACING = 0.1;
    private static final double ROTATION_SPEED = 0.02;

    private int[] colors;
    private double[] xValues;
    private double[] yValues;

    public SpiralPattern() {
        colors = new int[POINT_COUNT];
        xValues = new double[POINT_COUNT];
        yValues = new double[POINT_COUNT];

        double theta = 0;
        double radius = 0;
        for (int i = 0; i < POINT_COUNT; i++) {
            double colorValue = (i / (double) COLOR_PERIOD) * COLOR_INCREMENT;
            colors[i] = Color.HSBtoRGB((float) colorValue, 1, 1);

            xValues[i] = Math.cos(theta) * radius;
            yValues[i] = Math.sin(theta) * radius;

            theta += SPACING;
            radius += SPACING;
        }

        new Timer(10, e -> {
            for (int i = 0; i < POINT_COUNT; i++) {
                double oldX = xValues[i];
                double oldY = yValues[i];

                xValues[i] = oldX * Math.cos(ROTATION_SPEED) - oldY * Math.sin(ROTATION_SPEED);
                yValues[i] = oldX * Math.sin(ROTATION_SPEED) + oldY * Math.cos(ROTATION_SPEED);
            }

            repaint();
        }).start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.translate(WIDTH / 2, HEIGHT / 2);
        for (int i = 0; i < POINT_COUNT; i++) {
            g2d.setColor(new Color(colors[i]));
            g2d.draw(new Line2D.Double(xValues[i], yValues[i], xValues[i] + 1, yValues[i]));
        }

        g2d.dispose();
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Spiral Pattern");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new SpiralPattern());
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
