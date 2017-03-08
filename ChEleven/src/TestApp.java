import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Matthew on 3/8/2017.
 */
public class TestApp
{
    private JPanel JPannelBoarder;
    private JPanel jPannelNorth;
    private JPanel jPannelEast;
    private JPanel jPannelWest;
    private JPanel jPannelSouth;
    private JPanel jPannelCenter;
    private JButton clac;
    private JButton exit;
    private JRadioButton whiteRadioButton;
    private JRadioButton wheatRadioButton;
    private JCheckBox creamCheeseCheckBox;
    private JCheckBox butterCheckBox;
    private JCheckBox peachJellyCheckBox;
    private JCheckBox blueberryJamCheckBox;
    private JRadioButton radioButton3;
    private JRadioButton regularCoffeeRadioButton;
    private JRadioButton decafCoffeeRadioButton;
    private JRadioButton cappuccinoRadioButton;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Order Calculator");
        frame.setContentPane(new TestApp().JPannelBoarder);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    public TestApp()
    {
        JPannelBoarder.setPreferredSize(new Dimension(500,200));
        exit.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent mouseEvent)
            {
                super.mouseClicked(mouseEvent);
                System.exit(0);
            }
        });
        clac.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent mouseEvent)
            {
                super.mouseClicked(mouseEvent);
                Thread thread = new Thread(new Thread(){
                    @Override
                    public void run()
                    {
                        calcTotal();
                    }
                });
                thread.start();
            }
        });
    }
    private void calcTotal(){
        double price  = 0;
        if(radioButton3.isSelected()){
            price += 10;
        }
        JOptionPane.showMessageDialog(null, "The price is " + price);
    }
}