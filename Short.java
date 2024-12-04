import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class SnakeGame extends JFrame implements ActionListener {
    private final int WIDTH = 600;
    private final int HEIGHT = 600;
    private final int UNIT_SIZE = 25;
    private final int GAME_UNITS = (WIDTH * HEIGHT) / (UNIT_SIZE * UNIT_SIZE);
    private final int DELAY = 100;

    private final Random random = new Random();
    private final ArrayList<Rectangle> bodyParts = new ArrayList<>();
    private int appleX;
    private int appleY;
    private boolean running = false;
    private char direction = 'R';

    private Timer timer;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_UP:
                        if (direction != 'D') {
                            direction = 'U';
                        }
                        break;
                    case KeyEvent.VK_DOWN:
                        if (direction != 'U') {
                            direction = 'D';
                        }
                        break;
                    case KeyEvent.VK_LEFT:
                        if (direction != 'R') {
                            direction = 'L';
                        }
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (direction != 'L') {
                            direction = 'R';
                        }
                        break;
                }
            }
        });

        startGame();
    }

    public void startGame() {
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
        generateApple();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawGrid(g);
        if (running) {
            drawApple(g);
            drawSnake(g);
            drawScore(g);
        } else {
            gameOver(g);
        }
    }

    private void drawGrid(Graphics g) {
        for (int i = 0; i < WIDTH / UNIT_SIZE; i++) {
            g.drawLine(i * UNIT_SIZE, 0, i * UNIT_SIZE, HEIGHT);
        }
        for (int i = 0; i < HEIGHT / UNIT_SIZE; i++) {
            g.drawLine(0, i * UNIT_SIZE, WIDTH, i * UNIT_SIZE);
        }
    }

    private void drawApple(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
    }

    private void drawSnake(Graphics g) {
        g.setColor(Color.GREEN);
        for (Rectangle rect : bodyParts) {
            g.fillRect(rect.x, rect.y, UNIT_SIZE, UNIT_SIZE);
        }
    }

    private void drawScore(Graphics g) {
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 18));
        g.drawString("Score: " + bodyParts.size(), WIDTH - 150, 25);
    }

    private void gameOver(Graphics g) {
        g.setColor(Color.RED);
        g.setFont(new Font("Arial", Font.BOLD, 48));
        g.drawString("Game Over", WIDTH / 2 - 150, HEIGHT / 2 - 50);
        g.setFont(new Font("Arial", Font.PLAIN, 24));
        g.drawString("Score: " + bodyParts.size(), WIDTH / 2 - 100, HEIGHT / 2 + 25);
    }

    private void generateApple() {
        appleX = random.nextInt(GAME_UNITS) * UNIT_SIZE;
        appleY = random.nextInt(GAME_UNITS) * UNIT_SIZE;
    }

    private void move() {
        for (int i = bodyParts.size() - 1; i > 0; i--) {
            bodyParts.get(i).x = bodyParts.get(i - 1).x;
            bodyParts.get(i).y = bodyParts.get(i - 1).y;
        }
        switch (direction) {
            case 'U':
                bodyParts.get(0).y -= UNIT_SIZE;
                break;
            case 'D':
                bodyParts.get(0).y += UNIT_SIZE;
                break;
            case 'L':
                bodyParts.get(0).x -= UNIT_SIZE;
                break;
            case 'R':
                bodyParts.get(0).x += UNIT_SIZE;
                break;
        }
    }

    private void checkApple() {
        if (bodyParts.get(0).x == appleX && bodyParts.get(0).y == appleY) {
            bodyParts.add(new Rectangle(appleX, appleY, UNIT_SIZE, UNIT_SIZE));
            generateApple();
        }
    }

    private void checkCollisions() {
        if (bodyParts.get(0).x < 0 || bodyParts.get(0).x >= WIDTH ||
                bodyParts.get(0).y < 0 || bodyParts.get(0).y >= HEIGHT) {
            running = false;
        }
        for (int i = 1; i < bodyParts.size(); i++) {
            if (bodyParts.get(0).intersects(bodyParts.get(i))) {
                running = false;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new SnakeGame();
        frame.setVisible(true);
    }
}