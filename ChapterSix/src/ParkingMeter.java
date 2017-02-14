/**
 * Created by Matthew on 2/13/2017.
 */
public class ParkingMeter {
    private double numMinutesPurchased;



    public ParkingMeter() {
        numMinutesPurchased = 0.0;
    }


    /**
     * @param numMinutesPurchased
     */
    public ParkingMeter(double numMinutesPurchased) {
        this.numMinutesPurchased = numMinutesPurchased;
    }


    public ParkingMeter(ParkingMeter object2){
        this.numMinutesPurchased = object2.numMinutesPurchased;

    }
    /**
     * @return the numMinutesPurchased
     */
    public double getNumMinutesPurchased() {
        return numMinutesPurchased;
    }


    /**
     * @param numMinutesPurchased the numMinutesPurchased to set
     */
    public void setNumMinutesPurchased(double numMinutesPurchased) {
        this.numMinutesPurchased = numMinutesPurchased;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String str;
        str = "Number of minutes purchased: " + this.numMinutesPurchased;
        return str;
    }





}
