//Deep Sheth
//dss218
//Four Digits
//Sept. 15, 2014
//Given number, program will output first four numbers after decimal

import java.util.Scanner; //class allows user input
import java.text.DecimalFormat;

public class FourDigits {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        //Drops decimals from number
        DecimalFormat d = new DecimalFormat("0000");
        
        //Asks user for number with decimals
        System.out.print("Enter a number with at least 4 decimals: ");
        double decimalNum = input.nextDouble();
        
        //Casts double into integer; gives whole number
        int wholeNum = (int)decimalNum;
        
        //Subtracts decimal input with it's whole number; gives decimal number
        double decimals = decimalNum-wholeNum;
        
        //Moves decimal 4 digits to right
        decimals*=10000;
        
        //In case user input has over 4 decimals, casting cuts out extra decimals
        decimals = (int)decimals;
        
        //d.format ensures answer has only 4 digits (in case tenths place has value of 0)
        System.out.println("The right four digits of the number are: " + d.format(decimals));
        
    }
}