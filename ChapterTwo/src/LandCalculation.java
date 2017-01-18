/**
 * Created by Matthew on 1/11/2017.
 */
public class LandCalculation
{
    public static void main(String[] args)
    {
        double oneAcer, totalAcer, calc;

        //Land per square feet
        oneAcer = 43560;
        totalAcer = 389767;

        //calculates the area
        calc = totalAcer / oneAcer;

        //displays the out put
        System.out.println( "Total: " + calc);

    }
}
