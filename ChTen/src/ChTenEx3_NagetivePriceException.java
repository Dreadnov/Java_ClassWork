/**
 * Created by Matthew on 3/1/2017.
 */
public class ChTenEx3_NagetivePriceException extends Exception
{
    public ChTenEx3_NagetivePriceException()
    {
        super("Price must be a positive number");

    }
    public ChTenEx3_NagetivePriceException(String msg)
    {
        super(msg);
    }
}
