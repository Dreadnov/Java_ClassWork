/**
 * Created by Matthew on 2/7/2017.
 */
public class ChSixEx5
{
    enum eMonths {filler, January, February, March, April, May, June, July, August, September, October, November, December}
    int monthNumber ;

    public String getMonthName()
    {
       return eMonths.values()[this.monthNumber].name();
    }

    public int getMonthNumber()
    {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber)
    {
        this.monthNumber = monthNumber;

    }

    ChSixEx5()
    {
        this.monthNumber = 1;
    }

    ChSixEx5(int monthNumber)
    {
        if (monthNumber < 1 || monthNumber > 12)
        {
            setMonthNumber(1);
        }
        else
        {
          this.monthNumber = monthNumber;
        }
    }
    public int ChSixEx5(String month)
    {

        switch (monthNumber)
        {
            case 1 :
                monthNumber = Integer.parseInt("January");
                break;
            case 2 :
                monthNumber = Integer.parseInt("February");
                break;
            case 4 :
                monthNumber = Integer.parseInt("March");
                break;
            case 5 :
                monthNumber = Integer.parseInt("April");
                break;
            case 6 :
                monthNumber = Integer.parseInt("May");
                break;
            case 7 :
                monthNumber = Integer.parseInt("June");
                break;
            case 8 :
                monthNumber = Integer.parseInt("July");
                break;
            case 9 :
                monthNumber = Integer.parseInt("August");
                break;
            case 10 :
                monthNumber = Integer.parseInt("September");
                break;
            case 11 :
                monthNumber = Integer.parseInt("October");
                break;
            case 12 :
                monthNumber = Integer.parseInt("December");
                break;
        }

        return monthNumber;
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChSixEx5 chSixEx5 = (ChSixEx5) o;

        if (monthNumber != chSixEx5.monthNumber) return false;

        return true;
    }

    @Override
    public String toString()
    {
       return "Current Month: " +  this.getMonthName();
    }
}
