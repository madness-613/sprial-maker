import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.GeneralPath;

public class SpiralPanel extends JPanel implements ActionListener {
    private Timer timer;
    private double angle = 0;
    private double centerSize = 0;
    private double gapSize = 5;
    private double ringsAmount = 5;
    private double spinSpeed = 0.05;
    private Color spiralColor = Color.CYAN;

    public SpiralPanel() {
        // Set up a timer to trigger animation frames (~60 FPS)
        timer = new Timer(16, this);
        timer.start();
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.BLACK);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;

        // Move origin to the center of the panel
        g2d.translate(centerX, centerY);

        // Rotate the entire spiral based on the animated angle
        g2d.rotate(angle);

        // Draw an Archimedean spiral
        g2d.setColor(spiralColor);
        g2d.setStroke(new BasicStroke(2.5f));

        GeneralPath spiral = new GeneralPath();
        for (double ring = 0; ring < (ringsAmount * 2) * Math.PI; ring += 0.05) {
            double r = centerSize + gapSize * ring;
            double x = r * Math.cos(ring);
            double y = r * Math.sin(ring);

            if (ring == 0) {
                spiral.moveTo(x, y);
            } else {
                spiral.lineTo(x, y);
            }
        }

        g2d.draw(spiral);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        angle += spinSpeed;
        repaint();
    }

    public Color getSpiralColor() {
        return spiralColor;
    }

    public void setGapSize(double gapSize) {
        this.gapSize = gapSize;
    }
    public void setCenterSize(double centerSize) {
        this.centerSize = centerSize;
    }
    public void setRingsAmount(double ringsAmount) {
        this.ringsAmount = ringsAmount;
    }
    public void setSpinSpeed(double spinSpeed) {
        this.spinSpeed = spinSpeed;
    }
    public void setSpiralColor(Color spiralColor) {
        this.spiralColor = spiralColor;
    }
}