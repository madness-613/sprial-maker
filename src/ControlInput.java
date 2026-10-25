import javax.swing.*;
import java.lang.reflect.Array;
import java.text.Format;

public class ControlInput extends JPanel{
    private JLabel text;
    private JTextField input;
    private int x, y, w, h;

    private GroupLayout layout = new GroupLayout(this);


    public ControlInput(String title, int x, int y, int width, int height, String defaultValue){
        setBounds(x, y, width, height);
        layout.setAutoCreateGaps(true);
        setLayout(layout);

        this.input = new JTextField(defaultValue);
        this.text = new JLabel(title);
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;

        text.setLabelFor(input);

        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(text).addComponent(input));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(text).addComponent(input));
    }

    public ControlInput(String title, int x, int y, int width, int height, Format format, String defaultValue){
        setBounds(x, y, width, height);
        layout.setAutoCreateGaps(true);
        setLayout(layout);

        this.input = new JFormattedTextField(format);
        input.setText(defaultValue);
        this.text = new JLabel(title);
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;

        text.setLabelFor(input);

        layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(text).addComponent(input));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(text).addComponent(input));
    }

    public String getInput(){
        return input.getText();
    }

    public JLabel getText() {
        return text;
    }

    public JTextField getTextField() {
        return input;
    }
}
