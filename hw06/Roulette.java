// Deep Sheth
// dss218
// Roulette
// October 14, 2014
// Program stimulates outcomes of player's 100 spins based on Monte Carlo simulatiosn

//Method
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Variables
        String playerInput = ""; //player input as string
        int playerNum = 0; //player input as int
        boolean num00 = false; //if player picks 00
        int win$ = 36; //money won per match
        int nWins = 0; //times won
        int nLosses = 0; //times lost
        
 /*     ============================================================
           .::[ CODE TO ALLOW USER TO CHOOSE NUMBER TO BET ON ]::.
        =============================================================
        
        //Asks user for input
        System.out.print("What number would you like to bet on? ");
        
        //Ends program if user does not enter integer
        if (input.hasNextInt() == false) {
            System.out.println("Please enter an integer!");
            return;
        }
        
        //User input is stored as string (necessary for 00 case)
        playerInput = input.next();
        
        //User picks number 00
        if (playerInput.equals("00")) {
            num00 = true;
        }
       
       //Converts user input to integer
       playerNum = Integer.parseInt(playerInput);
       
       //Checks if user input is inside range
       if (playerNum < 0 || playerNum > 36) {
           System.out.println("\nYou did not enter a number used in roulette.\nYou can enter any number from 0-36, or 00");
           return;
       }
       
       //Makes "00" equal integer 37 
       else if (num00 == true) {
           playerNum = 37;
       } */
       
       System.out.println(" * * * * R O U L E T T E  * * * * ");
       
       //Program picks user's number
       playerNum = (int)(Math.random()*38);
       System.out.println("The number you are betting on is " + playerNum);
       
       for (int i=0; i<100; i++) {
            int rouletteNum = (int)(Math.random()*38); //Generates random number from 0-37
            
            if (rouletteNum == playerNum) //case for win
               nWins++;
            else  //case for loss
               nLosses++;
            
       }
       
       //Outputs outcome of spins, including total money won
       System.out.println("\nIf you spin 100 times, here are your outcomes:");
       int totalWins$ = win$*nWins;
       System.out.println("You would win "+nWins+" times.\n\tYou win $"+win$+" * "+nWins+" = $"+totalWins$);
       System.out.println("You would lose "+nLosses+" times.");
       
       //Determines if net money results profit/loss
       if ((totalWins$ - 100) >= 0)
            System.out.println("Congragulations! You leave winning $" + (totalWins$ - 100));
       else 
            System.out.println("\nSorry. You leave losing $" + (100 - totalWins$));
       
       
       //Resets counters for 1000000 theoretical case
       nWins=0;
       nLosses=0;
       
       for( int i=0; i<100000; i++) {
           int rouletteNum = (int)(Math.random()*38); //Generates random number from (0,38) & truncates decimals
           
           if (rouletteNum == playerNum) 
               nWins++;
           else 
               nLosses++;
               
        
       } 
        
        //SPIN 1000x
        System.out.println("\n\nWins: " + nWins);
        System.out.println("Losses: " + nLosses);

    }
}