/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Enigma1 {
    public static void main(String[] args){
        double percent;
        
        System.out.print("Enter a value for the percent (0, 1,...99)- ");
        double x=((new Scanner(System.in)).nextDouble());
        DecimalFormat d = new DecimalFormat("0.##%");
        
        System.out.println("You entered "+x+"%");
        //print out the proportion remaining for all  percentages
        System.out.println("The proportion remaining is "+ d.format(1- (x/100)));

   }
}

/* Error report: 
 *    Many different types of numbers were not accepted.
 *    Only numbers listed in the if statement displayed a correct output.
 *    The program did not use variables properly to allow any number to be accepted.
 *    Logic error has been fixed above -- it is no longer hard-coded
 */
