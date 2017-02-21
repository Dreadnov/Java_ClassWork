import java.util.Scanner;

/**
 * Created by Matthew on 2/17/2017.
 */
public class ChSevenEx6_DriversLicense_Launcher
{

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        int[] arr = new int[20];
        String answerChoice;
        String[] usersChoice = {"","","","","","","","","","","","","","","","","","","","",""};

        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter in the choice for #" + (i + 1 ) + ":");
            answerChoice = reader.next();
            while (!"A".equals(answerChoice) &&!"B".equals(answerChoice) &&!"C".equals(answerChoice) && !"D".equals(answerChoice))
            {
                System.out.print("Enter in the choice for #" + (i + 1 ) + ":");
                answerChoice = reader.next();
            }
            usersChoice[i] = answerChoice;




        }
        ChSevenEx6_DriversLicense dis = new ChSevenEx6_DriversLicense(usersChoice);
    }
}
