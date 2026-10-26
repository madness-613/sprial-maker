import javax.imageio.ImageIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

public class Main{
    static void main(String[] args) {
        Display display = new Display();
        ControlPanel controls = new ControlPanel();

        ActionListener saveSettingsButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setSpiralGapSize(controls.getGapSize());
                display.setSpiralRingsAmount(controls.getRingAmount());
                display.setSpiralSpinSpeed(controls.getSpinSpeed());
                display.setSpiralCenterSize(controls.getCenterSize());

                display.setSpiralColor(controls.getSpiralColor());

            }
        };
        ActionListener exportButtonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File outputFile = new File("output.png");
                try {
                    ImageIO.write(display.snapshot(), "png", outputFile);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        };

        controls.getSaveButton().addActionListener(saveSettingsButtonListener);
        controls.getExportButton().addActionListener(exportButtonListener);
    }
}