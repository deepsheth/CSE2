// Deep Sheth
// dss218
// Roulette
// October 14, 2014
// Monte Carlo simulation: Program stimulates outcomes of 100 spins of roulette when repeated 1000 times 

//Method
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        //Variables
        int nWins = 0; //spins won 
        int nLosses = 0; //spins lost
        int gamesWon = 0; //games won
        int gamesWonSome = 0; //games partially won
        int gamesLost = 0; //games lost
        
 /*     ============================================================
           .::[ CODE TO ALLOW USER TO CHOOSE NUMBER TO BET ON ]::.
        =============================================================
        
        //Variables 
        String playerInput = ""; //player input as string
        int playerNum = 0; //player input as int
        boolean num00 = false; //if player picks 00
        
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
       int playerNum = (int)(Math.random()*38);
       System.out.println("The number you are betting on is " + playerNum + ".");
       
       
       for (int n=0; n<1000; n++) { //100 spins are repeated 1000 times
           
           for (int i=0; i<100; i++) { //player spins 100 times
                int rouletteNum = (int)(Math.random()*38); //Generates random number from 0-37
                
                //counts number of times player wins/loses per 100 spisn
                if (rouletteNum == playerNum) //case for win
                   nWins++;
                else  //case for loss
                   nLosses++;
           }//end for
           
            //3 wins means player profited 
            if (nWins >= 3) 
               gamesWon++;
            //0 wins means player losses everything
            else if (nWins == 0) 
               gamesLost++;
            //1 or 2 wins means player wins some money back
            else {
               gamesWon++;
               gamesWonSome++;
            }
           
            //resets counters for next game
            nWins=0;
            nLosses=0;
       
        } //end for loop simulations
       
        //Outputs outcome of 100 spins played 1000 times
        System.out.println("\n1000 repetitions of 100 spin simulation:");
        System.out.println("\tNumber of games you win a profit: " + gamesWon);
        System.out.println("\tNumber of games you win some money back " + gamesWonSome);
        System.out.println("\tNumber of games you lose everything: " + gamesLost);
       

    } //end main
} //end class