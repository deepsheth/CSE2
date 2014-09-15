//Deep Sheth
//Bicycle
//Sept. 15, 2014
//Given time in seconds and counts of wheel rotations, program will display miles traveled, trip time in minutes, and MPH

import java.util.Scanner; //class allows console input
import java.text.DecimalFormat; //class allows easy decimal formatting

public class Bicycle {
    public static void main(String[] args) {
        
        //Scanner class allows console input
        Scanner input = new Scanner(System.in);
        
        //Initializing decimals to 2 digits
        DecimalFormat d = new DecimalFormat("0.##");
        
        //Conversion Constants
        double wheelDiameter=27.0, //Diameter of wheel
        PI=3.14159, //pi constant
        feetPerMile=5280, //feet in a mile
        inchesPerFoot=12, //in in a foot
        secondsPerMinute=60; //seconds in a minute
        double distanceTrip, mph; 
        
        System.out.print("Enter number of counts on Cyclometer: ");
        int counts = input.nextInt();
        System.out.print("Enter number of seconds on Cyclometer: ");
        int tripTime = input.nextInt();
        
        //Distance of trip in INCHES
        distanceTrip=counts*wheelDiameter*PI;
        //Converts distance to MILES
        distanceTrip/=inchesPerFoot*feetPerMile;
        
        //Time of trip in MINUTES
        tripTime/=secondsPerMinute;
        
        //Computes average MPH
        mph=distanceTrip/(tripTime/secondsPerMinute);
        
        System.out.println("You traveled " + d.format(distanceTrip) + " miles in " + tripTime + " minutes.");
        System.out.println("You average " + d.format(mph) +" MPH.");
        
        
    }
    
}
