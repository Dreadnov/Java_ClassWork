import java.util.Scanner;

/**
 * Created by Matthew on 2/22/2017.
 */
public class ChNineEx1_Launcher
{
    public static void main(String[] args)
    {

        //specified objects based on the classes constructor
        ChNineEx1_ProductionWorker  worker1 = new ChNineEx1_ProductionWorker("Leo","482-E","12/11/1996",1,9.4);
        ChNineEx1_ProductionWorker  worker2 = new ChNineEx1_ProductionWorker("Vinnie","100-G","01/09/2020",2,7.7);
        ChNineEx2_ShiftSupervisor  worker3 = new ChNineEx2_ShiftSupervisor("Zed","420-M","11/10/1915",9855.70,210.40);
        ChNineEx3_TeamLeader teamLeader = new ChNineEx3_TeamLeader("Lennie","901-F","06/04/2000",1,15.0,190.50,15,10);


        //displays the outcome
        System.out.print(worker1);
        System.out.print(worker2);
        System.out.print(worker3);
        System.out.print(teamLeader);







    }
}
