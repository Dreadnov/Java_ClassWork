import java.util.Scanner;

/**
 * Created by Matthew on 2/7/2017.
 */
public class ChSixEx5Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter in the number of the month you wish to see: ");
        int userInput = Integer.parseInt(reader.nextLine());
        ChSixEx5 dis = new ChSixEx5(userInput);

        System.out.print("Month: " + dis);
    }
}
