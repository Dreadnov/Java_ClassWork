import java.util.Scanner;

/**
 * Created by Matthew on 2/7/2017.
 */
public class ChTenEx4_Launcher
{
    public static void main(String[] args)
    {
        ChTenEx4 month1 = new ChTenEx4("Val");
        ChTenEx4 month2 = new ChTenEx4(0);
        ChTenEx4 month3 = new ChTenEx4("May");
        ChTenEx4 month4 = new ChTenEx4(4);
        ChTenEx4 month5 = new ChTenEx4(99);
        ChTenEx4 month6 = new ChTenEx4("April");

        System.out.print("The value of month one: " + month1);
        System.out.print("\nThe value of month Two: " + month2);
        System.out.print("\nThe value of month Three: " + month3);
        System.out.print("\nThe value of month Four: " + month4);
        System.out.print("\nThe value of month Five " + month5);
        System.out.print("\nThe value of month Six: " + month6);


    }
}
