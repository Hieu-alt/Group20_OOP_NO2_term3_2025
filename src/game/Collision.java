package game;

public class Collision {
    public static boolean checkCollision(Dino dino, Obstacle obstacle) {
        return dino.getX() < obstacle.getX() + obstacle.getWidth() &&
               dino.getX() + dino.getWidth() > obstacle.getX() &&
               dino.getY() < obstacle.getY() + obstacle.getHeight() &&
               dino.getY() + dino.getHeight() > obstacle.getY();
    }
}