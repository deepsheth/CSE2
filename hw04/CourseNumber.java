//Deep Sheth
//dss218
//Month
//Sept. 23, 2014
//Given Lehigh course number, program will determine year & time of year the course is offered

import java.util.Scanner;
import java.text.DecimalFormat;

public class CourseNumber {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        
        System.out.print("Enter a six digit Lehigh course number: ");
        
        if (input.hasNextInt()) {
            int courseNum = input.nextInt();
            
            if (courseNum%10 == 0 ) {
                if (courseNum >= 186510 && courseNum <= 201440) {
                    int yearNum = (courseNum/100);
                    double digitsDivided = ((double)(courseNum))/100;
                    int decimals = (int)(((digitsDivided-yearNum)*100)+0.5);
                    
                    
                    if (decimals == 10) {
                        System.out.println("This course was offered in the spring of "+yearNum+".");
                    }
                    else if (decimals == 20) {
                        System.out.println("This course was offered in Summer 1 of "+yearNum+".");
                        
                    }
                    else if (decimals == 30)  {
                        System.out.println("This course was offered in Summer 2 of "+yearNum+".");
                        
                    }
                    else if (decimals == 40 ) {
                        System.out.println("This course was offered in fall of "+yearNum+".");
                    }
                    else {
                        System.out.println("You entered an invalid course number.");
                    }
                }
                else {
                    System.out.println("You entered a number outside of the range [185510, 201440].");
                }
            }
            else {
                System.out.println("You entered an invalid course number.");
            }
            
        }
        
        else {
            System.out.println("You entered an invalid course number. It must be an integer.");
            return;
        }
        
        
    
    }
}