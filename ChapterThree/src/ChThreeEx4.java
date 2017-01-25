import java.util.Scanner;
/**
 * Created by Matthew on 1/20/2017.
 */
public class ChThreeEx4
{
   private double fahrenheit,celsius,kelvin;


    public double getFahrenheit()
    {
        return fahrenheit;
    }
    public void setFahrenheit(double fahrenheit)
    {
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius()
    {
        return celsius;
    }
    public void setCelsius(double celsius)
    {
        this.celsius = celsius;
    }

    public double getKelvin()
    {
        return kelvin;
    }
    public void setKelvin(double kelvin)
    {
        this.kelvin = kelvin;
    }


    public void ftemp()
    {
        Scanner reader = new Scanner(System.in);
        setFahrenheit(reader.nextDouble());

    }

    public double Cel()
    {
        celsius = (5.0/9.0) * (getFahrenheit() - 32.0);
        return celsius;
    }
    public double Kel()
    {
        kelvin =((5.0/9.0) * (getFahrenheit() - 32.0)) + 273.0;
        return kelvin;
    }

}
