import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Matthew on 2/1/2017.
 */
public class ChFiveEx3Launcher
{
    public static void main(String[] args) throws IOException
    {
        Scanner reader = new Scanner(System.in);
        ChFiveEx3 di = new ChFiveEx3();

        System.out.print("Enter in the speed the vehicle is going: ");
        di.setSpeed(reader.nextInt());// gets the users input

        System.out.print("Enter in the amount of time you drove the vehicle: ");
        di.setTime( reader.nextInt());// gets the users input

        ChFiveEx3.Display();// display the outcome
    }
}
