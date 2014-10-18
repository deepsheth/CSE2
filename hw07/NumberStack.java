// Deep Sheth
// dss218
// Number Stack Loop
// October 21, 2014
// Program outputs number a user entered using 3 different loops

import java.util.Scanner;

public class NumberStack {
    public static void main(String[] args) {
        
        //Allows console input
        Scanner input = new Scanner(System.in);
    
        //Variables
        int userNum = 0;
        int userNum2 = 0;
        int numLength = 0;
        
        
        System.out.print("Enter a number between 1 - 9: ");
        
        if (input.hasNextInt() == false) {
            System.out.println("You did not enter an integer between 1 -9.");
            return;   
        }
        else 
            userNum = input.nextInt();
            
        if (userNum < 1 || userNum > 9) {
            System.out.println("You did not enter an integer between 1 -9.");
            return; 
        }
        
       // numLength=(userNum*2)-1;
        int numLengthReset = 1;
        
        for (int a=0; a<=userNum; a++) { //Creates a new number
            numLength = (a*2)-1;
            
            for(int d=0; d<a; d++) {
                for(int b=0; b<numLength; b++) { //number of times the number is outputted
                    
                    System.out.print(a);
                }
                System.out.println(); // New line follows the number outputtted
            }    
            
            for(int c=0; c<numLength; c++) { //number of times dashes will be displayed after numbers are outputted
                System.out.print("-");
            }
            System.out.println(); // New line follows dashes
            
            
        }
        
    }
}