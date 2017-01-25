/**
 * Created by Matthew on 1/20/2017.
 */
public class ChThreeEx4Launcher
{
    public static void main(String[] args)
    {
        ChThreeEx4 Dis = new ChThreeEx4();
        System.out.println("Enter in the current fahrenheit to be converted: ");
        Dis.ftemp();

        System.out.printf("Celsius conversion: %,.2f" + "\n" ,Dis.Cel());
        System.out.printf("Kelvin conversion: %,.2f", Dis.Kel());
    }
}
