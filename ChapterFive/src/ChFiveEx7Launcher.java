import java.util.Scanner;

/**
 * Created by Matthew on 2/2/2017.
 */
public class ChFiveEx7Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);// enables the scanner
        ChFiveEx7 Rain = new ChFiveEx7();
        int numYrs;// number of years
        do
        {
            System.out.print("Enter in the number of years: ");
            numYrs = reader.nextInt();// grabs the users input for numYears

        }while (numYrs < 1);
        Rain.setYears(numYrs);// sets the number of years
        Rain.Month();//

        System.out.print("Total Rainfall: " + Rain.getTotalRainfall() + " inches.\n"
                +"Total Months: " + Rain.getAccMonths() + ".\n"
                +"Average Rainfall: " + Rain.getAvgRainfall());
    }
}
