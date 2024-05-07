package ObserverPattern;

import javax.swing.*;
import java.awt.*;

public class BallPanel extends JPanel {
    private Ball ball;
    public BallPanel(Ball ball) {
        this.ball = ball;
    }
    public void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);
        graphics.setColor(Color.yellow);
        graphics.fillOval(ball.getX(), ball.getY(), 20, 20);
    }
}
