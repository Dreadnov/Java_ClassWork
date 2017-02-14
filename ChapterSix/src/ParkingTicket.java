/**
 * Created by Matthew on 2/13/2017.
 */
import java.text.DecimalFormat;

public class ParkingTicket {
    private ParkingMeter parkingMeter;
    private ParkedCar parkedCar;
    private PoliceOfficer policeOfficer;


    /**
     * @param parkingMeter
     * @param parkedCar
     * @param policeOfficer
     */


    public ParkingTicket() {

    }


    public ParkingTicket(ParkingMeter parkingMeter, ParkedCar parkedCar, PoliceOfficer policeOfficer) {
        super();
        this.parkingMeter = new ParkingMeter(parkingMeter);
        this.parkedCar = new ParkedCar(parkedCar);
        this.policeOfficer = new PoliceOfficer(policeOfficer);
    }


    public ParkingTicket(ParkingTicket parkingTicket){
        this.parkingMeter = new ParkingMeter(parkingTicket.parkingMeter);
        this.parkedCar  = new ParkedCar(parkingTicket.parkedCar);
        this.policeOfficer = new PoliceOfficer(parkingTicket.policeOfficer);
    }
    /**
     * returns a string with the object's make , model, license number,
     * and number of minutes
     * @param parkedCar
     * @return
     */
    public String getParkedCarReport(ParkedCar parkedCar){
        return new ParkedCar(parkedCar).toString();
    }

    public String getPoliceOfficerReport(){
        return new PoliceOfficer(policeOfficer).toString();
    }

    /*
     * return a string with a parking fine
     */
    public String getParkingFine(ParkedCar parkedCar, ParkingMeter parkingMeter ){
        DecimalFormat formatter = new DecimalFormat("$###,##0.00");
        double fine = 0;
        String str = "the car is not parked illegally, there is no fine";
        double minutesOver = parkedCar.getNumMinutesParked() - parkingMeter.getNumMinutesPurchased();
        //determine if the car is illegally parked
        if(parkedCar.getNumMinutesParked() > parkingMeter.getNumMinutesPurchased()){
            fine += 25.0;//base fine for the first hour
        }
        if(minutesOver > 60.0){
            //calculate number of hours the car is illegaly parked and multiply the result
            fine += (Math.ceil((minutesOver - 60.0)/60.0) * 10.0);
        }
        if(fine > 0.0){
            str = ": " + formatter.format(fine);
        }
        return str;
    }

}
