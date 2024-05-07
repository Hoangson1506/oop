package ObserverPattern;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouncingBallGUI extends JFrame implements Observer {
    private Ball ball;
    private BallPanel ballPanel;
    public JLabel bounceLabel;
    public JButton startStopButton;
    private Timer timer;
    public BouncingBallGUI() {
        setTitle("Bouncing Ball");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        ball = new Ball(50, 50);
        ballPanel = new BallPanel(ball);
        ball.addObserver(this);

        bounceLabel = new JLabel("Bounces: ");
        startStopButton = new JButton("Start");
        startStopButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(startStopButton.getText().equals("Start")) {
                    startBouncing();
                    startStopButton.setText("Stop");
                }
                else if(startStopButton.getText().equals("Stop")) {
                    stopBouncing();
                    startStopButton.setText("Start");
                }
            }
        });
        add(ballPanel);
    }
    private void startBouncing() {
        timer = new Timer(1, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ball.move(ballPanel.getWidth(), ballPanel.getHeight());
                bounceLabel.setText("Bounces: " + ball.getBounceCount());
            }
        });
        timer.start();
    }
    private  void stopBouncing() {
        if (timer != null && timer.isRunning()) {
            timer.stop(); // Stop the timer if it's running
        }
    }
    @Override
    public void update(Observable observable) {
        ballPanel.repaint();
    }
}
