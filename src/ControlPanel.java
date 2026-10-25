import javax.swing.*;
import java.awt.*;
import java.text.NumberFormat;

public class ControlPanel extends JFrame {
    private final ControlInput ringsAmountInput, gapSizeInput, spinSpeedInput, centerSizeInput;
    private final JColorChooser spiralColorInput;
    private final JButton saveButton = new JButton("save");

    // The constructor follows
    public ControlPanel() {
        setTitle("Control Panel");
        setSize(400, 600);
        setLocation(500, 0);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        BoxLayout layout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);

        ringsAmountInput = new ControlInput("rings", 5, 0, getWidth()-10, 25, NumberFormat.getNumberInstance(), "5");
        gapSizeInput = new ControlInput("gap size", 5, 25, getWidth()-10, 25, NumberFormat.getNumberInstance(), "5");
        spinSpeedInput = new ControlInput("spin speed", 5, 25, getWidth()-10, 25, NumberFormat.getNumberInstance(), "0.05");
        centerSizeInput = new ControlInput("center size", 5, 25, getWidth()-10, 25, NumberFormat.getNumberInstance(), "0");

        add(ringsAmountInput);
        add(gapSizeInput);
        add(spinSpeedInput);
        add(centerSizeInput);

        spiralColorInput = new JColorChooser(Color.cyan);

        add(spiralColorInput);
        add(saveButton);

        setLayout(layout);
        setVisible(true);

    }

    // getters
    public double getRingAmount(){
        String ringsAmountInputText = ringsAmountInput.getInput();
        return Double.parseDouble(ringsAmountInputText);
    }
    public double getGapSize(){
        String gapSizeInputInputText = gapSizeInput.getInput();
        return Double.parseDouble(gapSizeInputInputText);
    }
    public double getSpinSpeed(){
        String spinSpeedInputInputText = spinSpeedInput.getInput();
        return Double.parseDouble(spinSpeedInputInputText);
    }
    public double getCenterSize(){
        String centerSizeInputInputText = centerSizeInput.getInput();
        return Double.parseDouble(centerSizeInputInputText);
    }


    public Color getSpiralColor(){
        return spiralColorInput.getColor();
    }
    public JButton getSaveButton() {
        return saveButton;
    }
}