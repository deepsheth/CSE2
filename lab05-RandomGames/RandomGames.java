// Deep Sheth
// dss218
// Random Games
// September 26, 2014
// User will choose which game to play and program will output a random number

import java.util.Scanner;

public class RandomGames {
    public static void main(String[] args){
        
        
        Scanner input = new Scanner(System.in);
        
        //Asks user to pick a game
        System.out.println("Pick one:");
        System.out.println("\tRoulette (R/r)\n\tCraps (C/c)\n\tPick a Card (P/p)");
        System.out.print("Your choice: ");
        
        String userResponse = input.next(); //Stores user response in variable
        
        switch (userResponse) {
            
            //ROULETTE 
            case "R":
            case "r":
                //Generates random num from 0-37
                int rouletteNum = (int)(Math.random()*37); 
                
                switch (rouletteNum) {
                    case 37: //Roulette has numbers from 0-36, this allows 00 case
                        System.out.println("Roulette: 00");
                    default:
                        System.out.println("Roulette: "+rouletteNum);
                        break;
                }
                break; //END ROULETTE
            
            //CRAPS
            case "C":
            case "c":
                //Not implemented yet
                System.out.println("Craps has yet to be implemented.");
                break;
                
            //PICK A CARD
            case "P":
            case "p":
                
                //Generates random number from 1-4
                int nSuit = (int)(Math.random()*4+1);
                String suit = "";
                
                //Random number is assigned to suits
                switch (nSuit) {
                    case 1:
                        suit = "Hearts";
                        break;
                    case 2: 
                        suit = "Diamonds";
                        break;
                    case 3: 
                        suit = "Clubs";
                        break;
                    case 4:
                        suit = "Spades";
                        break;
                }
                
                // Generates random number from 1-13
                int cardNum = (int)(Math.random()*13+1);
                String cardLetter = "";
                
                //For cards that do not have number values
                switch (cardNum) {
                    case 1:
                        cardLetter = "Ace";
                        break;
                    case 11:
                        cardLetter = "Jack";
                        break;
                    case 12:
                        cardLetter = "Queen";
                        break;
                    case 13: 
                        cardLetter = "King";
                        break;
                }
                
                //Outputs number on card and suit
                if (cardLetter.equals(""))
                    System.out.println("You picked a "+cardNum+" of "+suit+".");
                //Outputs royalty/card without number and its suit
                else 
                    System.out.println("You picked a "+cardLetter+" of "+suit+".");
                
                
                break; //End case PICK A CARD
                
            default:
                System.out.println("You did not enter a letter listed above.");
        }
    }
}