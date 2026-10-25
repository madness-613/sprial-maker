import javax.swing.*;
import java.lang.reflect.Array;
import java.text.Format;

public class ControlInput {
    private JLabel text;
    private JTextField input;
    private int x, y, w, h;

    private JPanel panel = new JPanel();
    private GroupLayout layout = new GroupLayout(panel);


    public ControlInput(String title, int x, int y, int width, int height){
        this.input = new JTextField();
        this.text = new JLabel(title);
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;

        text.setLabelFor(input);
        input.setBounds(x + text.getWidth(), y, width, height);
        panel.setBounds(x, y, width, height);

        setup();
    }
    public ControlInput(String title, int x, int y, int width, int height, Format format){
        this.input = new JFormattedTextField(format);
        this.text = new JLabel(title);
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;

        text.setLabelFor(input);
//        input.setBounds(x + text.getWidth(), y, width, height);
        panel.setBounds(x, y, width, height);


        setup();
    }

    private void setup(){
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        panel.setLayout(layout);

        layout.setHorizontalGroup(layout.createSequentialGroup()
                .addComponent(text)
                .addComponent(input)
        );

        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                .addComponent(text)
                .addComponent(input)
        );
    }

    public void add(JFrame frame){
        frame.add(panel);
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
