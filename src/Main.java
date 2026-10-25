import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{
    static void main(String[] args) {
        Display display = new Display();
        ControlPanel controls = new ControlPanel();

        ActionListener settingsSaveListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(controls.getSpiralSize());
                display.setDepth(controls.getSpiralSize());
            }
        };

        controls.getSaveButton().addActionListener(settingsSaveListener);
    }
}