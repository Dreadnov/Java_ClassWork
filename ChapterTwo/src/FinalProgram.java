/**
 * Created by Matthew on 1/17/2017.
 */
public class FinalProgram
{
    public static void main(String[] args)
    {
        double purchased1,purchaseCost1,commission1,jill,total1,totCom1;

        purchased1 = 235;
        purchaseCost1 = 65.43;
        commission1 = 0.03;

        total1 = purchased1 * purchaseCost1;
        totCom1 = total1 * commission1;
        jill = (purchaseCost1 * purchased1) + commission1;

        double sold, perPhone,commission2,bill,total2,totCom2 ;

        sold = 167;
        perPhone = 124.56;
        commission2 = 0.06;

        total2 = sold * perPhone;
        totCom2 = total2 * commission2;
        bill = (sold * perPhone) + commission2;

        double commission3,calc;

        commission3 = 0.09;

        calc = (total2 - total2) - (totCom1 + totCom2) ;

        System.out.println((String.format("%,.2f\n%,.2f",calc,bill)));

    }
    //public void CellphonePurchaseProgram
}
