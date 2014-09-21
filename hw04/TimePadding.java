//Deep Sheth
//dss218
//Time Padding
//Sept. 23, 2014
//Given time in seconds, time in conventional form will be displayed

//Imports method
import java.util.Scanner;
import java.text.DecimalFormat;

public class TimePadding {
    public static void main(String[] args) {
        
        //Scanner allows console input
        Scanner input = new Scanner(System.in);
        //Formats numbers to two digits, adds zero for single digit numbers (creates "padding")
        DecimalFormat d = new DecimalFormat("00");
        
        //Constants
        int secsPerHour = 60*60;
        int secsPerMin = 60;
        
        //Asks user to input time in seconds
        System.out.print("Enter a time in seconds: ");
        
        if (input.hasNextInt()) { //Input must be an integer
            int seconds = input.nextInt();
            if (seconds >= 0) { //Input must be positive
                
                
                int hours = seconds/secsPerHour; //Calculates seconds to hours
                seconds = seconds%secsPerHour;   //Remaining seconds after secsPerHour is deducted
               
                int mins = seconds/secsPerMin; //Calculates minutes 
                seconds = seconds%secsPerMin;  //Remaining seconds after secsPerMin is deducted
                
                
                //Outputs time in conventional form with double digit padding
                System.out.println("The time is " + hours + ":" + d.format(mins) + ":" + d.format(seconds));
                   
            }
            else { //Error message if input is not positive
                System.out.println("Please enter a positive number.");
                return;
            }
        }
        else { //Error message if input is not an integer
            System.out.println("Sorry. Program does not accept milliseconds. Use integers.");
            return;
        }
    }//END main 
}//END class