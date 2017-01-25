import java.util.Scanner;
/**
 * Created by Matthew on 1/23/2017.
 */
public class ChThreeEx6Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        ChThreeEx6 Account = new ChThreeEx6();
        //asks the user and grabs the results
        System.out.print("Enter in your employee Id number please: ");
        Account.setIdNumber(reader.nextDouble());
        System.out.print("Please enter in your hourly pay rate :");
        Account.setHourlyPayRate(reader.nextDouble());
        System.out.print("Enter in the amount of time worked :");
        Account.setHoursWorked(reader.nextDouble());
        System.out.print("\n\n");
        //claculates the equation
        Account.setGrossPay(Account.getHoursWorked() * Account.getHourlyPayRate());

        //prints out the result for the user
        System.out.printf("Current Users ID: %.0f\nUsers Current pay Rate: %,.2f" +
                "\nUsers Current time on the job: %,.2f" +
                "\nUsers Current Gross Pay: %,.2f\n\n"
                ,Account.getIdNumber(),Account.getHourlyPayRate(),Account.getHoursWorked(),Account.getGrossPay());

    }
}
