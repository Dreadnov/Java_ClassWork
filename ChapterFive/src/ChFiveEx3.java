import java.util.Scanner;
import java.io.*;
/**
 * Created by Matthew on 2/1/2017.
 */
public class ChFiveEx3
{
    static int time;// the time that the user spent in the car
    static int speed;// the speed that user was going
    static int distance;// distance is equal to the speed and time
    static int id = 1;// an exit parameter for the GetSpeed methods do while loop
    static int id1 = 1;// an exit parameter for the GetTime methods do while loop

    public static int getTime()
    {
        return time;
    }
    public static void setTime(int time)
    {
        ChFiveEx3.time = time;
    }

    public static int getSpeed()
    {
        return speed;
    }
    public static void setSpeed(int speed)
    {
        ChFiveEx3.speed = speed;
    }

    private static void GetSpeed()// gets the speed that the users was going
    {
        Scanner reader = new Scanner(System.in); // enables scanner for the GetSpeed method
        do// it will continue until the users input is valid
        {

            if (getSpeed() > 0 )// if the users input is less than 0 the loop will repeat
            {
                id = 0;
            }
        }
        while (id == 1);
    }
    private static void GetTime()// gets the time that the users input
    {
        Scanner reader = new Scanner(System.in);// enables scanner for the GetTime method
        do
        {

            if (getTime() > 0 )// if the users input is less than 0 the loop will repeat
            {
                id1 = 0;
            }
        }
        while (id1 == 1);
    }
    private static void  GetDistance()// gets the distance by calculating speed times time
    {
        System.out.println("\nHour                    Distance Traveled" +
                "\n-----------------------------------------");
        for (int i = 1; i <= getTime(); i++)
        {
            distance = getSpeed() * i;
            System.out.println(i + "                          " + distance);
        }
    }
    private static void Write()// opens notepad.exe and then writes the outcome into the
    {
        try{
            PrintWriter outputFile = new PrintWriter("C:\\Users\\Matthew\\Downloads\\ChFiveEx3.txt");// goes to the file directory and prints
            outputFile.println("Hour                    Distance Traveled");
            outputFile.println("-----------------------------------------");
            for (int i = 1; i <= getTime(); i++)// gets the distance by calculating speed times time
            {
                distance = getSpeed() * i;
                outputFile.println(i + "                          " + distance);
            }
            ProcessBuilder pb = new ProcessBuilder("notepad.exe", "C:\\Users\\Matthew\\Downloads\\ChFiveEx3.txt");
            pb.start();
            outputFile.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void Display()// displays the three methods
    {
        GetSpeed();
        GetTime();
        GetDistance();
        Write();
    }
}
