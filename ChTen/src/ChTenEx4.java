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


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ChTenEx4 chTenEx4 = (ChTenEx4) o;

        if (monthNumber != chTenEx4.monthNumber) return false;

        return true;
    }

}
