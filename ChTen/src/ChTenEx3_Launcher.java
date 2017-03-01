/**
 * Created by Matthew on 1/20/2017.
 */
public class ChTenEx3_Launcher
{


    public static void main(String[] args)
    {
      ChTenEx3 Cloths = new ChTenEx3();
        int un1,un2,un3;
        double p1,p2,p3;




        System.out.println("Description\t\t\t\t\t" + "Units On Hand\t\t" + "Price");
        System.out.println("------------------------------------------------------------------");
        Cloths.setDescription("Item #1\t\tJacket\t\t\t\t%d\t\t\t%2.2f\n");
        Cloths.setUnitsOnHand(12);
        Cloths.setPrice(-59.95);
        System.out.printf(Cloths.getDescription(), Cloths.getUnitsOnHand(), Cloths.getPrice());

        Cloths.setDescription("Item #2\t\tDesigner Jeans\t\t\t%d\t\t\t%2.2f\n");
        Cloths.setUnitsOnHand(40);
        Cloths.setPrice(34.95);
        System.out.printf(Cloths.getDescription(), Cloths.getUnitsOnHand(), Cloths.getPrice());

        Cloths.setDescription("Item #3\t\tShirt\t\t\t\t%d\t\t\t%2.2f");
        Cloths.setUnitsOnHand(20);
        Cloths.setPrice(24.95);
        System.out.printf(Cloths.getDescription(), Cloths.getUnitsOnHand(), Cloths.getPrice());
    }




}
