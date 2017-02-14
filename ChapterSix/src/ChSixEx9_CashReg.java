import java.io.PrintWriter;

/**
 * Created by Matthew on 2/9/2017.
 */
public class ChSixEx9_CashReg
{
    static ChSixEx9_RetailItem item;
    static int num;
    static double WholeSa;

    public static double getWholeSa()
    {
        return WholeSa;
    }
    public void setgWhole(double gWhole)
    {
        this.WholeSa = gWhole;
    }

    public static ChSixEx9_RetailItem getItem()
    {
        return item;
    }
    public void setItem(ChSixEx9_RetailItem item)
    {
        this.item = item;
    }

    public static int getNum()
    {
        return num;
    }
    public void setNum(int num)
    {
        this.num = num;
    }

    public static double getSubTotal()
    {
        return getItem().getRetail() * getNum();
    }
    public static double getTax()
    {
        return getSubTotal() * 0.06;
    }
    public static double getTotal()
    {
        return getSubTotal() + getTax();
    }

    public ChSixEx9_CashReg(ChSixEx9_RetailItem Item, int num, double WholeS)
    {
        this.setNum(num);
        this.setItem(Item);
        this.setgWhole(WholeS);

    }

    public static void Write()// opens notepad.exe and then writes the outcome into the
    {
        try{
            PrintWriter outputFile = new PrintWriter("C:\\Users\\Matthew\\Downloads\\ChSixEx9_CashReg.txt");// goes to the file directory and prints
            outputFile.println("SALES RECEIPT");
            outputFile.println("Unit Price: " + String.format("$%,.2f", getWholeSa()));
            outputFile.println("Quantity: " +  getNum());
            outputFile.println("Sub Total: " + String.format("$%,.2f", getSubTotal()));
            outputFile.println("Sales Tax: " + String.format("$%,.2f", getTax()));
            outputFile.println("Total: " + String.format("$%,.2f", getTotal()));

            ProcessBuilder pb = new ProcessBuilder("notepad.exe", "C:\\Users\\Matthew\\Downloads\\ChSixEx9_CashReg.txt");
            pb.start();
            outputFile.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @Override public  String toString()
    {
        String str;

        str =
                "\nSubTotal: " + String.format("$%,.2f", getSubTotal()) +
                        "\nSales Tax: " + String.format("$%,.2f", getTax()) +
                        "\nTotal: " + String.format("$%,.2f",getTotal()) ;
        return str;
    }
}
