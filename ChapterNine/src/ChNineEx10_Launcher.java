/**
 * Created by Matthew on 2/28/2017.
 */
public class ChNineEx10_Launcher
{
    public static void main(String[] args)
    {
        //sets the objects to their specified fields based on the constructor in the corresponding
        ChNineEx10_Ship zzn = new ChNineEx10_Ship("[Ship]","[Ship Created]");
        ChNineEx10_Ship xin = new ChNineEx10_CargoShip("Vin's Cargo","",15);
        ChNineEx10_Ship zin = new ChNineEx10_CruiseShip("S.S.Vin","",100);
        ChNineEx10_Ship[] dis = {zzn,xin,zin};

        //enhanced for loop that displays the objects toStrings
       for (ChNineEx10_Ship s : dis)
       {
           System.out.println(s);
       }



    }
}
