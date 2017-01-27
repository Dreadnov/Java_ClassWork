
/**
 * Created by Matthew on 1/24/2017.
 */
public class ChFourEx1
{
   public static void RomanNum (int userImput)
   {
       String romanNumaral = "";
        /*
        switch that scans threw the current
        user input to the corresponding case statement
        */
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
        Displays the current switch statement that was selected
       */
   }


















    /*
    public void RomanNum()
    {
        if (userImput == 1)
        {
            System.out.print("I");
        }
        else if(userImput == 2)
        {
            System.out.print("II");
        }
        else if(userImput == 3)
        {
            System.out.print("III");
        }
        else if(userImput == 4)
        {
            System.out.print("IV");
        }
        else if(userImput == 5)
        {
            System.out.print("V");
        }
        else if(userImput == 6)
        {
            System.out.print("VI");
        }
        else if(userImput == 7)
        {
            System.out.print("VII");
        }
        else if(userImput == 8)
        {
            System.out.print("VIII");
        }
        else if(userImput == 9)
        {
            System.out.print("IX");
        }
        else if(userImput == 10)
        {
            System.out.print("X");
        }
        else if(userImput > 10)
        {
        System.out.print("The Current input is not valid.");
        }
        else if (userImput == 0)
        {
            System.out.print("The Current input is not valid.");
        }
    }
            */
}
