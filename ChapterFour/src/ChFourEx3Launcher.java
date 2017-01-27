/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx3Launcher
{
    public static void main(String[] args)
    {
        ChFourEx3 avg = new ChFourEx3();

        //This will hold the outcomes of yInfo
        ChFourEx3[] calc = new ChFourEx3[3];

        //grabs the yInfo method and repeats it 3 times
        for (int i = 0; i < calc.length ; i++)
        {
            calc[i] = new ChFourEx3();
            calc[i].yInfo();
        }
        //grabs the 3 entered test scored and averages them by the amount of test scores there are
        avg.setAverage((calc[0].getTestScore() + calc[1].getTestScore() + calc[2].getTestScore())/3);
        //displays the final outcome


        if (avg.getAverage() >= 90.00)
        {
            System.out.printf("A: %,.2f", avg.getAverage());
        }
        else if (avg.getAverage() >= 80 || avg.getAverage() >= 89)
        {
            System.out.printf("B: %,.2f",avg.getAverage());
        }
        else if (avg.getAverage() >= 70 || avg.getAverage() >= 79)
        {
            System.out.printf("C: %,.2f",avg.getAverage());
        }
        else if (avg.getAverage() >= 60 || avg.getAverage() >= 69)
        {
            System.out.printf("D: %,.2f",avg.getAverage());
        }
        else if (avg.getAverage() >= 0 || avg.getAverage() >= 59)
        {
            System.out.printf("F: %,.2f",avg.getAverage());
        }

    }
}
