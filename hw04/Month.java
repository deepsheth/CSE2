//Deep Sheth
//dss218
//Month
//Sept. 23, 2014
//Given month in number format, program will output the number of days in the corresponding month.

//Imports method
import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        
         //Scanner class allows console input
        Scanner input = new Scanner(System.in);
        
        //Asks user to input month #
        System.out.print("Enter an int given the number of the month (1-12): ");
        
        
        //Checks if input is an integer
        if (input.hasNextInt()) {
            int monthNo = input.nextInt(); 
            
            //Months with numbers 1, 3, 5, 7, 8, 10, 12 will have 31 days
            if (monthNo == 1 || monthNo == 3 || monthNo == 5 || monthNo == 7 || monthNo == 8 || monthNo == 10 || monthNo == 12) {
                System.out.println("The month has 31 days.");
            }
            //Months with numbers 4, 6, 9, 11 will have 30 days
            else if (monthNo == 4 || monthNo == 6 || monthNo == 9 || monthNo == 11) {
                System.out.println("The month has 30 days.");
            }
            
            //If month is Febuary
            else if (monthNo == 2) {
                //Asks user to specify year
                System.out.print("Enter the year: ");
                if (input.hasNextInt()) { //checks if input is an int
                    int year = input.nextInt(); 
                    
                    if (year >=0) { //if input is positive whole number
                    
                        // Checks if year is a century
                        if (year%100 == 0) {
                            
                            // Centurys divisible by 400 are leap years
                            if (year%400 == 0) {
                                System.out.println("This is a leap year. Febuary has 29 days.");
                            }
                            // Centurys not divisisble by 400 are not leap years
                            else
                                System.out.println("This is not a leap year. Febuary has 28 days.");
                        } //END if century
                        
                        //If not century, years divisible by 4 are leap years
                        else if (year%4 ==0) {
                            System.out.println("This is a leap year. Febuary has 29 days." );
                        }
                        
                        //Years not divisble by 4 are not leap years
                        else {
                            System.out.println("This is not a leap year. Febuary has 28 days.");
                        }
                    }
                    
                    else { //Error message if Febuary year is not positive
                        System.out.println("You did not enter a positive year");
                        return;
                    }
                } //END if Febuary
                
                else { //Error message if month is not integer
                    System.out.println("Please enter an integer.");
                    return;
                }
            }
            
            else { //Error message if month is not between 1 & 12
                System.out.println("You did not enter an integer within the range 1-12.");
                return;
            }
        }

        else { //Error message if month is not an int.
            System.out.println("Please enter an integer.");
            return;
        }
        
    }//END main
}//END class