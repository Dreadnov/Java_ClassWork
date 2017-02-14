import java.util.Scanner;

/**
 * Created by Matthew on 2/13/2017.
 */
public class SalesLauncher
{
    public static void main(String[] args)
    {
        double userInput;
        double total = 0;
        Sales dis = new Sales();
        Scanner reader = new Scanner(System.in);
        for (int i = 1; i <= 5; i++)
        {
            System.out.print("Enter the amount of sales for the company in the last 5 days: ");
            userInput = reader.nextDouble();

            while (userInput < 0)
            {

                System.out.print("Enter in a positive number: ");
                userInput = reader.nextDouble();


            }

            total += userInput;
            dis.setDay(i);
            dis.setTotal(total);

        }
        System.out.print("The current total is :" + String.format("$%,.2f", dis.getTotal()));

        Sales.Write();
    }
}
