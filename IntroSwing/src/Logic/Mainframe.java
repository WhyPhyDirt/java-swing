package Logic;

import Utils.CenterFrame;

import javax.swing.*;
import java.awt.*;

import static Utils.CenterFrame.setWindowPosition;

public class Mainframe extends JFrame {
    public Mainframe() {
        super("Introduction To Swing ");
        setSize(800, 600);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setWindowPosition(this,0);
        setVisible(true);
    }
}
