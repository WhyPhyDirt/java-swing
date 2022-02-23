package Controller;

import View.FormPanel;
import View.TextPanel;
import View.Toolbar;

import javax.swing.*;
import java.awt.*;

public class Mainframe extends JFrame {

    private FormPanel formPanel;
    private TextPanel textPanel;
    private Toolbar toolbar;

    public Mainframe(){
        super("Title Goes Here");
        setSize(1024,768);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        formPanel = new FormPanel();
        textPanel = new TextPanel();
        toolbar = new Toolbar();

        add(formPanel, BorderLayout.WEST);
        add(textPanel,BorderLayout.CENTER);
        add(toolbar, BorderLayout.NORTH);
        setVisible(true);

    }
}
