/**
 * Created by Matthew on 2/13/2017.
 */
public class ParkedCar {
    private String make, //make of the vechile
            model,// make of the model
            LicenseNum;
    private double numMinutesParked; //number of minutes the car has been parked
    public ParkedCar() {
        this.make = "";
        this.model = "";
        this.LicenseNum = "";
        this.numMinutesParked = 0.0;
    }
    /**
     * @param make
     * @param model
     * @param LicenseNum
     * @param numMinutesParked
     */
    public ParkedCar(String make, String model, String LicenseNum, double numMinutesParked) {
        super();
        this.make = make;
        this.model = model;
        this.LicenseNum = LicenseNum;
        this.numMinutesParked = numMinutesParked;
    }

    public ParkedCar(ParkedCar object2){
        this.make = object2.make;
        this.model = object2.model;
        this.LicenseNum = object2.LicenseNum;
        this.numMinutesParked = object2.numMinutesParked;
    }
    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }
    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }
    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }
    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    /**
     * @return the LicenseNum
     */
    public String getLicenseNum() {
        return LicenseNum;
    }
    /**
     * @param LicenseNum the LicenseNum to set
     */
    public void setLicenseNum(String LicenseNum) {
        this.LicenseNum = LicenseNum;
    }
    /**
     * @return the numMinutesParked
     */
    public double getNumMinutesParked() {
        return numMinutesParked;
    }
    /**
     * @param numMinutesParked the numMinutesParked to set
     */
    public void setNumMinutesParked(double numMinutesParked) {
        this.numMinutesParked = numMinutesParked;
    }
    @Override
    public String toString() {
        String str;
        str = "Make: " + this.make + "\n" +
                "Model: " + this.model + "\n" +
                "License Plate Number: " + this.LicenseNum + "\n" +
                "Number of Minutes Parked: " + this.numMinutesParked + "\n";
        return str;
    }

}
