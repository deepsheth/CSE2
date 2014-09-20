//Deep Sheth
//dss218
//Month
//Sept. 23, 2014
//Given month in number format, program will output the number of days in the corresponding month.

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an int given the number of the month (1-12): ");
        
        if (input.hasNextInt()) {
            int monthNo = input.nextInt();
            
            if (monthNo == 1 || monthNo == 3 || monthNo == 5 || monthNo == 7 || monthNo == 8 || monthNo == 10 || monthNo == 12) {
                System.out.println("The month has 31 days.");
            }
            else if (monthNo == 4 || monthNo == 6 || monthNo == 9 || monthNo == 11) {
                System.out.println("The month has 30 days.");
            }
            
            //If month is Febuary
            else if (monthNo == 2) {
                System.out.print("Enter the year: ");
                if (input.hasNextInt()) { //checks if input is an int
                    int year = input.nextInt(); 
                    
                    if (year >=0) { //if input is positive whole number
                        if (year%100 == 0) {
                            if (year%400 == 0) {
                                System.out.println("This is a leap year. Febuary has 29 days.");
                            }
                            else
                                System.out.println("This is not a leap year. Febuary has 28 days.");
                        } //end if century
                        
                        else if (year%4 ==0) {
                            System.out.println("This is a leap year. Febuary has 29 days." );
                        }
                        
                        else {
                            System.out.println("This is not a leap year. Febuary has 28 days.");
                        }
                    }
                    
                    else {
                        System.out.println("You did not enter a positive year");
                        return;
                    }
                }
                
                else {
                    System.out.println("Please enter an integer.");
                    return;
                }
            }
            
            else {
                System.out.println("You did not enter an integer within the range 1-12.");
            }
        }

        else {
            System.out.println("Please enter an integer.");
        }
        
    }
}