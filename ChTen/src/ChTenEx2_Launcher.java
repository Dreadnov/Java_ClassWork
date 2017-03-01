/**
 * Created by Matthew on 3/1/2017.
 */
public class ChTenEx2_Launcher
{
    public static void main(String[] args)
    {
        double[] aArr1 = { -1, 2 ,3,4,5};
        double[] aArr2 = {1,2,3,4,5};

        ChTenEx1_TestScore testScore1 = new ChTenEx1_TestScore(aArr1);
        ChTenEx1_TestScore testScore2 = new ChTenEx1_TestScore(aArr2);

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
