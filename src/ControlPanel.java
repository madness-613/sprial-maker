import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class ControlPanel extends JFrame {
    private final ControlInput ringsAmountInput, gapSizeInput;
    private final JButton saveButton = new JButton("save");

    // The constructor follows
    public ControlPanel() {
        setTitle("Control Panel");
        setSize(200, 400);
        setLocation(500, 0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        BoxLayout layout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);

        ringsAmountInput = new ControlInput("rings", 5, 0, getWidth()-10, 25, NumberFormat.getIntegerInstance());
        gapSizeInput = new ControlInput("size", 5, 25, getWidth()-10, 25, NumberFormat.getIntegerInstance());

        add(ringsAmountInput);
        add(gapSizeInput);
        add(saveButton);

        setLayout(layout);
        setVisible(true);

    }

    // getters
    public int getRingAmount(){
        String ringsAmountInputText = ringsAmountInput.getInput();
        return Integer.parseInt(ringsAmountInputText);
    }
    public int getSpiralSize(){
        String spiralSizeInputInputText = gapSizeInput.getInput();
        return Integer.parseInt(spiralSizeInputInputText);
    }

    public JButton getSaveButton() {
        return saveButton;
    }
}