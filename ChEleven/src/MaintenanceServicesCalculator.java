import javax.swing.*;

/**
 * Created by Matthew on 3/6/2017.
 */
public class MaintenanceServicesCalculator
{
    private JPanel MSC;

   //labels
    private JLabel oilCharge;
    private JLabel lubeJob;
    private JLabel radiatorFlush;
    private JLabel transmissionFlush;
    private JLabel inspection;
    private JLabel mufflerReplacement;
    private JLabel tireRotation;
    //CheckBoxes
    private JCheckBox checkBox_OilChange;
    private JCheckBox checkBox_LubeJob;
    private JCheckBox checkBox_RadiatorFlush;
    private JCheckBox checkBox_TransmissionFlush;
    private JCheckBox checkBox_Inspection;
    private JCheckBox checkBox_MufflerReplacement;
    private JCheckBox checkBox_TireRotation;
    private JCheckBox checkBox_Other;
    private JLabel total;
    private JTextArea textArea1;

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("MaintenanceServicesCalculator");
        frame.setContentPane(new MaintenanceServicesCalculator().MSC);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }



    public void calcServiceFee()
    {

    }


}
