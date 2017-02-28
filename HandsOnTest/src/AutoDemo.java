/**
 * Created by Matthew on 2/27/2017.
 */
public class AutoDemo
{
    public static void main(String[] args)
    {
        Car dis = new Car();
        Car vin = new Toyota("Toyota");
        Car xin = new Chevy("Chevy");

       System.out.print(vin.moveVehicle() + "\n");
       System.out.print(xin.moveVehicle() + "\n");

        //System.out.print();
    }
}
