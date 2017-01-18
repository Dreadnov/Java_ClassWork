/**
 * Created by Matthew on 1/10/2017.
 */
public class Swim {

    boolean waterIsSwim;

    Swim(boolean waterIsSwim)
    {
        if(waterIsSwim == true)
        {
            System.out.println("The Water is warm go for a swim.");
        }
        if(waterIsSwim == false)
        {
            System.out.println("The water is cold, get out of the pool!");
        }

    }
}
