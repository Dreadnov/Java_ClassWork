import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Matthew on 2/17/2017.
 */
public class ChSevenEx10_LotteryApplication_Launcher
{
    static Scanner reader = new Scanner(System.in);
    static Random random = new Random();
    //fields
    int[] keyArr = new int[5];
    List<Integer> matchArr = new ArrayList<Integer>();

    public void run()
    {
        int[] guessArr = new int[5];
        for (int i = 0; i < 5; i++)
        {
            guessArr[i] = queryGuess(i);
        }
        System.out.println("**************************");
        System.out.println("Numbers of digests tha match: " + calcMatch(guessArr));
        if (calcMatch(guessArr) == 5) System.out.println("Grand prize Winner!");
    }
    //constructor
     ChSevenEx10_LotteryApplication_Launcher()
    {
        for (int i = 0; i < 5 ; i++)
        {
          keyArr[i] = random.nextInt(10);
        }
    }

    //methods
    private static int queryGuess(int index)
    {
       System.out.print("Guess" + (index + 1) + " :");
        return Integer.parseInt( reader.nextLine());
    }

    private int calcMatch(int[] guessArr)
    {
        for (int i = 0; i < 5; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if ( guessArr[i] == keyArr[j])
                {
                    matchArr.add(guessArr[i]);
                }
            }
        }
        return matchArr.size();
    }
    private int[] retrieveKey()
    {
        int[] tempArr = new int [5];
        for (int i = 0; i < 5; i++)
        {
            tempArr[i] = keyArr[i];
        }
        return tempArr;
    }
}
