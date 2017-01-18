/**
 * Created by Matthew on 1/12/2017.
 */
public class EnergyDrinkConsumption
{
    public static void main(String[] args)
    {

        double popSurveyed, perWeek,flav,calPop,clacFlav;


        popSurveyed = 15000;
        perWeek = 0.18;
        flav = 0.58;

        //calculates the values
        calPop = popSurveyed * perWeek;
        clacFlav = popSurveyed * flav;

        //displays the outcome
        System.out.println(String.format("People that drink daily: %,.2f",calPop));
        System.out.println(String.format("People that drink citrus: %,.2f",clacFlav));

    }
}
