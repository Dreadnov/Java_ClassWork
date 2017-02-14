import java.util.Scanner;

/**
 * Created by Matthew on 2/7/2017.
 */
public class ChSixEx1Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);//Enables the scanner object

        System.out.print("Enter in 0: for circle 1: for rectangle 2: for cylinder ");//asks the user for the input of 1 2 or 3
         int input = reader.nextInt();//grabs the users input
        if (input <= -1 || input >= 3)// validation for the users input
        {
            System.out.print("Enter in a valid number : ");
            input = reader.nextInt();//grabs the users input again

        }
        ChSixEx1.setInput(input);//sends the users input to the other class
        ChSixEx1.grabUserInput();//grabs the final output form the other class
    }
}
