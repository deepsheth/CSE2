// Deep Sheth
// dss218
// Find Duplicates
// Nov. 18, 2014
// Program generates poker hand from deck of cards and measures probability of picking a hand with exactly one duplicate

import java.util.Random;
import java.util.Scanner;

public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        simulateOdds();
    }

    public static void showHands(){
        
        //Variables
        String answer = "";
        Scanner input=new Scanner(System.in);
        int[] hand = {-1, -1, -1, -1, -1};
        
        do {
            //Variables inside loop
            int[] deck = new int[52];
            String[] suitOut = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
            String cardNum = "";
            String suitType = "";
            String space = " ";
            
            //Initializes all hand array elements to -1
            for(int i=0; i<5; i++)
                hand[i] = -1;
                
            //Gives deck of cards values
            for(int i=0; i<deck.length; i++)
                deck[i] = i;
        
        
            for (int i=0; i<5; i++){    
                //Num of deck cards generated decreases by 1 each run
                int card = (int)(Math.random() * (52-i));
                
                
                hand[i] = deck[card]; //Swaps card in hand with card in deck
                deck[card] = deck[51-i];
                deck[51-i] = -1; //Last number in deck becomes -1
                
                //cardRandom is card picked in hand
                int cardRandom = hand[i];
                
                
                cardNum = cardNum(cardRandom);   //Returns number of a card
                suitType = suitType(cardRandom); //Returns type of suit

                
                //Output array stores suits and card numbers
                switch(suitType) {
                    case "Clubs":
                        suitOut[0] += cardNum + space;
                        break;
                    case "Diamonds":
                        suitOut[1] += cardNum + space;
                        break;
                    case "Hearts":
                        suitOut[2] += cardNum + space;
                        break;
                    case "Spades": 
                        suitOut[3] += cardNum + space;
                        break;
                }
            } // end iteration
            
            //Outputs suits & cards picked from suit
            for(int i=0; i<suitOut.length; i++)
                System.out.println(suitOut[i]);

            //If user enters "Y/y", program will continue running using DO/WHILE loop
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=input.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }// end main
    
    
    //Method returns number/letter of card
    public static String cardNum(int cardRandom) {
        String cardNum;
        
        switch(cardRandom%13){
            case 0: cardNum = "A";
                break;
            case 1: cardNum = "K";
                break;
            case 2: cardNum = "Q";
                break;
            case 3: cardNum = "J";
                break;
            default:
                cardNum = ""+(14 - (cardRandom%13));
        }
        
        return cardNum;
    }
    
    //Method returns type of suit of random card picked
    public static String suitType(int cardRandom) {
        String suitType = "";
        int suit = (int)(cardRandom/13 + 0.5); 
        
        //Depending on calculation above, card type is determined
        switch (suit) {
            case 0: suitType = "Clubs";
                break;
            case 1: suitType = "Diamonds";
                break;
            case 2: suitType = "Hearts";
                break;
            case 3: suitType = "Spades";
                break;
        }
        return suitType;
    }
    
    //
    public static void simulateOdds() {
        //Variables
        String answer = "";
        int[] hand = {-1, -1, -1, -1, -1}; 
        String[] duplicateOut = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        int[] numOfDuplicates = new int[13];
        
        for(int z = 0; z<10000; z++){   
            //Variables
            int[] deck = new int[52];
            String[] suitOut = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
            String cardNum = "";
            String suitType = "";
            Boolean duplicate;
            int cardRandom;
            
            
            //All hand cards are initialized to -1    
            for(int i=0; i<5; i++)
                hand[i] = -1;
                
            //Gives deck of cards values
            for(int i=0; i<deck.length; i++)
                deck[i] = i;
        
        
            for (int i=0; i<5; i++){    
                int card = (int)(Math.random() * (52-i));
                
                //Swaps cards
                hand[i] = deck[card];
                deck[card] = deck[51-i];
                deck[51-i] = -1;
                cardRandom = hand[i];
                cardNum = cardNum(cardRandom);
            }
            
            //Hand becomes a number from 0-12
            for(int i=0; i<5; i++)
                hand[i] = hand[i]%13;
            
            //Counters
            int numDuplicates = 0;
            int totalDups = 0;
            int cardWithDuplicate = -1;
           
            //Loop provides number to look for in array
            for(int i=0; i<hand.length; i++){
                int lookFor = hand[i];
                
                //Increases counter everytime numbers match
                for(int n=0; n<hand.length; n++){
                    if (lookFor == hand[n])
                        numDuplicates++;
                        
                }
                
                //Two matches are found -- only one duplicate may exist
                if(numDuplicates == 2){
                    totalDups++; //New counter is increased (necessary in case more than two instances of same number)
                    cardWithDuplicate = lookFor;
                    
                }
                else if(numDuplicates >= 3) //Ends loop if more than 3 duplicates found
                    duplicate = false;
                numDuplicates = 0; //Resets counter for next array search
            }
           //System.out.println("Exactly 1 duplicate: "+duplicate);    
           //System.out.println("Card With Duplicate: "+cardWithDuplicate);
           
           if (cardWithDuplicate != -1) {
                numOfDuplicates[12 - cardWithDuplicate] += 1;
           }
        }//end thousand loop
       
       System.out.println("Rank\tExactly One Duplicate");
       for(int i=0; i<13; i++){
            System.out.println(duplicateOut[i]+"\t"+numOfDuplicates[i]);    
       }
       
       
       
    }
    
}

