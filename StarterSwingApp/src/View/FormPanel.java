package View;



import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FormPanel extends JPanel {
    public FormPanel(){
        Dimension dim = new Dimension();
        dim.width = 300;
        setPreferredSize(dim);
        Toolbox.SetBorders.setTitledBorders(this,"User Data:",5,5,5,5);
        setVisible(true);
    }
}
