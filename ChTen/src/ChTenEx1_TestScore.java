/**
 * Created by Matthew on 3/1/2017.
 */
public class ChTenEx1_TestScore
{
    //fields
    private double[] aArr;

    ChTenEx1_TestScore(double[] testScore)
    {
        this.aArr = new double[testScore.length];
        for (int i = 0; i < aArr.length; i++)
        {
            this.aArr[i] = testScore[i];
        }

    }
    //methods

    public void run()
    {
        checkVals();
        System.out.println(retriveAvrage());
    }

    public void run2() throws ChTenEx2_ClassCustomException
    {
        checkVals2();
        System.out.println(retriveAvrage());
    }

    public void checkVals() throws IllegalArgumentException
    {
        for (double a : this.aArr)
        {
            if (a > 100 || a < 0)
            {
                throw new IllegalArgumentException("\nValue must be 100 or less and grater than 0");
            }
        }
    }
    public void checkVals2() throws IllegalArgumentException
    {
        for (double a : this.aArr)
        {
            if (a > 100 || a < 0)
            {
                try
                {
                    throw new ChTenEx2_ClassCustomException();
                } catch (ChTenEx2_ClassCustomException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }

    public double retriveAvrage()
    {
        double sum = 0;
        for (double a : this.aArr)
        {
            sum += a;
        }
        return sum / this.aArr.length;
    }
}
