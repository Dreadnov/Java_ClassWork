import com.sun.javafx.binding.StringFormatter;

import java.util.Scanner;
import java.util.Formatter;

/**
 * Created by Matthew on 1/12/2017.
 */
public class IngredientAdjuster
{
    public static void main(String[] args)
    {

        double sugar,butter,flower;
        double userInput,cookieAmount;

        sugar = 1.5;
        butter = 1;
        flower = 2.75;
        cookieAmount = 48;

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter in amount of cookies: ");
        userInput = reader.nextInt();

        System.out.println(String.format("Amount of Sugar: %,.2f", sugar * (userInput / cookieAmount)));
        System.out.println(String.format("Amount of Butter: %,.2f",  butter * (userInput / cookieAmount)));
        System.out.println(String.format("Amount of Flower: %,.2f",  flower * (userInput / cookieAmount)));
        System.out.println("Total amount of cookies: " + userInput);



    }
}
