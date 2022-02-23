package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Toolbar extends JPanel implements ActionListener {

    private JButton btnBye, btnHey;
    private String message;

    public Toolbar(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBorder(BorderFactory.createEtchedBorder());

        btnBye = new JButton("Bye");
        btnBye.addActionListener(this);

        btnHey = new JButton("Hey");
        btnHey.addActionListener(this);

        add(btnHey);
        add(btnBye);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btnPressed = (JButton)e.getSource();
        if (btnPressed == btnHey){
            TextPanel.appendText("Hello\n");
        }else if (btnPressed == btnBye){
            TextPanel.appendText("Bye\n");
        }

    }
}
