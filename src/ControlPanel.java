import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

public class ControlPanel extends JFrame {
    ControlInput ringsAmountInput;

    // The constructor follows
    public ControlPanel() {
        setTitle("Control Panel");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ringsAmountInput = new ControlInput("rings", 5, 0, getWidth()-10, 50, NumberFormat.getIntegerInstance());

        ringsAmountInput.add(this);

        setLayout(null);
        setVisible(true);
    }

    // getters
    public int getRingAmount(){
        String ringsAmountInputText = ringsAmountInput.getInput();
        return Integer.parseInt(ringsAmountInputText);
    }
}