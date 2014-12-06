// Deep Sheth
// dss218
// Poker Hands
// Dec. 5, 2014
// User picks 5 cards and program determines the rank of the cards

import java.util.Scanner;
import java.io.*;
public class PokerHands {
    public static void main(String[] args) {
        
        // Variables for card
        String[] suitChoices = {"C","D","H","S"};
        String[] cardChoices = {"2","3","4","5","6","7","8","9","0","J","Q","K","A"};
        String card="";
        // Variables to draw new hand
        Scanner input = new Scanner(System.in);
        String repeat = "";
        
        do {
            // Hand elements are initialized to -1
            String[] hand = {"-1","-1","-1","-1","-1"};
            
            // Runs 5 times, for 5 cards in hand
            for(int i=0; i<hand.length; i++){
                boolean store = true; //variable resets/initializes
                
                // Determines if user's pick is a card that can exist
                card = cardValidator(suitChoices, cardChoices, hand);
                
                // Determines if user has already picked this card
                for(int j=0; j<hand.length; j++){
                    if (card.equals(hand[j])){
                        System.out.println("** You already picked this card. Pick another card. **");
                        i--;
                        store = false;
                        break;
                    }
                }
                if(store) // Users pick is added to the hand
                    hand[i] = card; 
            }

        output(hand); //Outputs hand
        rank(hand); // Outputs hand ranking
        
        // If user inputs Y/y, program will loop
        System.out.print("Enter 'y' or 'Y' to continue: ");
        repeat = input.next(); 
        System.out.println();
        } while (repeat.equals("y") || repeat.equals("Y"));
        
    }
    
    // CHECKS IF CARD CAN EXIST
    public static String cardValidator(String[] suitChoices, String[] cardChoices, String[] hand) {
        //Intializes/resets variables
        Scanner input = new Scanner(System.in);
        boolean valid = false;
        String suit = "";
        String num = "";

            // CHECKS USER SUIT
            do {
                System.out.print("Please pick a suit (C, D, H, S) :");
                suit = input.next().toUpperCase(); // Input does not have to be case-sensitive

                //Checks if user picked a suit that can exist
                for(int i=0; i<suitChoices.length; i++){
                    if (suit.equals(suitChoices[i]))
                        valid = true;
                }
                
                if(!valid)
                    System.out.println("** You did not enter a vaild card suit. Try again. **");
            }
            while (!valid); //Loops if input is improper
            valid = false; //Resets back
            
            // CHECKS USER CARD NUMBER
            do { 
                System.out.print("Please pick a card (A, K, Q, J, 10, 9, 8 ... 2 :");
                num = input.next().toUpperCase(); // Input does not have to be case-sensitive
                
                // User cannot pick number 0
                if(num.equals("0")) {
                    System.out.println("** You did not enter a vaild card number/letter. Try again. **");
                    continue;
                }
                // Program will interpret card 10 as number 0 (see method return below)
                else if (num.equals("10"))
                    num = "0";
                    
                // Checks if user picked a card number/letter that can exist
                for(int i=0; i<cardChoices.length; i++){
                    if (num.equals(cardChoices[i]))
                        valid = true;
                }
                
                if(!valid)
                    System.out.println("** You did not enter a vaild card number/letter. Try again. **");
            }
            while (!valid); //Loops if input is improper

        return suit+num; //Hand elements will have format [suit+number] ex: [h3] for 3 of Hearts 

    }//end method
    
    public static void output(String[] hand) {
        String[] suitOut = {"Clubs: ", "Diamonds: ", "Hearts: ", "Spades: "};
        
        System.out.println("\nYour hand:");
        for(int i=0; i<suitOut.length; i++) {
            // Separates elements in hand (ex: [h3] becomes 'h' '3')
            char suit = hand[i].charAt(0);
            char num = hand[i].charAt(1);
            
            //Finds & stores all picked CLUB cards to output variable
            for(int j=0; j<hand.length && i==0; j++){
                if (hand[j].charAt(0) == 'C'){
                    if (hand[j].charAt(1) == '0')    
                        suitOut[i] += "10" + " ";
                    else
                        suitOut[i] += hand[j].charAt(1) + " ";
                }
            }
            
            //Finds & stores all picked DIAMONDS cards to output variable
            for(int j=0; j<hand.length && i==1; j++){
                if (hand[j].charAt(0) == 'D') {
                    if (hand[j].charAt(1) == '0')    
                        suitOut[i] += "10" + " ";
                    else
                        suitOut[i] += hand[j].charAt(1) + " ";
                }
            }
            
            //Finds & stores all picked HEARTS cards to output variable
            for(int j=0; j<hand.length && i==2; j++){
                if (hand[j].charAt(0) == 'H') {
                    if (hand[j].charAt(1) == '0')    
                        suitOut[i] += "10" + " ";
                    else
                        suitOut[i] += hand[j].charAt(1) + " ";
                }
            }
            
            //Finds & stores all picked CLUB cards to output variable
            for(int j=0; j<hand.length && i==3; j++){
                if (hand[j].charAt(0) == 'S') {
                    if (hand[j].charAt(1) == '0')    
                        suitOut[i] += "10" + " ";
                    else
                        suitOut[i] += hand[j].charAt(1) + " ";
                }
            }
        }
        
        //Outputs hand
        for(int i=0; i<suitOut.length; i++) {
            System.out.println(suitOut[i]);
        }
    }
    
