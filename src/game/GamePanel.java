package game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
    private Dino dino;
    private Ground ground;
    private ArrayList<Obstacle> obstacles;
    private Timer timer;
    private long lastObstacleTime;

    public GamePanel() {
        dino = new Dino();
        ground = new Ground();
        obstacles = new ArrayList<>();
        lastObstacleTime = System.currentTimeMillis();
        timer = new Timer(20, this);
        timer.start();

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    dino.jump();
                }
            }
        });
        setFocusable(true);
        setPreferredSize(new Dimension(600, 200));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ground.draw(g);
        dino.draw(g);
        for (Obstacle obstacle : obstacles) {
            obstacle.draw(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        dino.update();
        ground.update();

        if (System.currentTimeMillis() - lastObstacleTime > 1500) {
            obstacles.add(new Obstacle());
            lastObstacleTime = System.currentTimeMillis();
        }

        for (int i = 0; i < obstacles.size(); i++) {
            Obstacle obstacle = obstacles.get(i);
            obstacle.update();
            if (Collision.checkCollision(dino, obstacle)) {
                timer.stop();
                JOptionPane.showMessageDialog(this, "Game Over!");
                obstacles.clear();
                timer.start();
            }
            if (obstacle.getX() + obstacle.getWidth() < 0) {
                obstacles.remove(i);
                i--;
            }
        }

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Dino Chrome");
        GamePanel gamePanel = new GamePanel();
        frame.add(gamePanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}