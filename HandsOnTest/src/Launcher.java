
/**
 * Created by Matthew on 1/30/2017.
 */
public class Launcher
{
    public static void main(String[] args)
    {

        Account Acc1 = new Account("\nJack\n","Reacher\n","511 Someewhere Blvdv\n","Someplace\n","Arkansas\n",23443,"\n541-985-6541",true,2343.45,"Check");
        Account Acc2 = new Account("\nLincoln\n","Rhyme\n","423 Falcon Ave","St.Louis\n","MO\n",63113,"\n314-256-5687",true,7542.45,"Save");
        Account Acc3 = new Account("\nRobert\n","Langdon\n","512 Omen Lane\n","Symbolic\n","NY\n",77777,"\n524-653-1245",false,23.14,"Invest");
        Account Acc4 = new Account("\nOdd\n","Thomas\n","3312 Bodachs Street\n","Pico Mundo\n","CA\n",59254,"\n826-333-7757",false,-123.14,"Match");

        System.out.print("*****Customer Info*****");
        System.out.print(Acc1.getFirstName());
        System.out.print(Acc1.getLastName());
        System.out.print(Acc1.getStreetAddress());
        System.out.print(Acc1.getCity());
        System.out.print(Acc1.getState());
        System.out.print(Acc1.getZip());
        System.out.print(Acc1.getPhoneNumber());
        System.out.print("\nPrefered Sustomer:" +Acc1.isPreferredCustomer());
        System.out.print("\nAccount Nnmber: "+Acc1.getAccountNumber());
        System.out.print("\nBalcnce:"+Acc1.getBalance());
        System.out.print("\nAccount Type: " +Acc1.getAccountType());
        System.out.print("\nNotes :"+Acc1.getAccountNotes());

        System.out.print("\n\n*****Customer Info*****");
        System.out.print(Acc2.getFirstName());
        System.out.print(Acc2.getLastName());
        System.out.print(Acc2.getStreetAddress());
        System.out.print(Acc2.getCity());
        System.out.print(Acc2.getState());
        System.out.print(Acc2.getZip());
        System.out.print(Acc2.getPhoneNumber());
        System.out.print("\nPrefered Customer:" +Acc2.isPreferredCustomer());
        System.out.print("\nAccount Nnmber: "+Acc2.getAccountNumber());
        System.out.print("\nBalcnce:"+Acc2.getBalance());
        System.out.print("\nAccount Type: " +Acc2.getAccountType());
        System.out.print("\nNotes :"+Acc2.getAccountNotes());

        System.out.print("\n\n*****Customer Info*****");
        System.out.print(Acc3.getFirstName());
        System.out.print(Acc3.getLastName());
        System.out.print(Acc3.getStreetAddress());
        System.out.print(Acc3.getCity());
        System.out.print(Acc3.getState());
        System.out.print(Acc3.getZip());
        System.out.print(Acc3.getPhoneNumber());
        System.out.print("\nPrefered Customer:" +Acc3.isPreferredCustomer());
        System.out.print("\nAccount Nnmber: "+Acc3.getAccountNumber());
        System.out.print("\nBalcnce:"+Acc3.getBalance());
        System.out.print("\nAccount Type: " +Acc3.getAccountType());
        System.out.print("\nNotes :"+Acc3.getAccountNotes());

        System.out.print("\n\n*****Customer Info*****");
        System.out.print(Acc4.getFirstName());
        System.out.print(Acc4.getLastName());
        System.out.print(Acc4.getStreetAddress());
        System.out.print(Acc4.getCity());
        System.out.print(Acc4.getState());
        System.out.print(Acc4.getZip());
        System.out.print(Acc4.getPhoneNumber());
        System.out.print("\nPrefered Customer:" +Acc4.isPreferredCustomer());
        System.out.print("\nAccount Nnmber: "+Acc4.getAccountNumber());
        System.out.print("\nBalcnce:"+Acc4.getBalance());
        System.out.print("\nAccount Type: " +Acc4.getAccountType());
        System.out.print("\nNotes :"+Acc4.getAccountNotes());



    }
}
