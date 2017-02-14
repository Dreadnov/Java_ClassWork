/**
 * Created by Matthew on 2/7/2017.
 */
public class ChSixEx2Launcher
{


    public static void main(String[] args)
    {
        ChSixEx2 item1 = new ChSixEx2();
        item1.setDescription("Plushy");
        item1.setUnits(1);
        ChSixEx2 item2 = new ChSixEx2(item1);
        item2.setDescription("EDC_LasVegas");
        item2.setUnits(2);

        System.out.println(item1);
        System.out.println(item2);
    }
}
