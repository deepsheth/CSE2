// Deep Sheth
// dss218
// Poker Hands
// Dec. 5, 2014
// User picks 5 cards and program determines the rank of the cards

import java.util.Scanner;
import java.io.*;
public class PokerHands {
    public static void main(String[] args) {
        
        String[] suitChoices = {"C","D","H","S"};
        String[] cardChoices = {"2","3","4","5","6","7","8","9","0","J","Q","K","A"};
        String[] hand = {"-1","-1","-1","-1","-1"};
        String card="";
        String[] suitOut = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
        
        for(int i=0; i<hand.length; i++){
            boolean store = true;
            card = cardValidator(suitChoices, cardChoices, hand);
            
            for(int j=0; j<hand.length; j++){
                if (card.equals(hand[j])){
                    System.out.println("** You already picked this card. Pick another card. **");
                    i--;
                    store = false;
                    break;
                }
            }
            if(store)
                hand[i] = card;
        }

        output(suitOut, hand);
        rank(hand);
    }
    
    public static String cardValidator(String[] suitChoices, String[] cardChoices, String[] hand) {
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        String suit = "";
        String num = "";

            do {
                System.out.print("Please pick a suit (C, D, H, S) :");
                suit = input.next().toUpperCase(); // Input is not case-sensitive

                //Checks if user picked a card that can exist
                for(int i=0; i<suitChoices.length; i++){
                    if (suit.equals(suitChoices[i]))
                        valid = true;
                }
                
                if(!valid)
                    System.out.println("** You did not enter a vaild card suit. Try again. **");
            }
            while (!valid); //Loops if input is improper
            
            valid = false; //Resets back
            
            do {
                System.out.print("Please pick a card (A, Q, K, J, 10, 9, 8 ... 2 :");
                num = input.next().toUpperCase(); // Input is not case-sensitive
                
                //Program will interpret card 10 as number 0
                if(num.equals("0")) {
                    System.out.println("** You did not enter a vaild card number/letter. Try again. **");
                    continue;
                }
                else if (num.equals("10"))
                    num = "0";
                    
                //Checks if user picked a card that can exist
                for(int i=0; i<cardChoices.length; i++){
                    if (num.equals(cardChoices[i]))
                        valid = true;
                }
                
                if(!valid)
                    System.out.println("** You did not enter a vaild card number/letter. Try again. **");
            }
            while (!valid); //Loops if input is improper

        return suit+num;

    }//end method
    
    public static void output(String[] suitOut, String[] hand) {
        
        for(int i=0; i<suitOut.length; i++) {
            char suit = hand[i].charAt(0);
            char num = hand[i].charAt(1);
            
            //Finds & stores all club cards to output variable
            for(int j=0; j<hand.length && i==0; j++){
                if (hand[j].charAt(0) == 'C'){
                    if (hand[j].charAt(1) == '0')    
                        suitOut[i] += "10" + " ";
                    else
                        suitOut[i] += hand[j].charAt(1) + " ";
                }
            }
            
            //Finds & stores all diamonds cards to output variable
            for(int j=0; j<hand.length && i==1; j++){
                if (hand[j].charAt(0) == 'D')
                    suitOut[i] += hand[j].charAt(1) + " ";
            }
            
            //Finds & stores all hearts cards to output variable
            for(int j=0; j<hand.length && i==2; j++){
                if (hand[j].charAt(0) == 'H')
                    suitOut[i] += hand[j].charAt(1) + " ";
            }
            
            //Finds & stores all club cards to output variable
            for(int j=0; j<hand.length && i==3; j++){
                if (hand[j].charAt(0) == 'S')
                    suitOut[i] += hand[j].charAt(1) + " ";
            }
        }
        
        //Outputs hand
        for(int i=0; i<suitOut.length; i++) {
            System.out.println(suitOut[i]);
        }
    }
    
    public static void rank(String[] hand) {
        int[] handNum = new int[5];
        
        for(int i=0; i<hand.length; i++){
            switch(hand[i].charAt(1)){
                case 'A': handNum[i] = 14; break;
                case 'K': handNum[i] = 13; break;
                case 'Q': handNum[i] = 12; break;
                case 'J': handNum[i] = 11; break;
                case '0': handNum[i] = 10; break;
                default: handNum[i] = Character.getNumericValue(hand[i].charAt(1)); break;
            }
        }
        
        // SELECTION SORT on hand numbers
        for (int a=0; a<handNum.length-1; a++) {
            int minimum = handNum[a];
            for (int b=a+1; b<handNum.length; b++){
                if (handNum[b] < minimum) {
                    minimum = handNum[b];
                    handNum[b] = handNum[a];
                    handNum[a] = minimum;
                    
                    
                }
            }
        }
        
        // Requirements for ROYAL/STRAIGHT FLUSH
        boolean consecutive = false;
        boolean sameSuit = false;
        boolean consecutive3 = false;
        boolean consecutive4 = false;
        
        // Checks if hand has consecutive numbers
        for(int i=0, j=0; i<handNum.length-1; i++) {
            if (handNum[i] == handNum[i+1]-1)
                j++; // Counts number of consecutive numbers
            if (j==3)
                consecutive4 = true;
            else if (j==4){
                consecutive = true;
                // If card numbers are consecutive, checks if suits are all same
                for(int k=0, l=0; k<hand.length-1; k++) {
                    if (hand[k].charAt(0) == hand[k+1].charAt(0))
                        l++; // Counts number of consecutive suits
                    if (l==4)
                        sameSuit = true;
                }
            }
        }
        
        // When suits match and numbers are consecutive 
        if (consecutive && sameSuit) {
            // Outputs type of FLUSH
            for (int i=0; i<handNum.length; i++) {
                if (handNum[i] == 10-i) {
                    System.out.println("This is a royal flush.");
                    return;
                }
                else {
                    System.out.println("This is a straight flush.");
                    return;
                }
            }
        }
        
        // FOUR OF A KIND Test
        if (consecutive4) {
            System.out.println("You have Four of a Kind.");
            return;
        }
        
    }
}