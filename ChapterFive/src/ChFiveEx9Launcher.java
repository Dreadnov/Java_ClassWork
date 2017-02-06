/**
 * Created by Matthew on 2/6/2017.
 */
import java.util.Scanner;

public class ChFiveEx9Launcher
{

    public static void main(String[] args) {
        int userInputInt = -1; // for user input
        double userInputDouble = -1.0; // for user input
        double grossPayTotal = 0; //total gross pay
        double stateTaxTotal = 0;// total state tax
        double federalTaxTotal = 0;//total federal tax
        double ficaTotal = 0;// total Fica
        double netPayTotal = 0;// total net pay

        Scanner keyboard = new Scanner(System.in);//instantiate a scanner object for reading input
        ChFiveEx9 report = new ChFiveEx9();//instantiate a payroll report object

        while(userInputInt != 0){
            while(userInputInt < 0){
                userInputInt = -1;//reset userInputInt
                System.out.println("enter an employee number: ");//ask user for employee number and store it in a variable
                userInputInt = keyboard.nextInt();
                report.setEmployeeNum(userInputInt);//set the employee number
                if(userInputInt < 0){
                    System.out.println("please enter a greater number than 0\n");//display a friendly message to the user
                }//end if
            }//end while
            if(userInputInt == 0){
                break;
            }

            userInputInt = -1;//reset userInput int
            userInputDouble = -1.0;//reset userInput Double
            if(userInputInt != 0){
                while(userInputDouble < 0){
                    userInputDouble = -1.0;//reset userInput double
                    System.out.println("enter the gross pay: ");//ask user for gross pay and store it in a variable
                    userInputDouble = keyboard.nextDouble();
                    report.setGrossPay(userInputDouble);//set the gross pay
                    grossPayTotal += report.getGrossPay();//get the gross pay and increment
                    if(userInputDouble < 0){
                        System.out.println("please enter a greater number than 0\n");//display a friendly message to the user
                    }//End if
                }//End while

                userInputDouble = -1.0;//Reset userInputDouble
                while(userInputDouble < 0 || userInputDouble > report.getGrossPay())
                    userInputDouble = -1.0;//Reset userInputDouble
                System.out.println("enter the state tax: ");//ask user for state tax
                userInputDouble = keyboard.nextDouble();
                report.setStateTax(userInputDouble);//set state tax
                stateTaxTotal += report.getStateTax();//get the state tax and increment
                if(userInputDouble < 0){
                    System.out.println("please enter a greater number than 0\n");//display a friendly message to the user
                    if(userInputDouble > report.getGrossPay()){//end if
                        System.out.println("your state tax should not be greater than your gross pay");//display a friendly message to the user
                    }//end if
                }//end while
            }

            userInputDouble = -1.0;//Reset userInputDouble
            while(userInputDouble < 0 || userInputDouble > report.getGrossPay())
                userInputDouble = -1.0;//Reset userInputDouble
            System.out.println("enter the federal tax: ");//ask user for federal tax
            userInputDouble = keyboard.nextDouble();
            report.setFederalTax(userInputDouble);//set federal tax
            federalTaxTotal += report.getFederalTax();//get the federal tax amount
            if(userInputDouble < 0){
                System.out.println("Please enter a number greater than 0\n");//display a friendly message
            }//end if
            if(userInputDouble > report.getFederalTax()){//display friendly message to the user
                System.out.println("your federal tax should not be greater than your gross pay");
            }//end if
        }//end while
        userInputDouble = -1.0;//Reset userInputDouble
        while(userInputDouble < 0 || userInputDouble > report.getGrossPay())
            userInputDouble = -1.0;//Reset userInputDouble
        System.out.println("enter the FICA with holdings: ");//ask user for Fica with holdings
        userInputDouble = keyboard.nextDouble();
        report.setFica(userInputDouble);//set Fica
        ficaTotal += report.getFica();//get fica
        if(userInputDouble < 0){
            System.out.println("Please enter a number greater than 0\n");//display a friendly message
        }//end if
        if(userInputDouble > report.getFica()){
            System.out.println("your FICA should not be greater than your gross pay");//display friendly message to the user
        }//end if
        netPayTotal += report.getNetPay();//get the net pay
        if((report.getStateTax() + report.getFederalTax() + report.getFica()) > report.getGrossPay());
        System.out.println("your taxes should not be greater than the gross pay\n");//Display a friendly message to user

        grossPayTotal -= report.getGrossPay();
        stateTaxTotal -= report.getStateTax();
        federalTaxTotal -= report.getFederalTax();
        netPayTotal -= report.getNetPay();
        report.printEmployeeReport();

        if(report.getEmployeeNum() == 0){report.printTotals(grossPayTotal, stateTaxTotal, federalTaxTotal,ficaTotal, netPayTotal);
        }
    }
}


