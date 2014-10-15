// Deep Sheth
// dss218
// Sq. Root Calculator 
// October 14, 2014
// Program uses bisection method to determine the square root of a positive number. The user's number is divided into multiple intervals to increase precision.

//Imports scanner
import java.util.Scanner;

public class Root {
    public static  void main(String[] args) {
        
        //Allows console input
        Scanner input = new Scanner(System.in);
        //Variables
        double x = 0, low = 0,  high = 0, avg = 0;
        
        //Asks for user input
        System.out.println("* * SQ. ROOT CALCULATOR: Bisection Method * *");
        System.out.print("Enter a positive number (with decimals) to find the sq. root of: ");
        
        //Only allows input of numbers
        if (!input.hasNextDouble()) {
            System.out.println("Sorry. Only positive decimal numbers are accepted.");
            return; //terminates program
        }
        
        //variable x equals input
        x = input.nextDouble();
        
        //Prevents negative input
        if (x <= 0) {
            System.out.println("Sorry. Only positive decimal numbers are accepted.");
            return; //terminates program
        }
        
        //Value of upper bound
        high = x+1;
        
        //Precision of square root
        double tolerance = .0000001;
        
        while (tolerance*(x+1) < (high-low)){ //loop will run until bounds have a difference less than 0.0000001 (allows high accuracy)
            avg = ((high+low)/2); //average of bounds
            
            //Using bissection method, new bounds are assigned
            if ((avg*avg) > x)
                high = avg;
            else if ((avg*avg) < x)
                low = avg;
        } //end while
        
        //Outputs square root of the user's input
        System.out.printf("\tsqrt("+x+") = "+ "%.7f\n",avg);
    }
}