//Deep Sheth
//dss218
//Month
//Sept. 23, 2014
//Given Lehigh course number, program will determine year & time of year the course is offered

//Imports method
import java.util.Scanner;

public class CourseNumber {
    public static void main(String[] args) {
        
         //Scanner class allows console input
        Scanner input = new Scanner(System.in);
        
        //Asks user to input Lehigh course #
        System.out.print("Enter a six digit Lehigh course number: ");
        
        if (input.hasNextInt()) { //Makes sure input is integer
            int courseNum = input.nextInt();
            
            //All courses must be divisble by 10, else error message
            if (courseNum%10 == 0 ) {
                //All courses must be between 186510 & 201040, else error message
                if (courseNum >= 186510 && courseNum <= 201440) {
                    
                    //Diving courseNum by 100 truncates last 2 digits, leaving year (first 4 digits)
                    int yearNum = courseNum/100;
                    
                    //Decimal divides first 4 and last 2 digits (ex. 1234.56)
                    double digitsDivided = ((double)(courseNum))/100;
                    
                    //Subtraction gives the time a course was offered in decimlas
                    //Multiplication removes decimal & rounding/casting necessary to remove type double inaccuracy
                    int timeOffered = (int)(((digitsDivided-yearNum)*100)+0.5);
                    
                    //Depending on the value of last two digits, the time the course offered is determined
                    if (timeOffered == 10) {
                        System.out.println("This course was offered in the spring of "+yearNum+".");
                    }
                    else if (timeOffered == 20) {
                        System.out.println("This course was offered in Summer 1 of "+yearNum+".");
                        
                    }
                    else if (timeOffered == 30)  {
                        System.out.println("This course was offered in Summer 2 of "+yearNum+".");
                        
                    }
                    else if (timeOffered == 40 ) {
                        System.out.println("This course was offered in fall of "+yearNum+".");
                    }
                    
                    //Error message in case user input is divislbe by 10 but does not fall into above categories
                    else {
                        System.out.println("You entered an invalid course number.");
                    }
                }
                else { //Error message if outside of range
                    System.out.println("You entered a number outside of the range [185510, 201440].");
                }
            }
            else { //Error message if number is not divislbe by 10
                System.out.println("You entered an invalid course number.");
            }
        }
        else { //If not integer
            System.out.println("You entered an invalid course number. It must be an integer.");
            return;
        }
    } //END main
} //END class