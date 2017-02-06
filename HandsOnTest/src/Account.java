import java.util.Random;

/**
 * Created by Matthew on 1/30/2017.
 */
import java.util.Random;
public class Account
{

    private double balance;
    private int accountNumber;
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String city;
    private String state;
    private String phoneNumber;
    private String accountType;
    String accountNotes;
    private int zip;
    boolean preferredCustomer;




    public Account( String firstName, String lastName, String streetAddress, String city, String state, int zip,String phoneNumber, boolean preferredCustomer ,double balance, String accountType)
    {
        this.balance = balance;
        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.phoneNumber = phoneNumber;
        this.accountType = accountType;
        this.accountNotes = "none";
        this.preferredCustomer = preferredCustomer;
        this.zip = zip;
    }
        public double getBalance()
        {
            if (balance < 0)
            {
                negativeBalanceLetter();
            }
            return balance;
        }
        public void setBalance(double balance)
        {
            this.balance = balance;
        }

        public int getAccountNumber()
        {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber)
        {
        Random ran = new Random();

        accountNumber = ran.nextInt(1000000000) + 30;

        this.accountNumber = accountNumber;
    }

        public String getFirstName()
        {
            return firstName;
        }
        public void setFirstName(String firstName)
        {
            this.firstName = firstName;
        }

        public String getLastName()
        {
            return lastName;
        }
        public void setLastName(String lastName)
        {
            this.lastName = lastName;
        }

        public String getStreetAddress()
        {
            return streetAddress;
        }
        public void setStreetAddress(String streetAddress)
        {
            this.streetAddress = streetAddress;
        }

        public String getCity()
        {
            return city;
        }
        public void setCity(String city)
        {
            this.city = city;
        }

        public String getState()
        {
            return state;
        }
        public void setState(String state)
        {
            this.state = state;
        }

        public String getPhoneNumber()
        {




            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber)
        {
            this.phoneNumber = phoneNumber;
        }

        public String getAccountType()
        {
            return accountType;
        }
        public void setAccountType(String accountType)
        {

            this.accountType = accountType;
        }

        public String getAccountNotes()
        {
            return accountNotes;
        }
        public void setAccountNotes(String accountNotes)
        {
            this.accountNotes = accountNotes;
        }

        public int getZip()
        {
            return zip;
        }
        public void setZip(int zip)
        {
            this.zip = zip;
        }

        public boolean isPreferredCustomer()
        {
            return preferredCustomer;
        }
        public void setPreferredCustomer(boolean preferredCustomer)
        {
            this.preferredCustomer = preferredCustomer;
        }

        boolean peferredCustomer;


    private void negativeBalanceLetter()
    {
        accountNotes = "Negative balance letter has been sent";
    }



}
