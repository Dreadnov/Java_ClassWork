/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx5
{
    public static void clac(double Balance, int ChecksUsed )
    {
        ///local variables and their field
        int perMonth = 10;
        int underCharge = 15;
        int checksUsed = ChecksUsed;
        double balance = Balance;
        double charge = 0;
        charge += (double)perMonth;

        // uses if statements to calculate the charge
        if (balance < 400)
        {
            charge += (double)underCharge;
        }
        if (checksUsed >= 60)
        {
            charge += .04 * checksUsed;
        }
        else if (checksUsed >= 40)
        {
            charge += .06 * checksUsed;
        }
        else if (checksUsed >= 20 )
        {
            charge += .08 * checksUsed;
        }
        else
        {
            charge += .10 * checksUsed;
        }
        //displays the calculation when the if statements finish the calculations
        System.out.print("Service Fee: "  + String.format("%,.2f",charge) );
    }

}
