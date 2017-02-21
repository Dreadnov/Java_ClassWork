import java.util.Scanner;

/**
 * Created by Matthew on 2/14/2017.
 */
public class ChSevenEx1_RainFall
{
    static Scanner reader = new Scanner(System.in);

    static int[] rainPerMonth = new int[12];

    static double avg = 0,total = 0;
    static int highVal = 0;
    static int lowValue = 0 ;


    public static void genUserInput()
    {
        for (int i = 0; i < rainPerMonth.length; i++)
        {
            System.out.print("Month " + (i + 1) + ": ");
            rainPerMonth[i] = reader.nextInt();

            while (rainPerMonth[i] < 0)
            {
                System.out.print("Month " + (i + 1) + ": ");
                rainPerMonth[i] = reader.nextInt();
            }
            total += rainPerMonth[i];
            avg += total / rainPerMonth.length;
        }
    }

    public static void getHighestMonth()
    {
        int highest = rainPerMonth[0];

        for (int i = 0; i < rainPerMonth.length; i++)
        {
            if (rainPerMonth[i] > highest)
            {
                highest = rainPerMonth[i];
                highVal = i;
            }
        }
    }

    public static void getLowestMonth()
    {
        int lowest = rainPerMonth[0];

        for (int i = 1; i < rainPerMonth.length; i++)
        {
            if (rainPerMonth[i] < lowest)
            {
                lowest = rainPerMonth[i];
                lowValue = i;
            }
        }
    }

    public static void getOutPut()
    {
        System.out.print("Total: " + (int)total);
        System.out.print("\nAverage: " + String.format("%,.2f%%" , avg));
        System.out.print("\nHighest month: " + (highVal + 1 ));
        System.out.print("\nLowest month: " + (lowValue + 1));
    }

}
