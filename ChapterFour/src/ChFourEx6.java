import java.text.Format;

/**
 * Created by Matthew on 1/25/2017.
 */
public class ChFourEx6
{
    public static void ShippingCharge(int Weight, int Miles)
    {
        final int Rate = 500;
        double charge = 0;
        int miles = Miles;
        int weight = Weight;


        if (weight > 10)
        {
            charge = 4.80;
        }
        else if (weight > 6)
        {
            charge = 3.70;
        }
        else if (weight > 2)
        {
            charge = 2.20;
        }
        else
        {
            charge = 1.10;
        }
        int calculating = (miles / 500);
        if (miles % 500 != 0)
        {
            ++calculating;
        }
        double total = (double)(charge * calculating );
        System.out.print("The total is " + String.format("%.2f",total));
    }
}
