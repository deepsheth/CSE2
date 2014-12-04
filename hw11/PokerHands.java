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
            System.out.println(card);
            
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
                if(num.equals("0"))
                    continue;
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
            
            for(int j=0; j<hand.length && i==0; j++){
                if (hand[j].charAt(0) == 'C'){
                    suitOut[0] += hand[j].charAt(1) + " ";
                }
            }
            
            for(int j=0; j<hand.length && i==1; j++){
                if (hand[j].charAt(0) == 'D'){
                    suitOut[1] += hand[j].charAt(1) + " ";
                }
            }
            
            for(int j=0; j<hand.length && i==2; j++){
                if (hand[j].charAt(0) == 'H'){
                    suitOut[2] += hand[j].charAt(1) + " ";
                }
            }
            
            for(int j=0; j<hand.length && i==3; j++){
                if (hand[j].charAt(0) == 'S'){
                    suitOut[3] += hand[j].charAt(1) + " ";
                }
            }
        }
        
        for(int i=0; i<suitOut.length; i++) {
            System.out.println(suitOut[i]);
        }
    }
}