/**
 * Created by Matthew on 3/1/2017.
 */
public class ChTenEx1_Launcher
{
    public static void main(String[] args)
    {
        //an array of doubles
        double[] aArr1 = { 1, 2 ,3,4,5};
        //a call to the ChTenEx1_TestScore class that makes an object
        ChTenEx1_TestScore testScore1 = new ChTenEx1_TestScore(aArr1);
        //runs the testScore1 object
        testScore1.run();
    }
}
