import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class Main extends JPanel
{
    private final JFrame frame;

    private final int width, height;

    private boolean[][] cells;

    private int round, fps;

    public Main(int width, int height, int n)
    {
        this.width = width;
        this.height = height;

        cells = new boolean[width][height];

        generateRandomCells(n);

        frame = new JFrame("Game Of Life");
        frame.setSize(720, 480);
        frame.setUndecorated(true);
        frame.setResizable(true);

        frame.setLocationRelativeTo(null);

        frame.setContentPane(this);
        frame.setBackground(Color.GREEN);

        Mouse mouse = new Mouse(this);
        frame.addMouseMotionListener(mouse);
        frame.addMouseListener(mouse);

        frame.setVisible(true);

        run();
    }

    private void generateRandomCells(int x)
    {
        Random random = new Random();

        while (x > 0)
        {
            int rx = random.nextInt(width);
            int ry = random.nextInt(height);

            if(cells[rx][ry]) continue;

            cells[rx][ry] = true;
            x--;
        }

    }

    private void run()
    {
        long nanoSecond = System.nanoTime();
        double tick = 1000000000.0 / 100.0;

        int tps = 0;

        long lastTime = System.currentTimeMillis();

        while(true)
        {
            if(System.nanoTime() - nanoSecond > tick)
            {
                nanoSecond+=tick;
                tps++;
                update();
            }
            else
            {
                frame.repaint();
            }

            if(System.currentTimeMillis() - lastTime >= 1000)
            {
                lastTime = System.currentTimeMillis();
                System.out.println(tps+" TPS - "+fps+" FPS");
                tps = 0;
                fps = 0;

                System.gc();
            }
        }
    }

    private void update()
    {
        boolean[][] newCells = new boolean[width][height];

        for(int x = 0; x < width; x++)
        {
            for(int y = 0; y < height; y++)
            {
                int count = 0;

                for(int xo = -1; xo < 2; xo++)
                {
                    for(int yo = -1; yo < 2; yo++)
                    {
                        if(xo == 0 && yo == 0) continue;
                        int nx = x +xo;
                        int ny = y + yo;
                        count += (nx >= 0 && ny > 0 && nx < width && ny < height && cells[nx][ny]) ? 1 : 0;
                    }
                }

                newCells[x][y] = cells[x][y] ? (count == 2 || count == 3) : count == 3;
            }
        }

        cells = newCells;
        round++;
    }

    protected void paintComponent(Graphics g)
    {
        fps++;

        int xOffset = 1100 / width;
        int yOffset = 800 / height;

        g.setColor(Color.MAGENTA);

        for(int x = 0; x < width; x++)
        {
            for(int y = 0; y < height; y++)
            {
                if(cells[x][y])
                    g.fillRect(x * xOffset, y * yOffset, xOffset, yOffset);
            }
        }

        g.setColor(Color.YELLOW);
        g.setFont(new Font("arial", Font.PLAIN, 15));
        g.drawString(""+round, 20, 20);

    }

    public static void main(String... args)
    {
        new Main(200, 150, 5000);
    }

    private static class Mouse implements MouseMotionListener, MouseListener
    {
        private final Main main;

        private Mouse(Main main)
        {
            this.main = main;
        }

        @Override
        public void mouseClicked(MouseEvent e)
        {

        }

        @Override
        public void mousePressed(MouseEvent e)
        {

        }

        @Override
        public void mouseReleased(MouseEvent e)
        {
            main.generateRandomCells(10000);
        }

        @Override
        public void mouseEntered(MouseEvent e)
        {

        }

        @Override
        public void mouseExited(MouseEvent e)
        {

        }

        @Override
        public void mouseDragged(MouseEvent e)
        {

        }

        @Override
        public void mouseMoved(MouseEvent e)
        {

        }
    }
}
