import java.util.Scanner;

/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx5Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ChFourEx5 xin = new ChFourEx5();

        System.out.print("Enter in the current Balance: ");
        double bal = reader.nextDouble();
        System.out.print("Enter in the amount of checks used this month: ");
        ChFourEx5.clac(bal, reader.nextInt());





    }
}
