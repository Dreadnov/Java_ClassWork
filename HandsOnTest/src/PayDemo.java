/**
 * Created by Matthew on 2/27/2017.
 */
public class PayDemo
{


    public static void main(String[] args)
    {
        Pay dis = new Pay();
        double[] employeeWages = {17.25,40.75,15.0,12.0,20.65,25.50,13.5};
        String[] employeeName = {"    Joe","\t    Jill","\t    Jack","\t    Jessica","   James","    Jenn","       Jim"};
        dis.employeeRaise(employeeWages);
        double[][] company = {{153354.00,453213.80,743234.75,475985.12},
                              {546124.23,521124.33,854154.23,546124.22},
                              {537124.23,224527.13,200253.64,765200.52}};

        for (String val : employeeName)
        {
            System.out.print("" + val);
        }
        System.out.print("\n");

        for (double vin : employeeWages)
        {
            System.out.print("  ");
            System.out.print(String.format("  $%,.2f", vin));
        }




    }

}
