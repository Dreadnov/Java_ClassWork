import java.util.Scanner;

/**
 * Created by Matthew on 2/9/2017.
 */
public class ChSixEx9Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Description: ");
        String userInput = reader.next();
        System.out.print("Quantity: ");
        int quantity = reader.nextInt();
        System.out.print("Whole Sale: ");
        double wholeSale = reader.nextDouble();
        System.out.print("Retail: ");
        double retail = reader.nextDouble();

        ChSixEx9_RetailItem item = new ChSixEx9_RetailItem(userInput,quantity,wholeSale,retail);
        ChSixEx9_CashReg dis = new ChSixEx9_CashReg(item,quantity,wholeSale);

        System.out.print(dis);
        ChSixEx9_CashReg.Write();
    }
}
