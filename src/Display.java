import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Display extends JFrame {
    private SpiralPanel spiral = new SpiralPanel();

    // The constructor follows
    public Display() {
        setTitle("Graphic");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(spiral);
    }

    public BufferedImage snapshot(){
        BufferedImage image = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_3BYTE_BGR);
        Graphics2D buffer = image.createGraphics();

        printAll(buffer);
        buffer.dispose();

        return image;
    }

    public void setSpiralCenterSize(double newValue){
        spiral.setCenterSize(newValue);
    }
    public void setSpiralGapSize(double newValue){
        spiral.setGapSize(newValue);
    }
    public void setSpiralRingsAmount(double newValue){
        spiral.setRingsAmount(newValue);
    }
    public void setSpiralSpinSpeed(double newValue){
        spiral.setSpinSpeed(newValue);
    }
    public void setSpiralColor(Color newValue) {
        spiral.setSpiralColor(newValue);
    }
}