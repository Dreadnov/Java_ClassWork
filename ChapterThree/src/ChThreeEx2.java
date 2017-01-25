/**
 * Created by Matthew on 1/19/2017.
 */
public class ChThreeEx2
{

   private String model;
   private int yearModel,speed;

    public ChThreeEx2(int yearModel,String model)
    {
        this.yearModel = yearModel;
        this.model = model;
        speed = 0;
    }

    public String getModel()
    {
        return model;
    }
    public void setModel(String model)
    {
        this.model = model;
    }

    public int getYearModel()
    {
        return yearModel;
    }
    public void setYearModel(int yearModel)
    {
        this.yearModel = yearModel;
    }

    public int getSpeed()
    {
        return speed;
    }
    public int setSpeed(int speed)
    {
        this.speed = speed;
        return speed;
    }
    public void accelarate()
    {
        speed += 5;
        System.out.println("Current Speed: " + speed);
    }
    public void brake()
    {
        speed -= 5;
        System.out.println("Current Speed: " + speed);

    }

}

