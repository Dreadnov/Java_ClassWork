import java.util.Scanner;

/**
 * Created by Matthew on 1/23/2017.
 */
public class ChThreeEx8
{
    double testScore;
    double average;

    //This will get and set the variables listed above
    public double getTestScore()
    {
        return testScore;
    }
    public void setTestScore(double testScore)
    {
        this.testScore = testScore;
    }

    public double getAverage()
    {
        return average;
    }
    public void setAverage(double average)
    {
        this.average = average;
    }

    //This method will ask the user what 3 test scores will be averaged out to
   public void yInfo()
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter in the test grade: ");
        testScore = reader.nextDouble();

    }



}
