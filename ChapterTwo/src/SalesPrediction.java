/**
 * Created by Matthew on 1/11/2017.
 */
public class SalesPrediction
{
    public static void main(String[] args)
    {

        double prs, predict, calc;

        prs = 0.65;
        predict = 8300000;

        calc = prs * predict;

        System.out.println("Current amount: $" + calc + " million");

    }
}
