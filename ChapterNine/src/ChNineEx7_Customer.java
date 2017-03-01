/**
 * Created by Matthew on 2/24/2017.
 */
public class ChNineEx7_Customer extends ChNineEx7_Person
{
    //fields
    private int customerNumber;
    private boolean mailingList;

    //gets and sets the content for their respected fields
    public int getCustomerNumber()
    {
        return customerNumber;
    }
    public void setCustomerNumber(int customerNumber)
    {
        this.customerNumber = customerNumber;
    }
    public boolean isMailingList()
    {
        return mailingList;
    }
    public void setMailingList(boolean mailingList)
    {
        this.mailingList = mailingList;
    }

    //constructor that calls the supers constructor and enables the use of a the customerNumber and mailingList fields
    public ChNineEx7_Customer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList)
    {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }


}
