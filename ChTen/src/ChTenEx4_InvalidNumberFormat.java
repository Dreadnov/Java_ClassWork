/**
 * Created by Matthew on 3/1/2017.
 */
public class ChTenEx4_InvalidNumberFormat extends Exception
{
    public ChTenEx4_InvalidNumberFormat()
    {
        super("Invalid Month Number");
    }
    public ChTenEx4_InvalidNumberFormat(String msg)
    {
        super(msg);
    }
}
