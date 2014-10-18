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
        
        numLength=(userNum*2)-1;
        int numLengthReset = 1;
        
        for(int a=0; a<userNum; a++) { //Allows block repetitiveness  
            
            
                for (int n=1; n<=userNum; n++){
            
                    for (int i=0; i<n; i++) { //condition here!
                        
                        System.out.print(n);
                        
                        
                        
                        
                    }
                   
                  
                    System.out.print("");
                    
                }
                
                System.out.println();
                //Adds dashes afterwords
                for (int i=0; i<numLength; i++) {
                        System.out.print("-");
                }
                System.out.println();
            
        }
        
    }
}