package ObserverPattern;

public class Ball extends Observable{
    private int x;
    private int y;
    private int dx;
    private int dy;
    private int bounceCount;
    public Ball(int x, int y) {
        this.x = x;
        this.y = y;
        dx = 2;
        dy = 2;
        bounceCount = 0;
    }
    public void move(int width, int height) {
        if(x <= 0 || x >= width) {
            dx = -dx;
            bounceCount++;
        }
        x += dx;
        if(y <= 0 || y >= height) {
            dy = -dy;
            bounceCount++;
        }
        y += dy;
        notifyObserver();
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getBounceCount() {
        return bounceCount;
    }
}
