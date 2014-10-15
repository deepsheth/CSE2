// Deep Sheth
// dss218
// Roulette
// October 14, 2014
// Monte Carlo simulation: Program stimulates outcomes of 100 spins of roulette when repeated 1000 times 

//Method
import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        
        //Allows console input
        Scanner input = new Scanner(System.in);
        
        //Variables
        //spins won, lost
        int nWins = 0, nLosses = 0;
        //games won, partially won, lost
        int gamesWon = 0, gamesWonSome = 0, gamesLost = 0; 
        //money won, lost
        int won$ = 0, lost$ = 0;
        
        
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
       
       System.out.println(" * * * *  R O U L E T T E  * * * * ");
       
       //Program picks user's number instead of user
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
           
            //For each 100 spins, if statement classifies win/loss
            
            if (nWins >= 3) //3 wins means player profited 
               gamesWon++;
            else if (nWins == 0) //0 wins means player losses everything
               gamesLost++;
            else //1 or 2 wins means player wins some money back
               gamesWonSome++;

            won$ += nWins; //won$ will equal total amount of wins
            
            //resets counters for next game (100 spins)
            nWins=0;
            nLosses=0;
            
        } //end 1000 loop simulations
       
        lost$ = 100000-(won$*36);
        
        //Outputs outcome of 100 spins played 1000 times
        System.out.println("\n1000 repetitions of 100 spin simulation:");
        System.out.println("\tNumber of games you win a profit: " + gamesWon);
        System.out.println("\tNumber of games you only win some money back (no profit): " + gamesWonSome);
        System.out.println("\t   Total number of games you win money: " + (gamesWon+gamesWonSome));
        System.out.println("\t   Total amount of money you win in total: $"+won$*36);
        System.out.println("\tNumber of games you lose everything: " + gamesLost);
        System.out.println("\n\tIn the end, you lose $"+lost$+" from what you started off with.");
       

    } //end main
} //end class