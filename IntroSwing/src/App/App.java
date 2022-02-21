package App;

import Logic.Mainframe;
import Utils.CenterFrame;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Mainframe();
            }
        });
    }
}
