/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx5
{
    final double charge = 10;
    int checksUsed;
    double chekBal;
    double currentBalance, chargeBalance;
    final double extraCharge = 400;

    public double getCurrentBalance()
    {
        return currentBalance;
    }
    public void setCurrentBalance(double currentBalance)
    {
        this.currentBalance = currentBalance;
    }

    public double getCharge()
    {
        return charge;
    }
    public int getChecksUsed()
    {
        return checksUsed;
    }

    public void setChecksUsed(int checksUsed)
    {
        this.checksUsed = checksUsed;
    }
    public double getExtraCharge()
    {
        return extraCharge;
    }

    public double getChekBal(int i)
    {
        return chekBal;
    }
    public void setChekBal(double chekBal)
    {
        this.chekBal = chekBal;
    }

    public void clac()
    {
            if (checksUsed > 20)
            {
                chekBal = charge * .10;
                System.out.printf("The total bank fees this month is: $%,.2f", chargeBalance);
            }
            if (checksUsed >= 20 || checksUsed >= 39)
            {
                chekBal = charge * .08;
                System.out.printf("The total bank fees this month is: $%,.2f",chargeBalance);
            }
            if (checksUsed >= 40 || checksUsed <= 59)
            {
                chekBal = charge * .06;
                System.out.printf("The total bank fees this month is: $%,.2f",chargeBalance);
            }
            if (checksUsed >= 60)
            {
                chekBal = charge * .10;
                System.out.printf("The total bank fees this month is: $%,.2f",chargeBalance);
            }

    }


}
