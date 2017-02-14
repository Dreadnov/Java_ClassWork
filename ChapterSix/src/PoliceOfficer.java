/**
 * Created by Matthew on 2/13/2017.
 */
public class PoliceOfficer {
    private String name; //Officers Name
    private int badgeNum; //Officer's badge number
    private ParkedCar parkedCar; //Parked car object
    private ParkingMeter parkingMeter; //parking meter object
    private ParkingTicket parkingTicket; //parking ticket object

    public PoliceOfficer(PoliceOfficer policeOfficer, ParkedCar parkedCar, ParkingMeter parkingMeter, ParkingTicket parkingTicket){
        this.parkedCar = new ParkedCar(parkedCar);
        this.parkingMeter = new ParkingMeter(parkingMeter);
        this.parkingTicket = new ParkingTicket(parkingTicket);
        this.name = policeOfficer.name;
        this.badgeNum = policeOfficer.badgeNum;
    }



    /**
     * No arg constructor to initialize the field
     * values
     */
    public PoliceOfficer() {
        this.name = "";
        this.badgeNum = 0;
    }


    public PoliceOfficer(String name, int badgeNum){
        this.name = name;
        this.badgeNum = badgeNum;
    }


    public PoliceOfficer(PoliceOfficer policeOfficer){
        this.name = policeOfficer.name;
        this.badgeNum = policeOfficer.badgeNum;
    }


    public PoliceOfficer(String name, int badgeNum, ParkedCar parkedCar, ParkingMeter parkingMeter) {
        this.name = name;
        this.badgeNum = badgeNum;
        this.parkedCar = new ParkedCar(parkedCar);
        this.parkingMeter = new ParkingMeter(parkingMeter);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBadgeNum() {
        return badgeNum;
    }
    public void setBadgeNum(int badgeNum) {
        this.badgeNum = badgeNum;
    }
    public ParkedCar getParkedCar() {
        return new ParkedCar(parkedCar);
    }
    public void setParkedCar(ParkedCar parkedCar) {
        this.parkedCar = new ParkedCar(parkedCar);
    }
    public ParkingMeter getParkingMeter() {
        return new ParkingMeter(parkingMeter);
    }
    public void setParkingMeter(ParkingMeter parkingMeter) {
        this.parkingMeter = new ParkingMeter(parkingMeter);
    }

    public ParkingTicket getParkingTicket() {
        return parkingTicket;
    }
    public void setParkingTicket(ParkingTicket parkingTicket) {
        this.parkingTicket = parkingTicket;
    }

    public void examineCar(){
        if((parkedCar.getNumMinutesParked() - parkingMeter.getNumMinutesPurchased()) > 0){
            issueParkingTicket();
        }
    }

    public void issueParkingTicket(){
        System.out.println("Parking Ticket" +
                "\n******************\n" + "car info: " + "\n"
                + parkingTicket.getParkedCarReport(parkedCar) + "Police Officer Info:"
                + "\n" + parkingTicket.getPoliceOfficerReport() +
                "Fine" + parkingTicket.getParkingFine(parkedCar, parkingMeter));
    }


    @Override
    public String toString() {
        String str;
        str = "Officer Name: " + this.name + "\n" +
                "Badge Number: " + this.badgeNum + "\n";
        return str;
    }

}

