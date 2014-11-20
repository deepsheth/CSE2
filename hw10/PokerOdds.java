// Deep Sheth
// dss218
// Find Duplicates
// Nov. 18, 2014
// Program generates poker hand from deck of cards and measures probability of picking a hand with exactly one duplicate

import java.util.Random;
import java.util.Scanner;

public class PokerOdds{
    public static void main(String [] arg){
        showHands(); //Outputs hands in card
        simulateOdds(); //Outputs probability of finding duplicates
    }

    public static void showHands(){
        //Variables
        String userContinue = "";
        Scanner input=new Scanner(System.in);
        int[] hand = {-1, -1, -1, -1, -1};
        
        do {
            //Variables inside loop
            int[] deck = new int[52];
            String[] suitOut = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
            String cardNum = "";
            String suitType = "";
            
            //Initializes all hand array elements to -1
            for(int i=0; i<5; i++)
                hand[i] = -1;
                
            //Gives deck of cards values
            for(int i=0; i<deck.length; i++)
                deck[i] = i;
        
            //For each card in hand, loop runs
            for (int i=0; i<5; i++){    
                //Num of deck cards generated decreases by 1 each run
                int card = (int)(Math.random() * (52-i));
                
                hand[i] = deck[card]; //Card in hand becomes card picked from deck
                deck[card] = deck[51-i]; //Card spot picked in deck now equals last card in deck
                deck[51-i] = -1; //Last number in deck becomes -1
            
                int cardRandom = hand[i];//cardRandom is card picked in hand
                cardNum = cardNum(cardRandom);   //Returns card number/letter
                suitType = suitType(cardRandom); //Returns card suit

                //Output array combines suits and card numbers
                switch(suitType) {
                    case "Clubs":
                        suitOut[0] += cardNum + " ";
                        break;
                    case "Diamonds":
                        suitOut[1] += cardNum + " ";
                        break;
                    case "Hearts":
                        suitOut[2] += cardNum + " ";
                        break;
                    case "Spades": 
                        suitOut[3] += cardNum + " ";
                        break;
                }
            } // end iteration for each card
            
            //Outputs suits & cards picked from suit
            for(int i=0; i<suitOut.length; i++)
                System.out.println(suitOut[i]);

            //If user enters "Y/y", program will continue running using DO/WHILE loop
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            userContinue=input.next();
        } while (userContinue.equals("Y") || userContinue.equals("y"));
    }// end main
    
    
    //Method returns number/letter of card
    public static String cardNum(int cardRandom) {
        String cardNum;
        
        switch(cardRandom%13){
            //Cases where card in a letter, not number
            case 0: cardNum = "A";
                break;
            case 1: cardNum = "K";
                break;
            case 2: cardNum = "Q";
                break;
            case 3: cardNum = "J";
                break;
            default: //card is a number
                cardNum = ""+(14 - (cardRandom%13));
        }
        return cardNum;
    }//end method
    
    //Method returns type of suit of random card picked
    public static String suitType(int cardRandom) {
        String suitType = "";
        int suit = (int)(cardRandom/13 + 0.5); 
        
        //Depending on calculation above, card suit is determined
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
    
    //Outputs probability of finding duplicates
    public static void simulateOdds() {
        //Variables
        int[] hand = {-1, -1, -1, -1, -1}; 
        String[] duplicateOut = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        int[] numOfDuplicates = new int[13]; //Stores number of duplicates of each card number
        
        for(int z = 0; z<10000; z++){   
            //Variables
            int[] deck = new int[52];
            String[] suitOut = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
            String cardNum = "";
            String suitType = "";
            
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
                int cardRandom = hand[i];
                cardNum = cardNum(cardRandom);
            }
            
            //Hand becomes a number from 0-12 instead of 0-51
            for(int i=0; i<5; i++)
                hand[i] = hand[i]%13;
            
            //Counters
            int numDuplicates = 0;
            int totalDups = 0;
            int cardWithDuplicate = -1; //number that duplicates once in hand
           
            //Loop provides number to look for in array
            for(int i=0; i<hand.length; i++, numDuplicates=0){ //Resets counter for next array search
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
                    break;
            }
           
            if (cardWithDuplicate != -1) 
                numOfDuplicates[12 - cardWithDuplicate] += 1; //Increases number with duplicate by one (output is descending)
        }//end ten thousand iterations
       
       //Outputs number of duplicates of each card
        System.out.println("\nRank\tExactly One Duplicate");
        for(int i=0; i<13; i++)
            System.out.println(duplicateOut[i]+"\t"+numOfDuplicates[i]);    
        System.out.println("________________________________");
        
        //Outputs times a deck does not have exactly one pair
        System.out.print("Total not exactly one pair: ");
        int sum =0;
        for(int i=0; i<numOfDuplicates.length; i++)
            sum += numOfDuplicates[i];
        System.out.println(10000-sum);
    }
}