    // OUTPUTS CARDS RANKS
    public static void rank(String[] hand) {
        int[] handNum = new int[5]; // New hand array to hold numbers not Strings

        // Gives letters numerical values
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
        boolean consecutive = false, sameSuit = false, fullHouse = false;
        
        // Checks if hand has consecutive numbers
        for(int i=0, j=0; i<handNum.length-1; i++) {
            if (handNum[i] == handNum[i+1]-1)
                j++; // Counts number of consecutive numbers
            if (j==4){
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
        
        // When suits match and numbers are consecutive, outputs type of flush
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
        
        // FOUR OF A KIND Test 1
        for(int i=0, j=0, lookFor=handNum[0]; i<hand.length-1; i++){
            if(lookFor == handNum[i]) {
                j++;
                if (j==4) {
                    System.out.println("This is Four of a Kind.");
                    return;
                }
            }
        }
        
        // FOUR OF A KIND Test 2
        for(int i=1, j=0, lookFor=handNum[1]; i<hand.length; i++){
            if(lookFor == handNum[i]) {
                j++;
                if (j==4) {
                    System.out.println("This is Four of a Kind.");
                    return;
                }
            }
        }
            
        // FULL HOUSE & THREE OF A KIND Test 1 (ex. hand: 2,2,2,4,4)
        boolean pairLeft = false, pairMiddle = false, pairRight = false;
        for(int i=0, j=0; i<hand.length-2; i++){
            if(handNum[0] == handNum[i]) {
                j++;
                if (j==3) { // If first three cards equal
                    for(int k=3, l=0; k<hand.length; k++){
                        if(handNum[3] == handNum[k]) {
                            l++;
                            if (l==2) { //If last two cards equal
                                System.out.println("This is a Full House.");
                                return;
                            }
                        }
                        if (k>3 && l==1) { //If last two cards do not equal
                                System.out.println("This is Three of a Kind.");
                                return;
                        }
                    }
                }
                if (j==2)
                    pairLeft = true;
            }
        }
        
        // FULL HOUSE & THREE OF A KIND Test 2 (ex. hand: 4,4,2,2,2)
        for(int i=2, j=0; i<hand.length; i++){
            if(handNum[2] == handNum[i]) {
                j++;
                if (j==3) { //If last three cards equal
                    for(int k=0, l=0; k<hand.length-3; k++){
                        if(handNum[0] == handNum[k]) {
                            l++;
                            if (l==2) { //If first two cards equal
                                System.out.println("This is a Full House.");
                                return;
                            }
                        }
                        System.out.println("l: "+l+" K: "+k);
                        if (k>0 && l==1) { //If first two cards do not equal
                                System.out.println("This is Three of a Kind.");
                                return;
                            }
                    }
                }
                if (j==2)
                    pairRight = true;
            }
        }
        
        // THREE OF A KIND test (ex. hand: 2,4,4,4,2)
        for(int i=1, n=0; i<hand.length-1; i++){
            if(handNum[1]==handNum[i]){
                n++;
                if(n==3){ //If middle three cards equal
                    System.out.println("This is Three of a Kind.");
                    return;
                }
                else if (n==2)
                    pairMiddle = true;
            }
        }
        
        // FLUSH
        for(int k=0, l=0; k<hand.length; k++) {
            if (hand[0].charAt(0) == hand[k].charAt(0))
                l++; // Counts number of consecutive suits
            if (l==5){
                System.out.println("This is a flush.");
                return;
            }
        }
        
        // STRAIGHT
        if (consecutive){
            System.out.println("This is a straight.");
            return;
        }
        
        //TWO/ONE/NO PAIR
        if ((pairLeft && pairMiddle) || (pairLeft && pairRight)) {
            System.out.println("This has Two Pairs.");
            return;
        }
        else if (pairLeft || pairMiddle || pairRight){
            System.out.println("This has One Pair.");
            return;
        }
        else {
            System.out.println("This has No Pairs.");
            return;
        }
    }
}