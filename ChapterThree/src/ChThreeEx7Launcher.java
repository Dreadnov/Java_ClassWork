import java.util.Scanner;

/**
 * Created by Matthew on 1/23/2017.
 */
public class ChThreeEx7Launcher
{
    public static void main(String[] args)
    {
        ChThreeEx7 Manufactor = new ChThreeEx7();
        Scanner reader = new Scanner(System.in);

        //2 shifts = 16 hours
        Manufactor.setShiftPerDay(16);
        //current value that the workers make per hour
        Manufactor.setWedgPerHr(10);
        //multiples the  per hour  * by the amount they make
        Manufactor.setWedg(Manufactor.getShiftPerDay() * Manufactor.getWedgPerHr());


        System.out.print("Enter in the amount of widgets you need: ");
        Manufactor.setOrder(reader.nextInt());
        //displays the amount the user is ordering divided by the total amount  IE : getWedg
        System.out.print("The order will take: " + (Manufactor.getOrder() / Manufactor.getWedg()));





    }
}
