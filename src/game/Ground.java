package game;

import java.awt.Color;
import java.awt.Graphics;

public class Ground {
    private int x = 0;
    private final int y = 170;
    private final int width = 600;
    private final int height = 10;
    private final int speed = -5;

    public void update() {
        x += speed;
        if (x <= -width) {
            x = 0;
        }
    }

    public void draw(Graphics g) {
        g.setColor(new Color(139, 69, 19)); // Sử dụng RGB cho màu nâu (139, 69, 19)
        g.fillRect(x, y, width, height);
        g.fillRect(x + width, y, width, height);
    }
}