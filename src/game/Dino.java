package game;

import java.awt.Color;
import java.awt.Graphics;

public class Dino {
    private final int x = 50;
    private int y = 150;
    private final int width = 20;
    private final int height = 20;
    private boolean isJumping = false;
    private final double jumpSpeed = -10;
    private final double gravity = 0.5;
    private double velocityY = 0;

    public void jump() {
        if (!isJumping) {
            velocityY = jumpSpeed;
            isJumping = true;
        }
    }

    public void update() {
        if (isJumping) {
            y += velocityY;
            velocityY += gravity;
            if (y >= 150) {
                y = 150;
                isJumping = false;
                velocityY = 0;
            }
        }
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(x, y, width, height);
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public int getWidth() { return width; }
    public int getHeight() { return height; }
}