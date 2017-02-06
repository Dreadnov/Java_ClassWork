import java.util.Scanner;
/**
 * Created by Matthew on 1/31/2017.
 */
public class ChFiveEx2
{
    static int time;// the time that the user spent in the car
    static int speed;// the speed that user was going
    static int distance;// distance is equal to the speed and time
    static int id = 1;// an exit parameter for the GetSpeed methods do while loop
    static int id1 = 1;// an exit parameter for the GetTime methods do while loop

    public static int getSpeed()
    {
        return speed;
    }
    public static void setSpeed(int speed)
    {
        ChFiveEx2.speed = speed;
    }

    public static int getTime()
    {
        return time;
    }
    public static void setTime(int time)
    {
        ChFiveEx2.time = time;
    }

    private static void GetSpeed()// gets the speed that the users was going
    {
        Scanner reader = new Scanner(System.in); // enables scanner for the GetSpeed method
       do// it will continue until the users input is valid
       {
           System.out.print("Enter in the speed the vehicle is going: ");
           setSpeed(reader.nextInt());// gets the users input

       }
       while (getSpeed() <= -1);
    }
    private static void GetTime()// gets the time that the users input
    {
        Scanner reader = new Scanner(System.in);// enables scanner for the GetTime method
        do
        {
            System.out.print("Enter in the amount of time you drove the vehicle: ");
            setTime(reader.nextInt());// gets the users input
            if (getTime() >= 1 )// if the users input is less than 0 the loop will repeat
            {
                id1 = 0;
            }
        }
        while (id1 == 1);
    }
    private static void  GetDistance()// gets the distance by calculating speed times time
    {System.out.println("\nHour                    Distance Traveled" +
                "\n-----------------------------------------");
        for (int i = 1; i <= time; i++)
        {

            distance = speed * i;
            System.out.println(i + "                          " + distance);
        }
    }
    public static void Display()// displays the three methods
    {
        GetSpeed();
        GetTime();
        GetDistance();
    }
}
