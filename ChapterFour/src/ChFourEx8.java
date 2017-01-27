import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by Matthew on 1/25/2017.
 */
public class ChFourEx8 implements Comparable<ChFourEx8>
{
    String name;
    int time;

    public ChFourEx8(String Name, int Time)
    {
        this.name = Name;
        this.time = Time;

    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public int getTime()
    {
        return time;
    }
    public void setTime(int time)
    {
        this.time = time;
    }

    public static void recivRunner()
    {
        ChFourEx8[] runner = genRunner();
        Arrays.sort(runner) ;
        System.out.print("1st: " + runner[0].name +
                         "\n2nd: " + runner[1].name +
                         "\n3rd: " + runner[2].name);
    }
    private static ChFourEx8[] genRunner()
    {    Scanner reaedr = new Scanner(System.in);
         ChFourEx8[] Dis = new ChFourEx8[3];
        for (int i = 0; i < 3 ; i++)
        {
            System.out.print("Enter in the user and time: ");
            Dis[i] = new ChFourEx8(reaedr.nextLine(),
                    Integer.parseInt(reaedr.nextLine()));
        }
        return Dis;
    }

    @Override
    public int compareTo(ChFourEx8 runner){
        return this.time - runner.time;
    }
}
