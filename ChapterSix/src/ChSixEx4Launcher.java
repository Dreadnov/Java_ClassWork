import java.util.Scanner;

/**
 * Created by Matthew on 2/7/2017.
 */
public class ChSixEx4Launcher
{
    static Scanner reader = new Scanner(System.in);//enables the scanner object
    public static void main(String[] args)
    {
        System.out.print("Enter in the length of the first track: ");
        double length = Double.parseDouble(reader.nextLine());//grabs the users input for the first tracks length
        System.out.print("Enter in the width of the first track: ");
        double width = Double.parseDouble(reader.nextLine());//grabs the users input for the first tracks length
        ChSixEx4 trackOne = new ChSixEx4(length, width);//sends back the result of the users input back to the other class

        System.out.format("\nEnter in the length for the second track: ");
        double len = Double.parseDouble(reader.nextLine());//grabs the second input for the second tracks length
        System.out.print("Enter in the width of the second track: ");
        double w = Double.parseDouble(reader.nextLine());//grabs the second input for the second tracks length
        ChSixEx4 trackTwo = new ChSixEx4(len, w);//sends back the result of the users input back to the other class

        System.out.print("\nArea of track One: " + trackOne.getArea() + "\n");//gets the area of the first track
        System.out.print( "Area of track Two: " + trackTwo.getArea() + "\n");//gets the area of the second track

        if (trackOne.equals(trackTwo))//validation for the users input and checks if the two areas are the same or different
        {
            System.out.print("\nThe tracks are the same length");
        }
        else
        {
            System.out.format("The tracks are not the same length.");
        }
    }
}
