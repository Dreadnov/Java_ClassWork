/**
 * Created by Matthew on 3/1/2017.
 */
public class ChTenEx2_Launcher
{
    public static void main(String[] args)
    {
        //Two double arrays that will trigger the exception
        double[] aArr1 = { -1, 2 ,3,4,5};
        double[] aArr2 = {1,2,3,4,5};

        //Creates two objects out of the arrays
        ChTenEx1_TestScore testScore1 = new ChTenEx1_TestScore(aArr1);
        ChTenEx1_TestScore testScore2 = new ChTenEx1_TestScore(aArr2);

        //attempts to see if the
        try
        {
            testScore1.run2();
            testScore2.run2();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
