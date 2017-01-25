/**
 * Created by Matthew on 1/19/2017.
 */

public class ChThreeEx2Launch
{
    public static void main(String[] args)
    {
        ChThreeEx2 Car = new ChThreeEx2(1996,"Honda");
        System.out.println("Year the car was made: " + Car.getYearModel());
        System.out.println("Brand of the car: " + Car.getModel());

        for (int i = 0; i < 5 ; i++)
        {
           Car.accelarate();
        }
        System.out.println("\n");
        for (int i = 0; i < 5 ; i++)
        {
           Car.brake();
        }
    }
}
