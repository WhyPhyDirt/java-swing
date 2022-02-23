package View;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TextPanel extends JPanel {

    private static JTextArea userText = new JTextArea();

    public TextPanel(){
        setLayout(new BorderLayout());
        Toolbox.SetBorders.setTitledBorders(this,"Additional Data",5,5,5,5);


        add(new JScrollPane(userText),BorderLayout.CENTER);
        setVisible(true);
    }

    public static void appendText(String string) {
        userText.append(string);
    }
}
