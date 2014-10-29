// Deep Sheth
// dss218
// Method Overloads
// October 28, 2014
// Program matches user input with pre-defined text/numbers

import java.util.Scanner;

public class HW8{
    
    ///////////////
    // MAIN METHOD
    ///////////////
    public static void main(String[] args) {
        
        char input;
        
        //Asks user to input character then runs overload 1
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit: ");
        input=getInput(scan,"Cc");

        //Displays what user entered
        System.out.println("You entered: " + input);
        
        //Asks user to input character then runs overload 2
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        input=getInput(scan,"yYnN",5); //give up after 5 attempts
        
        if(input!=' '){  //will not run if user fails 5 attempts
          System.out.println("You entered '"+input+"'");
        }
        
        //Runs overload 3
        input=getInput(scan,"Choose a digit.","0123456789");
        System.out.println("You entered '"+input+"'");
        
        }  

    ///////////////
    // OVERLOAD 1
    ///////////////
    
    public static char getInput(Scanner scan, String contentToMatch) {
        String input;
        
        while (true) {
            input = scan.next();
            if (input.length() == 1) {
                for (int i=0; i<contentToMatch.length(); i++) {
                    if (input.equals(""+contentToMatch.charAt(i))){
                        return contentToMatch.charAt(i);
                    }
                }
                    System.out.print("You did not enter a letter from " + contentToMatch + ". Try again: ");
            }
            else System.out.print("You did not enter a single character! Try again: ");
            
        } // end while
    } //end overload 1
    
    ///////////////
    // OVERLOAD 2
    ///////////////
    public static char getInput(Scanner scan, String contentToMatch, int attempts) {
        String input;
        int n = 0;
        
        while (true) {
            input = scan.next();
            
            if (input.length() == 1) {
                
                    for (int i=0; i<contentToMatch.length(); i++) {
                        if (input.equals(""+contentToMatch.charAt(i))){
                            return contentToMatch.charAt(i);
                        }
                    }
                    n++;
                    if (n>5) {
                        System.out.println("You have failed after five attempts.");
                        return ' ';
                    }
                    System.out.print("You did not enter a letter from " + contentToMatch + ". Try again: ");
            }
            else System.out.print("You did not enter a single character! Try again: ");
        } // end while
    } //end overload 1
    
    ///////////////
    // OVERLOAD 3
    ///////////////
    public static char getInput(Scanner scan, String prompt, String numbers) {
        String input;
        
        System.out.print(prompt + ":");
        for (int i=0; i<numbers.length()-1; i++)
            System.out.print(" '"+numbers.charAt(i)+"',");
        System.out.print(" '"+numbers.charAt(numbers.length()-1)+"': ");

        while (true) {
            input = scan.next();
            
            if (input.length() == 1) {
                
                    for (int i=0; i<numbers.length(); i++) {
                        if (input.equals(""+numbers.charAt(i))){
                            return numbers.charAt(i);
                        }
                    }
                    
                    System.out.print("You did not enter a letter from " + numbers + ". Try again: ");
            }
            else System.out.print("You did not enter a single character! Try again: ");
        } // end while
    } //end overload 1
}