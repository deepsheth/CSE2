//Deep Sheth
//dss218
//Program: Big Mac
//Sept. 12, 2014

//Program computes cost of Big Macs based on user input

import java.util.Scanner;

public class BigMac {
    public static void main(String[] args) {
        
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        
        //Asks user to input information & stores that into a variable
        System.out.print("Enter the number of Big Macs(an integer > 0): ");
        int nBigMacs = myScanner.nextInt();
        System.out.print("Enter the cost per Big Mac as" + " a double (in the form xx.xx): ");
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        
        taxRate/=100; // user enters percent
        
        double cost$;
        
        int dollars, dimes, pennies; //whole dollar amount of cost dimes, pennies; 
                                     //to the right of the decimal point for the cost$
        
        //cost of BigMa is number of BigMacs * price of BigMacs * tax rate
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        
        //get dimes amount, e.g.,
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //where the % (mod) operator returns the emainder
        //after the division: 583%100 -> 83, 27%5 -> 2
        dimes=(int)(cost$*10)%10;
        pennies=(int)(cost$*100)%10;
        
        //Outputs total cost of BigMac based on all inputed data 
        System.out.println("The total cost of " +nBigMacs+" BigMac, at $"+bigMac$ +" per BigMac, with a" + "sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies);
        
    } //end of main
} //end of class