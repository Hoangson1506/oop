package ObserverPattern;

public class Launcher {
    public static void main(String[] args) {
        BouncingBallGUI bouncingBallGUI = new BouncingBallGUI();
        bouncingBallGUI.setVisible(true);
        ControlFrame controlFrame = new ControlFrame(bouncingBallGUI);
        controlFrame.setVisible(true);
    }

}
