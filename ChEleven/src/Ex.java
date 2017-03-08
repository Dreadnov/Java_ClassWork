import com.sun.javaws.exceptions.ExitException;

import javax.swing.*;
import javax.swing.plaf.basic.BasicDesktopPaneUI;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Matthew on 3/7/2017.
 */
public class Ex
{
    private JPanel vin;
    private JTextField textField1;
    private JTextField textField2;
    private JCheckBox example1CheckBox;
    private JPanel exn;
    private JPanel zin;
    private JPanel vnd;
    private JButton calculateButton;
    private JPanel lol;
    private JButton exitButton;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Example");
        frame.setContentPane(new Ex().vin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    public Ex()
    {
        exn.setBorder(BorderFactory.createTitledBorder("Ex1"));
        lol.setBorder(BorderFactory.createTitledBorder("Ex2"));
        vnd.setBorder(BorderFactory.createTitledBorder("Ex3"));


    }


}
