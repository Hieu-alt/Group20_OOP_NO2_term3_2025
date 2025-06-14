package game;

import java.awt.Color;
import java.awt.Graphics;

public class Obstacle {
    private int x = 600;
    private int y = 150;
    private final int width = 10;
    private final int height = 20;
    private final int speed = -5;

    public void update() {
        x += speed;
    }

    public void draw(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillRect(x, y, width, height);
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}