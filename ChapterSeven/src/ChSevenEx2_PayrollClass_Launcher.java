import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Matthew on 2/15/2017.
 */
public class ChSevenEx2_PayrollClass_Launcher
{
    public static void main(String[] args)
    {
        //instantiate an objects
        Scanner reader = new Scanner(System.in);
        ChSevenEx2_PayrollClass payRoll = new ChSevenEx2_PayrollClass();
        //local variables
        int hours;
        double payRate;
        String result = "";

        DecimalFormat format = new DecimalFormat("###,###,##0.00");//format for a decimal value

        for (int i = 0; i < payRoll.getEmployeeId().length; i++)//for each iteration of the getEmployeeId method
        {
            hours = Integer.parseInt(JOptionPane.showInputDialog("Enter the time for Employee Id# " + payRoll.getEmployeeId()[i]));
            payRate = Double.parseDouble(JOptionPane.showInputDialog("Enter the Pay Rate for the Employee ID# " + payRoll.getEmployeeId()[i]));
            payRoll.setHours(hours, i);//Sets Hours
            payRoll.setPayRate(payRate,i);//sets payRate
            payRoll.setWage(payRoll.getGrossPay(payRoll.getEmployeeId()[i]),i);
            result += "Employee #" + payRoll.getEmployeeId()[i] + "\n" + "Gross Pay: " +  format.format(payRoll.getGrossPay(payRoll.getEmployeeId()[i])) + "\n";//gets the result

        }
        //display the final result
        Double.parseDouble(JOptionPane.showInputDialog(null, result));
        System.exit(1);//exits the program
    }
}
