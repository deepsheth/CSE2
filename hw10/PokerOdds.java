// Deep Sheth
// dss218
// Find Duplicates
// Nov. 18, 2014
// Program generates poker hand from deck of cards and measures probability

import java.util.Random;
import java.util.Scanner;

public class PokerOdds{
    public static void main(String [] arg){
        showHands();
        //simulateOdds();
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
                int cardRandom = (int)(Math.random() * (52-i));
                
                hand[i] = deck[cardRandom];
                deck[cardRandom] = deck[51-i];
                deck[51-i] = -1;
                int card = hand[i];
                
                
                cardNum = cardNum(card);
                suitType = suitType(card);
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
    
    // public static void simulateOdds(String[] hand) {
    //     FindDuplicates.exactlyOneDup(cards);
    // }
}

