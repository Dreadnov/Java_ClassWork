/**
 * Created by Matthew on 1/12/2017.
 */
import java.util.Scanner;

public class MilesPerGallon
{
    public static void main(String[] args)
    {

        Scanner reader = new Scanner(System.in);


        double traveled,used,total;

        System.out.println("Enter in the amount that you traveled: ");
        //grabs the amount the user traveled
        traveled = reader.nextDouble();
        System.out.println("Enter in the amount of gas used: ");
        //amount of gas the user used
        used = reader.nextDouble();

        //calculates the total
        total = traveled / used;

        System.out.println("Total miles per gallon: " + total);

    }
}
