import java.util.Scanner;

/**
 * Created by Matthew on 2/14/2017.
 */
public class ChSevenEx1_RainFall_Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        //ChSevenEx1_RainFall dis = new ChSevenEx1_RainFall();

        System.out.print("Enter in the amount of rain for the following months\n\n");



        ChSevenEx1_RainFall.genUserInput();
        ChSevenEx1_RainFall.getHighestMonth();
        ChSevenEx1_RainFall.getLowestMonth();
        ChSevenEx1_RainFall.getOutPut();
    }
}
