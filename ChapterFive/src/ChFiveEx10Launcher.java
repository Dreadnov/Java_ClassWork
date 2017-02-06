import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Matthew on 2/6/2017.
 */
public class ChFiveEx10Launcher
{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);//initiates the Scanner
        double initalBalance; //variable to hold the original balance
        double currentAnualIntrest; // holds the current annual interest
        int months;// months
        double deposit;//deposit
        double withdrawn;// withdrawn

        System.out.print("What is your starting balance :");
        initalBalance = keyboard.nextDouble();// sets the balance
        ChFiveEx10 bal = new ChFiveEx10(initalBalance);//pushes the balance to the constructor and initiates it

        System.out.print("What is the annual interest rate: ");
        currentAnualIntrest = keyboard.nextDouble();// sets the annual Interest Rate
        bal.setMonthlyIntrest(currentAnualIntrest);//passes the annual Interest to monthly interest

        System.out.print("How many months have passed since the account was created: ");
        months = keyboard.nextInt();// gets the number of months



        for(int i = 1; i <= months; ++i){// for loop runs the number of months the user entered
            System.out.print("How much was deposited in month " + i + ": ");
            deposit = keyboard.nextDouble();// sets deposit
            bal.deposit(deposit);// passes it to deposit method
            bal.setTotalDeposit(deposit);// passes deposit to the total deposit setter
            System.out.print("How much was withdrawn in month " + i + ": ");
            withdrawn = keyboard.nextDouble();//sets withdrawn
            bal.withdrawn(withdrawn); // passes it to the withdrawn method
            bal.setTotalWithdraw(withdrawn);// passes withdrawn to the total withdrawn setter
            bal.intrest();// gets the interest
        }

        DecimalFormat money = new DecimalFormat("$#,##0.00");//sets format for money
        DecimalFormat percent = new DecimalFormat("#0.00%");//sets format to percent
        System.out.println("The ending balance is: "+ money.format(bal.getBalance()));// displays the balance
        System.out.println("The total amount of deposits is: " + money.format(bal.getTotalDeposit()));//displays the total amount deposited
        System.out.println("The total amount of withdrawals is: " + money.format(bal.getTotalWithdraw()));//displays the total amount of withdraws
        System.out.println("Your monthly Interest rate is: " + percent.format(bal.getMonthlyIntrest()));//display the monthly interest rate
        System.out.println("The total amount of interest earned is: " + money.format(bal.getTotalIntrest()));// displays the total mount of money earned from interest
    }
}

