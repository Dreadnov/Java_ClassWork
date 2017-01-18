/**
 * Created by Matthew on 1/12/2017.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class RestaurantBill
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        double totalCharge,tax,tip,taxAmount,tipAmount,initalCharge;

        tax = 0.075;
        tip = 0.18;


        System.out.println("Enter total amount: ");
        initalCharge = reader.nextDouble();
        taxAmount = initalCharge * tax;
        tipAmount = (initalCharge + taxAmount) * tip;
        totalCharge = tax + initalCharge + tip;
        System.out.println("Total Charge: " + initalCharge);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Tip Amount: " + tipAmount);
        System.out.println("Total:  " + totalCharge);




    }
}
