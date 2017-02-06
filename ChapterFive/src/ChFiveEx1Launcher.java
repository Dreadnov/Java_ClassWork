import java.util.Scanner;

/**
 * Created by Matthew on 1/31/2017.
 */
public class ChFiveEx1Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);// Enables the scanner object
        ChFiveEx1 grab = new ChFiveEx1();// Enables the new class
        System.out.print("Enter in a positive number between 1 and 50 ");
        grab.setUserInput(reader.nextInt());// Grabs the users input to be used in the ChFiveEx1 Class


        System.out.print(ChFiveEx1.Evaluate());//Prints out the end result for the problem


    }
}
