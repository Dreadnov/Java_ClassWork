import java.util.Scanner;
/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx1Launcher
{

    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Enter in a number 1-10: ");

        int userImput = reader.nextInt();
        String romanNumaral = "";
        switch (userImput)
        {
            case 1:
                romanNumaral = "I";
                break;
            case 2:
                romanNumaral = "II";
                break;
            case 3:
                romanNumaral = "III";
                break;
            case 4:
                romanNumaral = "IV";
                break;
            case 5:
                romanNumaral = "V";
                break;
            case 6:
                romanNumaral = "VI";
                break;
            case 7:
                romanNumaral = "VII";
                break;
            case 8:
                romanNumaral = "VIII";
                break;
            case 9:
                romanNumaral = "IX";
                break;
            case 10:
                romanNumaral = "X";
        }
        System.out.println(romanNumaral);








        /*
        ChFourEx1 Rom = new ChFourEx1();

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter in a number 1-10: ");
        Rom.setUserImput(reader.nextInt());

        Rom.RomanNum();
        */
    }

}
