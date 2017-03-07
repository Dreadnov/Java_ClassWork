import javax.swing.*;
import java.util.Scanner;

/**
 * This statment above is an import statements.
 */






/**
 * Created by Matthew on 2/16/2017.
 */
public class ChSevenEx3_ChargeAccountValidation_Launcher
{

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int userInput = 0;
        // asks for user input
        userInput = Integer.parseInt(JOptionPane.showInputDialog("Enter in the account that is gong to be charged:"));
        ChSevenEx3_ChargeAccountValidation.setAccountChargeUInput(userInput);
        //sends user input to the ChSevenEx3_ChargeAccountValidation class
        ChSevenEx3_ChargeAccountValidation.val();


    }
}
