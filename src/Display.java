import javax.swing.*;
import java.awt.*;

public class Display extends JFrame {
    private int depth = 5;

    // The constructor follows
    public Display() {
        setTitle("Graphic");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());

        int x = getSize().width / 2 - 10;
        int y = getSize().height/ 2 - 10;
        int width = 20;
        int height = 20;
        int startAngle = 0;
        int arcAngle = 180;

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, -arcAngle);
            } else {
                x = x - 2 * depth;
                y = y - depth;
                width = width + 2 * depth;
                height = height + 2 * depth;
                g.drawArc(x, y, width, height, startAngle, arcAngle);
            }
        }
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
        repaint();
    }
}