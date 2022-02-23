package Toolbox;

import javax.swing.*;
import javax.swing.border.Border;

public class SetBorders {

    public static void setTitledBorders(JPanel jpanel, String title, int top, int left, int bottom, int right){
        Border outerBorder = BorderFactory.createTitledBorder(title);
        Border innerBorder = BorderFactory.createEmptyBorder(top,left,bottom,right);
        jpanel.setBorder(BorderFactory.createCompoundBorder(outerBorder,innerBorder));
    }
}
