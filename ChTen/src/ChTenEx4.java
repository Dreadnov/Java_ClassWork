import org.apache.commons.lang3.EnumUtils;
/**
 * Created by Matthew on 2/7/2017.
 */
public class ChTenEx4
{
    enum eMonths {filler, January, February, March, April, May, June, July, August, September, October, November, December}
    int monthNumber ;


    public int getMonthNumber()
    {
        return monthNumber;
    }
    public void setMonthNumber(int monthNumber)
    {
        this.monthNumber = monthNumber;
    }

    ChTenEx4(String mName)
    {
        this.setMonthNumber(1);
        for (int i = 0; i < eMonths.values().length; i++)
        {
            if (mName.equalsIgnoreCase(eMonths.values()[i].name())) this.setMonthNumber(eMonths.values()[i].ordinal());
        }
        try
        {
            if (!EnumUtils.isValidEnum(eMonths.class, mName))
            {
                throw new ChTenEx4_InvalidString();
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    ChTenEx4(int monthNumber)
    {
        if (monthNumber < 1 || monthNumber > 12)
        {
            setMonthNumber(1);
        }
        else {this.monthNumber = monthNumber;}
        try
        {
            if (monthNumber < 1 || monthNumber > 12)
            {
                throw new ChTenEx4_InvalidNumberFormat();
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public int ChTenEx4(String month)
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

        ChTenEx4 chTenEx4 = (ChTenEx4) o;

        if (monthNumber != chTenEx4.monthNumber) return false;

        return true;
    }

    @Override
    public String toString()
    {
        return "ChTenEx4{" +
                "monthNumber=" + monthNumber +
                '}';
    }
}
