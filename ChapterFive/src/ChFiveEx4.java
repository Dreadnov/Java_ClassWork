import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * Created by Matthew on 2/1/2017.
 */
public class ChFiveEx4
{
   static double currentDay,CurrentSalary = 0.01;

    public static double getCurrentDay()
    {
        return currentDay;
    }
    public static void setCurrentDay(double currentDay)
    {
        ChFiveEx4.currentDay = currentDay;
    }

    private static void GetUserInput()// method that gets the users input
    {
        Scanner reader = new Scanner(System.in);// enables the scanner object
        do
        {
            System.out.print("Enter in the number of days worked:  ");
            setCurrentDay(reader.nextDouble());  // gets the users day input
            if (getCurrentDay() <= 0)// if the input is less than 0 the invalid input
            {
                System.out.print("Error the current input is invalid\n\n");
            }
        }
        while (getCurrentDay() <= 1 );
    }
    private static void Exp()// the method formats the current day and then displays it
    {       DecimalFormat formatter = new DecimalFormat("$###0.00");
            System.out.println("\nDays Worked                    Salary" +
                    "\n-----------------------------------------");
            double total = 0.0;
            for (double i = 0.01,  x = 1; x <= getCurrentDay() ; i *= 2.0, x++)// the currentDay looped to display
            {
                System.out.println("Day: " + (int)x + "                          " +  formatter.format(( i )));
                total += i;
            }
            System.out.print("-----------------------------------------\n");
            System.out.print("\t\t\t\t\tTotal: " + formatter.format((total)));
    }
    public static void Dis()// enables the static methods to be displayed
    {
        GetUserInput();
        Exp();
    }
}
