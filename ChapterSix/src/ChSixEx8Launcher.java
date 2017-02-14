import java.util.Scanner;

/**
 * Created by Matthew on 2/8/2017.
 */
public class ChSixEx8Launcher
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

        ChSixEx8_RetailItem item = new ChSixEx8_RetailItem(userInput,quantity,wholeSale,retail);
        ChSixEx8_CashReg dis = new ChSixEx8_CashReg(item,quantity);

        System.out.print(dis);
    }
}
