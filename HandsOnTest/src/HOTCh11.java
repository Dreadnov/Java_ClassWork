import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Matthew on 3/8/2017.
 */
public class HOTCh11
{
    private JPanel panel1;
    private JCheckBox chk_OilChange;
    private JCheckBox chk_LubeJob;
    private JCheckBox chk_RadiatorFlush;
    private JCheckBox chk_TransmissionFlush;
    private JCheckBox chk_Inspection;
    private JCheckBox chk_MufflerReplacemnet;
    private JCheckBox chk_TireRotation;
    private JTextField txt_HoursOfLabor;
    private JTextField txt_partsCharges;
    private JButton calc;
    private JButton exitButton;
    private JPanel jForm;


    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Ranken's Automotive Maintenance");
        frame.setContentPane(new HOTCh11().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public HOTCh11()
    {
        calc.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent mouseEvent)
            {
                super.mouseClicked(mouseEvent);
                calc();
            }
        });


        exitButton.addMouseListener(new MouseAdapter()
        {
            @Override
            public void mouseClicked(MouseEvent mouseEvent)
            {
                super.mouseClicked(mouseEvent);
                System.exit(0);
            }
        });
    }

    public void calc()
    {
        double total = 0;

        if (chk_OilChange.isSelected())
        {
            total += 26.00;
        }
        if (chk_LubeJob.isSelected())
        {
            total += 18.00;
        }
        if (chk_RadiatorFlush.isSelected())
        {
            total += 30.00;
        }
        if (chk_TransmissionFlush.isSelected())
        {
            total += 80.00;
        }
        if (chk_Inspection.isSelected())
        {
            total += 15.00;
        }
        if (chk_MufflerReplacemnet.isSelected())
        {
            total += 100.00;
        }
        if (chk_TireRotation.isSelected())
        {
            total += 20.00;
        }

        int vin = Integer.parseInt(txt_HoursOfLabor.getText());
        int xin = Integer.parseInt(txt_partsCharges.getText());

        total += vin * xin + 20;

        JOptionPane.showMessageDialog(null, "Total Charge:" + String.format("%,.2f", total));

    }

}
