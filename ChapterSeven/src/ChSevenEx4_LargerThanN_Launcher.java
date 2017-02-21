import java.util.Scanner;

/**
 * Created by Matthew on 2/16/2017.
 */
public class ChSevenEx4_LargerThanN_Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter in  a number: ");
        ChSevenEx4_LargerThanN.setN(reader.nextInt());
        ChSevenEx4_LargerThanN.inc();
    }
}
