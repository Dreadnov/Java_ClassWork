/**
 * Created by Matthew on 1/18/2017.
 */

public class GoldTransaction_ChOne_ChTwo
{

    public static void main(String[] args)
    {

        final int NUM_BARS;
        final double PURCHASE_PRICE,SELLING_PRICE,BROKER_COMM_RATE;
        double goldPurchase,purchaseComm,amountPaid,stockSale,sellingComm,amountRecived,profitOrLoss;

        //set values for initial purchase
        NUM_BARS = 567;
        PURCHASE_PRICE = 11562;
        SELLING_PRICE = 13243;
        BROKER_COMM_RATE = 0.03;

        //Amount he paid for
        goldPurchase = PURCHASE_PRICE * NUM_BARS;
        //commission from broker
        purchaseComm = goldPurchase * BROKER_COMM_RATE;
        //Amount he paid + the broker
        amountPaid = goldPurchase + purchaseComm;
        //amount sold
        stockSale = SELLING_PRICE * NUM_BARS;
        //the commission form the sale
        sellingComm = stockSale * BROKER_COMM_RATE;
        //total
        amountRecived = stockSale - sellingComm ;

        profitOrLoss = (stockSale - goldPurchase) - (purchaseComm + sellingComm) ;

        System.out.printf("Jack paid $%,.2f for the gold.\n", goldPurchase);
        System.out.printf("Jack paid his broker a commission of $%,.2f on the purchase.\n",purchaseComm);
        System.out.printf("So, Jack paid a total of $%,.2f\n\n",amountPaid);
        System.out.printf("Jack  sold the gold for $%,.2f\n", stockSale);
        System.out.printf("Jack paid the broker a commission of $%,.2f on the sale.\n", sellingComm);
        System.out.printf("So jack received a total of $%,.2f\n\n", amountRecived);
        System.out.printf("Jack's profit or loss: $%,.2f\n",profitOrLoss);


    }


}
