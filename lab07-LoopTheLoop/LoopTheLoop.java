// Deep Sheth
// dss218
// Looping Stars
// Program outputs x, x+1, x+2, ... stars until user's number has been reached

import java.util.Scanner;

public class LoopTheLoop {
    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);
        int nStars = 0;
        
        //Asks for user input
        System.out.print("Enter the number of starts you want to print: ");
        nStars = input.nextInt();
        
        if (nStars>15) {
            System.out.println("Please enter a number no higher than 15."); return;
        }
        
        //Outputs same number of stars as user's response
        for (int i=0; i<nStars; i++)
            System.out.print("*");
        System.out.println("");
        
        
        //j is one value less than i to allow linebreaks after stars have been outputted
        for (int i=1;i<=nStars;i++) {     
            for (int j=0; j<i; j++) 
                System.out.print("*");
            System.out.println("");
        }
        

    } //end main
} //end class