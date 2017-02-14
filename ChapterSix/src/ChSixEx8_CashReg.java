/**
 * Created by Matthew on 2/8/2017.
 */
public class ChSixEx8_CashReg
{
    ChSixEx8_RetailItem item;
    int num;

    public ChSixEx8_RetailItem getItem()
    {
        return item;
    }
    public void setItem(ChSixEx8_RetailItem item)
    {
        this.item = item;
    }

    public int getNum()
    {
        return num;
    }
    public void setNum(int num)
    {
        this.num = num;
    }


    public double getSubTotal()
    {
      return this.getItem().getRetail() * this.getNum();
    }
    public double getTax()
    {
        return this.getSubTotal() * 0.06;
    }
    public  double getTotal()
    {
        return getSubTotal() + getTax();
    }

    public ChSixEx8_CashReg(ChSixEx8_RetailItem Item, int num)
    {
        this.setNum(num);
        this.setItem(Item);

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
