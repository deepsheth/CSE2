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
        
        if(input!=' ')  //will not run if user fails 5 attempts
          System.out.println("You entered '"+input+"'");
        
        //Runs overload 3
        input=getInput(scan,"Choose a digit.","0123456789");
        System.out.println("You entered '"+input+"'");
        
    } //end main  

    ///////////////
    // OVERLOAD 1
    ///////////////
    
    public static char getInput(Scanner scan, String contentToMatch) {
        String input;
        
        //Until return line is reached, program will continue looping code
        while (true) {
            input = scan.next();
            if (input.length() == 1) { //User will be forced to re-enter character, if longer than 1 digit
            
                //Tries to match user's input with a character from predefined string
                for (int i=0; i<contentToMatch.length(); i++) {
                    if (input.equals(""+contentToMatch.charAt(i))) //Returns when matched
                        return contentToMatch.charAt(i); 
                }
                    //User must re-enter character because match was not found
                    System.out.print("You did not enter a letter from " + contentToMatch + ". Try again: ");
            }
            else System.out.print("You can only enter a single character! Try again: ");
            
        } // end while
    } //end overload 1
    
    ///////////////
    // OVERLOAD 2
    ///////////////
    public static char getInput(Scanner scan, String contentToMatch, int attempts) {
        String input;
        int n = 0;
        
        //Until return line is reached, program will continue looping code
        while (true) {
            input = scan.next();
            if (input.length() == 1) { //User will be forced to re-enter character, if longer than 1 digit
                
                    //Tries to match user's input with a character from predefined string
                    for (int i=0; i<contentToMatch.length(); i++) {
                        if (input.equals(""+contentToMatch.charAt(i)))
                            return contentToMatch.charAt(i);
                    }
                    
                    //If match is not found, number of attempts are recorded
                    n++;
                    if (n>5) {
                        System.out.println("You have failed after five attempts.");
                        return ' '; //Stops asking user after 5 attempts - leaves method 
                    }
                    //User must re-enter character because match was not found
                    System.out.print("You did not enter a letter from " + contentToMatch + ". Try again: ");
            }
            else System.out.print("You can only enter a single character! Try again: ");
        } // end while
    } //end overload 2
    
    ///////////////
    // OVERLOAD 3
    ///////////////
    public static char getInput(Scanner scan, String prompt, String numbers) {
        String input;
        
        System.out.print(prompt + ":");
        for (int i=0; i<numbers.length()-1; i++)
            System.out.print(" '"+numbers.charAt(i)+"',");
        System.out.print(" '"+numbers.charAt(numbers.length()-1)+"': ");

        //Until return line is reached, program will continue looping code
        while (true) {
            input = scan.next();
            
            if (input.length() == 1) { //User will be forced to re-enter number, if longer than 1 digit
                
                    //Tries to match user's input with a character from predefined string of numbers
                    for (int i=0; i<numbers.length(); i++) {
                        if (input.equals(""+numbers.charAt(i)))
                            return numbers.charAt(i);
                    }
                    //User must re-enter character because match was not found
                    System.out.print("You did not enter a letter from " + numbers + ". Try again: ");
            }
            else System.out.print("You can only enter a single character! Try again: ");
        } // end while
    } //end overload 3
} // end class