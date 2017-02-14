import java.util.Scanner;

/**
 * Created by Matthew on 2/9/2017.
 */
public class ChSixEx11Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);// enables the scanner object
        ChSixEx11 dis = new ChSixEx11();//enables the new ChSixEx11 class object
        int userNumChoice;// a variable to pass tp the other class with the user input

        //asks for the users input of 1-4 depending on the calculation that the user needs
        System.out.print("Geometry Calculator");
        System.out.print("\n1. Calculate the Area of a Circle");
        System.out.print("\n2. Calculate the Area of a Rectangle");
        System.out.print("\n3. Calculate the Area of a Triangle");
        System.out.print("\n4. Quit");
        System.out.print("\n\nEnter in your choice (1-4)");
        userNumChoice = reader.nextInt();//grabs the users input
        while (userNumChoice < 1 || userNumChoice > 4)//validation to makes sure that the users input is correct
        {
            System.out.print("\nInvalid user input re-enter a valid number: ");
            userNumChoice = reader.nextInt();
        }

        dis.setUserChoice(userNumChoice);//sends the users choice to the other class
        dis.choiceInput();//displays the final output for the program
    }
}
