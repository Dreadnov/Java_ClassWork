import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Created by Matthew on 3/6/2017.
 */
public class TravelExpenses
{
    /**Main Dependency*/
    private JPanel jPanelGridLayout;
    /**Input*/
    private JTextField textField_Days;
    private JTextField textField_Airfare;
    private JTextField textField_CarRentalFees;
    private JTextField textField_MilesDriven;
    private JTextField textField_ParkingFees;
    private JTextField textField_TaxiCharges;
    private JTextField textField_RegFees;
    private JTextField textField_LodgingCharges;
    /**Output*/
    private JLabel label_TotalExpenses;
    private JLabel label_AllowedExpenses;
    private JLabel label_ExcessExpenses;
    private JLabel label_AmountSaved;
    /**Invocation*/
    private JButton button1;
    /**Main*/
    public static void main(String[] args) {
        JFrame frame = new JFrame("TravelExpenses");
        frame.setContentPane(new TravelExpenses().jPanelGridLayout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    /**Listeners*/
    public TravelExpenses() {
        button1.addMouseListener(new MouseAdapter() {

            @Override public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                Thread thread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        calcTravelExpenses();
                    }
                });
                thread.start();
            }
        });
    }
    /**Methods*/
    private void calcTravelExpenses(){
        //set user expense fields
        int days = Integer.parseInt(textField_Days.getText());
        double airFare = Double.parseDouble(textField_Airfare.getText());
        double carRentalFees = Double.parseDouble(textField_CarRentalFees.getText());
        double milesDriven = Double.parseDouble(textField_MilesDriven.getText());
        double parkingFees = Double.parseDouble(textField_ParkingFees.getText());
        double taxiCharges = Double.parseDouble(textField_TaxiCharges.getText());
        double regFees = Double.parseDouble(textField_RegFees.getText());
        double lodgingCharges = Double.parseDouble(textField_LodgingCharges.getText());
        //set expense total
        double totalExpenses = airFare + carRentalFees + (milesDriven * 0.27) + parkingFees + taxiCharges + regFees + (lodgingCharges * days);
        //set local allowed fields
        double reimburseMeal = (double)days * 37.00;
        double reimburseParking = (double)days * 10.00;
        double reimburseTaxi = (double)days * 20.00;
        double reimburseLodging = (double)days * 95.00;
        double reimburseMiles = (double)milesDriven * 0.27;
        //set allowed total
        double allowedExpenses = reimburseMeal + reimburseParking + reimburseTaxi + reimburseLodging + reimburseMiles;
        //set amount saved and excess expenses
        double excessExpenses = 0, amountSaved = 0;
        if(totalExpenses - allowedExpenses > 0){
            excessExpenses = totalExpenses - allowedExpenses;
            amountSaved = 0;
        }
        else{
            amountSaved = Math.abs(totalExpenses - allowedExpenses);
            excessExpenses = 0;
        }
        //display
        this.label_TotalExpenses.setText(String.format("$%,.2f", totalExpenses));
        this.label_AllowedExpenses.setText(String.format("$%,.2f", allowedExpenses));
        this.label_ExcessExpenses.setText(String.format("$%,.2f", excessExpenses));
        this.label_AmountSaved.setText(String.format("$%,.2f", amountSaved));
    }
}
