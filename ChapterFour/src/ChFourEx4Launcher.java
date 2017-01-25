import java.util.Scanner;

/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx4Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ChFourEx4 dis = new ChFourEx4();

        System.out.print("Enter in the amount that you are ordering: ");
        dis.setUserInput(reader.nextInt());

        dis.calc();
    }
}
