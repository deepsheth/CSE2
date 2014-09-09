//Deep Sheth
//Cyclometer
//Sept. 5, 2014
//Given time and wheel rotations, program will display stats of each trip


public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
        
        //Variables
        int secsTrip1=480; //Trip 1 time in seconds
        int secsTrip2=3220; //Trip 2 time in seconds
        int countsTrip1=1561; //Trip 1 rotations
        int countsTrip2=9037; //Trip 2 rotations
        
        //Constants (used for conversion)
        double wheelDiameter=27.0, //Diameter of wheel
        PI=3.14159, //pi constant
        feetPerMile=5280, //feet in a mile
        inchesPerFoot=12, //in in a foot
        secondsPerMinute=60; //seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; 
        
        //Converts trip times to minutes and displays number of rotations
        System.out.println("Trip 1 took "+(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        // Above gives distance in inches
        // (for each count, a rotation of the wheel travels the diameter in inches times PI)
        
        
        distanceTrip1/=inchesPerFoot*feetPerMile; //Gives distance in miles
        
        //Computes value for distance
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        
        totalDistance=distanceTrip1+distanceTrip2;
        
        //Prints out the distances
        System.out.println("Trip 1 was "+distanceTrip1+" miles.");
        System.out.println("Trip 2 was "+distanceTrip2+" miles.");
        System.out.println("The total distance was "+totalDistance+" miles.");
        
    } //END main method
} //END Cyclometer clas