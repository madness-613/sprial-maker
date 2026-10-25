import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        controls.getSaveButton().addActionListener(saveSettingsButtonListener);
    }
}