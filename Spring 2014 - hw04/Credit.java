// PROGRAM 3

import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first four digits of your credit card number: ");
        String cardNum = input.next();
        char digit1 = cardNum.charAt(0);
        char digit2 = cardNum.charAt(1);
        String cardType = "";
        
        if (cardNum.length() == 4) {
            if (cardNum.equals("6011"))
                cardType = "Discover";
            else if (digit1 == '5' && digit2 == '0')
                cardType = "MasterCard";
            else if (digit1 == '3' && digit2 == '0')
                cardType = "Diner's Club";
            else if (digit1 == '3' && digit2 == '6')
                cardType = "Diner's Club International";
            else if (digit1 == '4' && digit2 == '0')
                cardType = "Visa";
        }  
        
        if (cardType.equals("")) {
            System.out.println("You did not enter a valid credit card number\nPlease enter an integer within the range [1000,9999].");
            System.exit(0);
        }
        else
            System.out.println("You have a "+cardType+" credit card.");
    }
}