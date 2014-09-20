//Deep Sheth
//dss218
//Income Tax
//Sept. 23, 2014
//Given income, program will output income tax

//Imports method
import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Asks user for income
        System.out.print("What is your income giving the number of thousands? $");
        
        //Checks if input is an integer
        if (input.hasNextInt()) {
            int income = input.nextInt();
            
            //Variables
            double taxPercent;
            int incomeThousands = income*1000; //Income converted to thousands
            
            //Negative income resluts in error
            if (income < 0 ) {
                System.out.println("You're not making an income! Please enter a positive number.");
                return;
            }
            
            //Calculates if income is < $20K
            else if (income < 20) {
                taxPercent = 0.05;
                System.out.println("The tax rate on $"+income+",000 is "+ (int)(taxPercent*100)+".0%, and the tax is $"+ (int)(taxPercent*incomeThousands));
            }
            
            //Calculates if income is between $20k and $40K
            else if (income >= 20 && income < 40) {
                taxPercent = 0.07;
                System.out.println("The tax rate on $"+income+",000 is "+ (int)(taxPercent*100)+".0%, and the tax is $"+ (int)(taxPercent*incomeThousands));
            }
            
            //Calculates if income is betweeen $40k and $78k
            else if (income >=40 && income < 78) {
                taxPercent = 0.12;
                System.out.println("The tax rate on $"+income+",000 is "+ (int)(taxPercent*100)+".0%, and the tax is $"+ (int)(taxPercent*incomeThousands));
            }
            
            //Calculates if income > $78K
            else if (income >= 78) {
                taxPercent = 0.14;
                System.out.println("The tax rate on $"+income+",000 is "+ (int)(taxPercent*100)+".0%, and the tax is $"+ (int)(taxPercent*incomeThousands));
            }

        }//END if positive input
        
        
        //Error if input is not an int
        else { 
            System.out.println("You did not enter an integer.");
            return;
        }
        
    } //END main
} // END class