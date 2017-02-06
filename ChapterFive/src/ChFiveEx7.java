import java.util.Scanner;

/**
 * Created by Matthew on 2/2/2017.
 */
public class ChFiveEx7
{
    int years; // years
    double avgRainfall; // average rainfall for the years
    double totalRainfall = 0; //total accumulated rainfall
    final double totalMonths = 12; // set number of months
    double rainFall; // rain fall
    int accMonths = 0; // will get the total amount of rainfall

    public double getAvgRainfall()
    {
        return avgRainfall = totalRainfall / (totalMonths * years);
    }
    public void setAvgRainfall(double avgRainfall)
    {
        this.avgRainfall = avgRainfall;
    }
    public int getAccMonths()
    {
        return accMonths = (int) (years * totalMonths);
    }
    public void setAccMonths(int accMonths)
    {
        this.accMonths = accMonths;
    }
    public double getTotalRainfall()
    {
        return totalRainfall;
    }
    public void setTotalRainfall(double totalRainfall)
    {
        this.totalRainfall = totalRainfall;
    }
    public int getYears()
    {
        return years;
    }
    public void setYears(int years)
    {
        this.years = years;
    }

    public  void Month()
    {
        Scanner reader = new Scanner(System.in);// enables the scanner
        for (int i = 1; i <= years ; i++)
        {
            int j ;
            System.out.print("Year: " + i + "\n");
            do
            {
                for ( j = 1; j <= totalMonths; j++)
                {
                    System.out.print("Month " + j + ":");
                    rainFall = reader.nextDouble();
                    if (rainFall <= -1)
                    {
                        System.out.print("Month " + j + ":");
                        rainFall = reader.nextDouble();
                    }
                    else
                    {continue;}
                    totalRainfall += rainFall;
                    accMonths += totalMonths;
                }
            }
            while (j == 12);
        }
    }
}
