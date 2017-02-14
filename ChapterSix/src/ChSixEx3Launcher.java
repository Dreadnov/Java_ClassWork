import java.util.Scanner;

/**
 * Created by Matthew on 2/7/2017.
 */
public class ChSixEx3Launcher
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter in room length ");
        double  length = Double.parseDouble(reader.nextLine());
        System.out.print("Enter in room width ");
        double  width = Double.parseDouble(reader.nextLine());
        ChSixEx3_2 dis = new ChSixEx3_2(length,width);

        System.out.print("Enter in the cost per square foot: ");
        double cpsf = Double.parseDouble(reader.nextLine());
        ChSixEx3 roomCarpet = new ChSixEx3(dis, cpsf);
        System.out.print(roomCarpet);
    }
}
