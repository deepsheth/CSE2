// Deep Sheth
// dss218
// Find Duplicates
// Nov. 18, 2014
// Program generates poker hand from deck of cards and measures probability

import java.util.Random;
import java.util.Scanner;
public class PokerOdds{
    int test = 0;
    public static void main(String [] arg){
        //showHands();
        simulateOdds();
    }

    public static void showHands(){
        String answer = "";
        Scanner input=new Scanner(System.in);
        int[] hand = {-1, -1, -1, -1, -1};
        
        do {
            
            int[] deck = new int[52];
            String[] suitOut = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
            String cardNum = "";
            String suitType = "";
            String space = " ";
            
            for(int i=0; i<5; i++)
                hand[i] = -1;
                
            //Gives deck of cards values
            for(int i=0; i<deck.length; i++)
                deck[i] = i;
        
        
            for (int i=0; i<5; i++){    
                int card = (int)(Math.random() * (52-i));
                
                hand[i] = deck[card];
                deck[card] = deck[51-i];
                deck[51-i] = -1;
                int cardRandom = hand[i];
                
                
                cardNum = cardNum(cardRandom);
                suitType = suitType(cardRandom);
                // System.out.println("Random number: "+cardRandom);
                // System.out.println("Suit: "+suitType+"   Number: "+cardNum);
                
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
            
            
            for(int i=0; i<suitOut.length; i++)
                System.out.println(suitOut[i]);
                
            
        
        
        
            //If user enters "Y/y", program will continue running using DO/WHILE loop
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=input.next();
        } while (answer.equals("Y") || answer.equals("y"));    
        
        
    }// end main
    
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
    
    public static String suitType(int cardRandom) {
        int suit = (int)(cardRandom/13 + 0.5);
        String suitType = "";
        
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
    
    public static void simulateOdds() {
        String answer = "";
        int[] hand = {-1, -1, -1, -1, -1};
        String[] duplicateOut = {"A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"};
        int[] numOfDuplicates = new int[13];
        
    for(int z = 0; z<10000; z++){    
        int[] deck = new int[52];
        String[] suitOut = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
        String cardNum = "";
        String suitType = "";
        String space = " ";
        Boolean duplicate;
        int cardRandom;
        
        for(int i=0; i<5; i++)
            numOfDuplicates[i] = 0;
            
        for(int i=0; i<5; i++)
            hand[i] = -1;
            
        //Gives deck of cards values
        for(int i=0; i<deck.length; i++)
            deck[i] = i;
    
    
        for (int i=0; i<5; i++){    
            int card = (int)(Math.random() * (52-i));
            
            hand[i] = deck[card];
            deck[card] = deck[51-i];
            deck[51-i] = -1;
            cardRandom = hand[i];
            
            
            cardNum = cardNum(cardRandom);
            //System.out.println("Card Number: "+cardNum);
            
            
            
        }
        
        for(int i=0; i<5; i++){
            hand[i] = hand[i]%13;
            //System.out.println("Hand divided: "+hand[i]);
        }
        
        
        
       //duplicate = FindDuplicates.exactlyOneDup(hand);
       
       
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
        
        
        if (totalDups == 2)
            duplicate = true; //If pair exists, returns true
        else {
            duplicate = false;
        }    
       //System.out.println("Exactly 1 duplicate: "+duplicate);    
       //System.out.println("Card With Duplicate: "+cardWithDuplicate);
       
       if (cardWithDuplicate != -1) {
     //  numOfDuplicates[14 - cardWithDuplicate%13] += 1;
         numOfDuplicates[cardWithDuplicate] += 1;
       }
    }//end thousand loop
       
       System.out.println("Rank\tExactly One Duplicate");
       for(int i=0; i<13; i++){
            System.out.println(duplicateOut[i]+"\t"+numOfDuplicates[i]);    
       }
       
       
       
    }
    
}

