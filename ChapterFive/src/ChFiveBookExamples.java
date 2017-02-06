import java.util.Scanner;
/**
 * Created by Matthew on 1/31/2017.
 */
    public class ChFiveBookExamples {

        private int speed; // private filed for speed
        private int time;// private filed for time
        public ChFiveBookExamples() {
//default constructor
        }
        /**
         * @return the distance
         */
        public int getdistance() {
            return speed * time;
        }
        /**
         * @return the speed
         */
        public int getSpeed() {
            return speed;
        }
        /**
         * @param speed the speed to set
         */
        public void setSpeed(int speed) {
            this.speed = speed;
        }
        /**
         * @return the time
         */
        public int getTime() {
            return time;
        }
        /**
         * @param time the time to set
         */
        public void setTime(int time) {
            this.time = time;
        }
        public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in); //Initiates the scanner object to get user input
            ChFiveBookExamples num = new ChFiveBookExamples(); // calls the constructor
            int speed;// variable for speed
            int time;// variable for time
            do{
                System.out.println("Enter a speed above Zero");
                speed = keyboard.nextInt();// sets speed variable
            } while(speed < 0);// checks to make sure speed is good
            do{
                System.out.println("Enter the time in hours you are going ");
                time = keyboard.nextInt();// sets time variable
            }while(time < 0);// checks to make sure time is good
            num.setSpeed(speed);
            System.out.println("Hour\t\t Distance traveled");
            System.out.println("**********************************");
            for(int i = 1; i <= time; i++){
                num.setTime(i);// sets settime for each individual hour
                System.out.printf("%d\t\t\t %d\n", i , num.getdistance());// display the output
            }
        }
    }