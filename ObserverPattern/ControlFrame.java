package ObserverPattern;

import javax.swing.*;

public class ControlFrame extends JFrame {
    public ControlFrame(BouncingBallGUI parent) {
        setTitle("Controller");
        setSize(200, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(parent);

        JButton startStopButton = parent.startStopButton;
        JLabel bounceLabel = parent.bounceLabel;

        JPanel panel = new JPanel();
        panel.add(startStopButton);
        panel.add(bounceLabel);
        add(panel);
    }
}
