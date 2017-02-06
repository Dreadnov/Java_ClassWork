/**
 * Created by Matthew on 1/11/2017.
 */
public class Vin
{


    int num1,num2,num3;
    boolean xin;
    int result;

    Vin(int num1, int num2, int num3)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num3 = num3;
        result  = num1 + num2 + num3;
        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + result );
    }

    Vin(boolean xin)
    {
        if (xin == true) {
            System.out.println("This text only displays when the user is tired. so currently the USER == Tired (TRUE)");
        }
         if (xin == false) {
            System.out.println("This only displays if the need to show that a FALSE value needs to be displayed in the current problem.(False)");
        }
    }
}
