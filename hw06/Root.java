// Deep Sheth
// dss218
// Sq. Root Calculator 
// October 14, 2014
// Program uses bisection method to determine the square root of a positive number. The user's number is divided into multiple intervals to increase precision.

//Method
import java.util.Scanner;

public class Root {
    public static  void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        //Variables
        double x = 0, low = 0,  high = 0, avg = 0;
        
        System.out.println("* * SQ. ROOT CALCULATOR: Bisection Method * *");
        System.out.print("Enter a positive number (with decimals) to find the sq. root of: ");
        
        //Only allows input of numbers
        if (!input.hasNextDouble()) {
            System.out.println("Sorry. Only positive decimal numbers are accepted.");
            return; //terminates program
        }
        
        x = input.nextDouble();
        
        //Prevents negative numbers
        if (x <= 0) {
            System.out.println("Sorry. Only positive decimal numbers are accepted.");
            return; //terminates program
        }
        
        high = x+1;
        
        double tolerance = .0000001;
        
        while (tolerance < (high-low)){
            avg = ((high+low)/2);
            if ((avg*avg) > x)
                high = avg;
            else if ((avg*avg) < x)
                low = avg;
        }
        
        System.out.printf("\tsqrt("+x+") = "+ "%.7f\n",avg);
    }
}