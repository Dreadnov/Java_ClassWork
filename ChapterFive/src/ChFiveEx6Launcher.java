import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Matthew on 2/2/2017.
 */
public class ChFiveEx6Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ChFiveEx6 Gage = new ChFiveEx6();
        double sartp;//starting population
        double populationIncrease;//population increase
        double multiPD;// how many days the user entered
        double avg = 0; //average


        //asks the user for the current population
        do
        {
            System.out.print("Enter in the Current population of the species: ");
            sartp = reader.nextDouble();//grabs the users input
        }while (sartp <= 1);//this will continue to loop until it is grater then 1
        Gage.setStartPop(sartp);//assigns the value to Start Population

        //asks for the population increase
        do
        {
            System.out.print("Enter in the average daily population increase: ");
            populationIncrease = reader.nextDouble();
        }while (populationIncrease < 0 );
        Gage.setPopIncrease(populationIncrease);//sets the population to the set popIncrese

        //gets the number of days
        do
        {
            System.out.print("Enter in the number of days they will multiply: ");
            multiPD = reader.nextDouble();
        }while (multiPD <= 1.5);//will run unless
        Gage.setMultiPerDay(multiPD);

        DecimalFormat comma = new DecimalFormat("#,##0");//formatting for the average
        for (double i = 1; i <= Gage.getMultiPerDay() ; i++)
        {

            Gage.setStartPop(Gage.getStartPop() + (Gage.getPopIncrease() * Gage.getStartPop()));//calculates the start pop buy the new pop
            avg = Gage.getStartPop();// stres the new population
            System.out.print("\nDay " + (int)i +": " + comma.format(avg)   );//displays the final result
        }
    }
}
