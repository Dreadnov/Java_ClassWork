import java.util.Scanner;
/**
 * Created by Matthew on 2/2/2017.
 */
public class ChFiveEx8Launcher
{
    public static void main(String[] args)
    {
        ChFiveEx8 vnd = new ChFiveEx8();
        Scanner reader = new Scanner(System.in);// enable the scanner object
        int arr[] = new int[99]; // array that holds the users input latter in the program
        int Minimum = 0; // gives a variable to get the minimum value of my array
        int Maximum = 0; // gives a variable to get the maximum value of my array

            while (vnd.getUserInput() != -99)// this will not end until the user has entered the exit parameter provided to them
            {
                for (int i = 0; i <= vnd.getUserInput() ; i++)
                {
                    System.out.print("Enter in a number.  (End the program with -99)");
                    vnd.setUserInput(reader.nextInt());// grabs the users input
                    arr[i] = vnd.getUserInput();// adds the users input into the array
                }
            }

        for (int i = 0; i < arr.length; i++)// grabs the length of the array and checks for the lowest value in the array not including -99
        {
            if (Minimum > arr[i])
                Minimum = arr[0];// <-- Makes it to where the value is not going to grab -99
        }

        for (int i = 0; i < arr.length; i++)// grabs the length of the array and checks for the highest value in the array
        {
            if (Maximum < arr[i])
                Maximum = arr[i];// <-- gets and sets the highest int for the
        }

        if (vnd.getUserInput() == -99)// checks if the while loop has ended to produce the final product
        {
            System.out.print("The maximum number is: " + Maximum + "\n"// Displays the final max value
                            +"The minimum number is: " + Minimum);     // Displays the final min value
        }
    }
}
