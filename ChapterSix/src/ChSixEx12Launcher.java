import java.util.Scanner;
/**
 * Created by Matthew on 2/9/2017.
 */
public class ChSixEx12Launcher
{
    public static void main(String[] args)
    {

        Scanner reader = new Scanner(System.in);// enables scanner object
        ChSixEx12_FuelGauge p1 = new ChSixEx12_FuelGauge();// enables the p1 class object
        ChSixEx12_Odometer p2 = new ChSixEx12_Odometer(p1);// enables the p2 class object

        int i = 24;//for loop runs the miles
        for (int j = 1; j <=  360 ; j++)
        {
            if (p1.getFuel() <= 1.1)// checks if the car needs gas
            {
                int y = 0;
                while(y <= 15 )//puts gas in the car until full
                {
                    if(p1.getFuel() <= 15 ) {//adds 1 gallon of gas and displays the current level of gas
                        p1.getFilledUp();
                        System.out.print("\nThe current fuel level is " + p1.getFuel());
                    }
                    y++;
                }
            }
            if(i == 25)//displays the amount of gas and mialge pergalon of gas used
            {
                System.out.print("\nThe current millage is " + p2.getMileage() +
                        "The current fuel is " + p1.getFuel());
                i = 1;
            }else {
                i++;
            }
            p2.getAddMile();//adds 1 mile to the odometer
            p2.getBurn();// burns 1 24th gallon oif gas

        }



    }
}
