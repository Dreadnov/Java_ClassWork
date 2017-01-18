/**
 * Created by Matthew on 1/12/2017.
 */
public class StockTransactionProgram
{
    public static void main(String[] args)
    {
        double joe,joeP,stockPaid,stockS,commission,paid,sold,calc,com1,com2;

        joe = 1000;
        paid = 32.87;
        sold = 33.92;
        commission = 0.02;

        //sum without commission
        joeP = joe * paid;
        stockS = joe * sold;

        //sum with commission


        com1 = joeP * commission;
        com2 = stockS * commission;

        stockPaid =  (paid * joe) + com1;
        sold = (joe * sold) * com2;

        calc =  (stockS - joeP  ) - (com1 + com2)    ;


        System.out.println(stockPaid);
        System.out.println(sold);

        System.out.println(String.format("Joe Paid: %,.2f",joeP));
        System.out.println(String.format("Joe paid in commission: %,.2f",stockPaid));
        System.out.println(String.format("Joe sold the stock for: %,.2f ",stockS));
        System.out.println(String.format("Joe paid in commission when selling: %,.2f", sold));
        System.out.println(String.format("Joe lost to the brokers: %,.2f",calc));

    }
}
