/**
 * Created by Matthew on 2/24/2017.
 */
public class ChNineEx8_PreferredCustomer extends ChNineEx7_Customer
{
    private double customerSpent;
    private double discountPercent;


    public ChNineEx8_PreferredCustomer(String name, String address, String phoneNumber, int customerNumber, boolean mailingList, double customerSpent)
    {
        super(name, address, phoneNumber, customerNumber, mailingList);
        this.customerSpent = customerSpent;
        setCustomerSpent(customerSpent);
    }
    public double getDiscountPercent()
    {
        return discountPercent;
    }
    public void setDiscountPercent(double discountPercent)
    {
        this.discountPercent = discountPercent;
    }

    public double getCustomerSpent()
    {
        return customerSpent;
    }

    public void setCustomerSpent(double customerSpent)
    {
        this.customerSpent = customerSpent;
        if (customerSpent <= 500) {setDiscountPercent(5);}
        else if (customerSpent <= 1000){setDiscountPercent(6);}
        else if (customerSpent <= 1500){setDiscountPercent(7);}
        else if (customerSpent< 2000){setDiscountPercent(10);}
    }



    @Override
    public String toString()
    {
        return "Name: " + getName() +
                "\nAddress: " + getAddress() +
                "\nPhone Number: " + getPhoneNumber() +
                "\nCustomer Number: " + getCustomerNumber() +
                "\nMailing List: " +  isMailingList() +
                "\nTotal Customer spent: " + getCustomerSpent() +
                "\nDiscount Percent: " + String.format("%,.0f%%", getDiscountPercent());

    }
}
