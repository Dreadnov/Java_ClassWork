/**
 * Created by Matthew on 1/12/2017.
 */
public class StockCommission
{
    public static void main(String[] args)
    {
        double kat,productPrice,brokerCom,totalSharesAmount,totalWithBrok,totalPrice;

        kat = 1000;
        productPrice = 25.50;
        brokerCom = 0.02;

        totalSharesAmount = kat * productPrice ;
        totalWithBrok = totalSharesAmount * brokerCom;
        totalPrice = (kat * productPrice) + (kat * productPrice) * brokerCom;

        System.out.println(String.format("Amount Paid: $%,.2f", totalSharesAmount));
        System.out.println(String.format("Broker Contribution: $%,.2f", totalWithBrok));
        System.out.println(String.format("Total Amount: $%,.2f", totalPrice ));




    }
}
