import java.util.Scanner;

/**
 * Created by Matthew on 2/8/2017.
 */
public class ChSixEx6Launcher
{
    public static void main(String[] args)
    {

        ChSixEx6 dis = new ChSixEx6();
        dis.setName("Matthew");
        dis.setIdNumber(47899);
        dis.setDepartment("IT");
        dis.setPosition("Entry");

        ChSixEx6 vin = new ChSixEx6();
        vin.setName("Alek");
        vin.setDepartment("IT");


        System.out.print(dis);
        System.out.print(vin);
    }
}
