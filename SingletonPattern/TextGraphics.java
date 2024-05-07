package SingletonPattern;

public class TextGraphics {
    private static TextGraphics instance;
    private char[][] buffer;
    private int width;
    private int height;

    private TextGraphics() {}

    public static TextGraphics getInstance() {
        if (instance == null) {
            instance = new TextGraphics();
        }
        return instance;
    }

    public void init(int width, int height) {
        this.width = width;
        this.height = height;
        buffer = new char[height][width];
        clearBuffer();
    }

    private void clearBuffer() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                buffer[i][j] = ' ';
            }
        }
    }

    public void drawPoint(char c, int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            buffer[y][x] = c;
        }
    }

    public void drawLine(char c, int x1, int y1, int x2, int y2) {
        if (x1 >= 0 && x1 < width && y1 >= 0 && y1 < height &&
                x2 >= 0 && x2 < width && y2 >= 0 && y2 < height) {
            int dx = Math.abs(x2 - x1);
            int dy = Math.abs(y2 - y1);
            int sx = x1 < x2 ? 1 : -1;
            int sy = y1 < y2 ? 1 : -1;
            int err = dx - dy;

            while (true) {
                drawPoint(c, x1, y1);
                if (x1 == x2 && y1 == y2) break;
                int e2 = 2 * err;
                if (e2 > -dy) {
                    err -= dy;
                    x1 += sx;
                }
                if (e2 < dx) {
                    err += dx;
                    y1 += sy;
                }
            }
        }
    }

    public void fillRect(char c, int x, int y, int width, int height) {
        for (int i = y; i < y + height; i++) {
            for (int j = x; j < x + width; j++) {
                drawPoint(c, j, i);
            }
        }
    }

    public void render() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(buffer[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TextGraphics graphics = TextGraphics.getInstance();
        graphics.init(15, 10);
        graphics.drawPoint('*', 1, 1);
        graphics.fillRect('o', 5, 5, 3, 2);
        graphics.drawLine('l', 2, 2, 7, 8);
        graphics.render();
    }
}
