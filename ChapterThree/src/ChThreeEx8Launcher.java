/**
 * Created by Matthew on 1/23/2017.
 */
public class ChThreeEx8Launcher
{
    public static void main(String[] args)
    {
        ChThreeEx8 avg = new ChThreeEx8();

        //This will hold the outcomes of yInfo
        ChThreeEx8[] calc = new ChThreeEx8[3];

        //grabs the yInfo method and repeats it 3 times
        for (int i = 0; i < calc.length ; i++)
        {
            calc[i] = new ChThreeEx8();
            calc[i].yInfo();
        }
        //grabs the 3 entered test scored and averages them by the amount of test scores there are
        avg.setAverage((calc[0].getTestScore() + calc[1].getTestScore() + calc[2].getTestScore())/3);
        //displays the final outcome
        System.out.printf("The current test average is: %.2f",avg.getAverage());

    }
}
