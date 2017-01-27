import java.util.Scanner;

/**
 * Created by Matthew on 1/25/2017.
 */
public class ChFourEx6Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter in the weight of the package: ");
        int wei = reader.nextInt();
        System.out.print("Enter in the total miles shipped: ");
        ChFourEx6.ShippingCharge(wei, reader.nextInt());



    }
}
