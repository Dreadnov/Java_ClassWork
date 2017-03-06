/**
 * Created by Matthew on 3/1/2017.
 */
public class ChTenEx1_TestScore
{
    //fields
    private double[] aArr;
    // constructor that accepts a double array
    ChTenEx1_TestScore(double[] testScore)
    {
        //makes the array equal to the new array
        this.aArr = new double[testScore.length];
        for (int i = 0; i < aArr.length; i++)
        {
            this.aArr[i] = testScore[i];
        }

    }
    //methods
    //prints out the final outcome for the first iteration
    public void run()
    {
        checkVals();
        System.out.println(retrieveAverage());
    }
    //prints out the final outcome for the second iteration
    public void run2() throws ChTenEx2_ClassCustomException
    {
        checkVals2();
        System.out.println(retrieveAverage());
    }
    //checks the values that are sent in the array
    public void checkVals() throws IllegalArgumentException
    {
        //checks for the invalid number in the array
        for (double a : this.aArr)
        {
            if (a > 100 || a < 0)
            {
                //When the if statement is triggered this exception will be called
                throw new IllegalArgumentException("\nValue must be 100 or less and grater than 0");
            }
        }
    }
    //checks the values that are sent in the array
    public void checkVals2() throws IllegalArgumentException
    {
        //checks for the invalid number in the array
        for (double a : this.aArr)
        {

            if (a > 100 || a < 0)
            {
                try
                {
                    //When the try is triggered by the if statement  statement is triggered this exception will be called
                    throw new ChTenEx2_ClassCustomException();
                }
                catch (ChTenEx2_ClassCustomException e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
    //gets the average of the array
    public double retrieveAverage()
    {
        double sum = 0;
        for (double a : this.aArr)
        {
            sum += a;
        }
        return sum / this.aArr.length;
    }
}
