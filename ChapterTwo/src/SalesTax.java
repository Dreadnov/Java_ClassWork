/**
 * Created by Matthew on 1/11/2017.
 */
import java.util.Scanner;
public class SalesTax
{
    public static void main(String[] args)
    {
        //enables the class for user input
        Scanner reader = new Scanner(System.in);


        double slaesTax,countrySalesTax,userInput,calc;


        System.out.println("Enter in the purchase amount: ");

        slaesTax = 0.055;
        countrySalesTax = 0.02;

        //grabs the users input
        userInput = reader.nextDouble();

        //calculates the sales tax
        calc = (userInput + countrySalesTax)  + slaesTax;

        //displays the total
        System.out.println("Your current total is: " +  calc);
    }
}
