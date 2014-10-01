// Deep Sheth
// dss218
// Boola Boola
// September 30, 2014
// Program will randomly generate three booleans combined with two random operators && or ||. 
// User will guess if the booleans evaluate to true/false. Computer will return the true answer.

//Method import
import java.util.Scanner;

public class BoolaBoola {
    public static void main(String[] args) {
        
        //Scanner allows console input
        Scanner input = new Scanner(System.in);
        
        //Delcare 5 random variables
        int ran1 = (int)(Math.random()*10+1);
        int ran2 = (int)(Math.random()*10+1);
        int ran3 = (int)(Math.random()*10+1);
        int ran4 = (int)(Math.random()*10+1);
        int ran5 = (int)(Math.random()*10+1);
        
        //Initializes 5 variables that will be later printed
        boolean bool1 = false; 
        String compare1="||";
        String compare2 = "||";
        boolean bool2 = false;
        boolean bool3 = false;

        
        if (ran1 <= 5)        //First boolean is assigned random value
            bool1 = true;
        else if (ran2 <= 5)   //First operator is assigned random value
            compare1 = "&&";
        else if (ran3 <= 5) 
            bool2 = true;     //Second boolean is assigned raondom value
        else if (ran4 <= 5)
            compare2 = "&&";  //Second operator is assigned random value
        else if (ran5 <= 5)
            bool3 = true;     //Thrid boolean is assigned random value
        
        
        //Asks user to guess output
        System.out.println("Does "+bool1+" "+compare1+" "+bool2+" "+compare2+" "+bool3+" have the value true (T/t) or false (F/f)?");
        System.out.print("Your answer: ");
        String userResponse = input.next();
        boolean userAnswer; //User's answer
        boolean compAnswer; //Actual answer
        
        //Error is user enters multiple letters
        if (userResponse.length() > 1) {
            System.out.println("You did entered " + userResponse.length() + " letters. Please enter one.");
            return;
        }
        
        switch (userResponse) {
            //CASE T
            case "T":
            case "t":
                userAnswer = true; //User inputs true
                
                //Program will determine the value of the two random operators and determine if the user's answer is correct
                //Output will be printed according to this
                
                if (compare1.equals("&&") && compare2.equals("&&")) {
                    compAnswer = bool1 && bool2 && bool3;
                    
                    if (compAnswer == userAnswer) 
                        System.out.println("Correct!");
                    else 
                        System.out.println("Incorrect! Try Again.");
                }
                
                else if (compare1.equals("&&") && compare2.equals("||")) {
                     compAnswer = bool1 && bool2 || bool3;
                    
                    if (compAnswer == userAnswer) 
                        System.out.println("Correct!");
                    else 
                        System.out.println("Incorrect! Try Again.");
                }
                
                else if (compare1.equals("||") && compare2.equals("||")) {
                     compAnswer = bool1 || bool2 || bool3;
                    
                    if (compAnswer == userAnswer) 
                        System.out.println("Correct!");
                    else 
                        System.out.println("Incorrect! Try Again.");
                }
                
                else if (compare1.equals("||") && compare2.equals("&&")) {
                     compAnswer = bool1 || bool2 && bool3;
                    
                    if (compAnswer == userAnswer) 
                        System.out.println("Correct!");
                    else 
                        System.out.println("Incorrect! Try Again.");
                }
                break;
                
            //CASE F  
            case "F":
            case "f":
                
                //Program will determine the value of the two random operators and determine if the user's answer is correct
                //Output will be printed according to this
                
               userAnswer = false;
                if (compare1.equals("&&") && compare2.equals("&&")) {
                    compAnswer = bool1 && bool2 && bool3;
                    
                    if (compAnswer == userAnswer) 
                        System.out.println("Correct!");
                    else 
                        System.out.println("Incorrect! Try Again.");
                }
                
                else if (compare1.equals("&&") && compare2.equals("||")) {
                     compAnswer = bool1 && bool2 || bool3;
                    
                    if (compAnswer == userAnswer) 
                        System.out.println("Correct!");
                    else 
                        System.out.println("Incorrect! Try Again.");
                }
                
                else if (compare1.equals("||") && compare2.equals("||")) {
                     compAnswer = bool1 || bool2 || bool3;
                    
                    if (compAnswer == userAnswer) 
                        System.out.println("Correct!");
                    else 
                        System.out.println("Incorrect! Try Again.");
                }
                
                else if (compare1.equals("||") && compare2.equals("&&")) {
                     compAnswer = bool1 || bool2 && bool3;
                    
                    if (compAnswer == userAnswer) 
                        System.out.println("Correct!");
                    else 
                        System.out.println("Incorrect! Try Again.");
                }
                break;
                
            //If user does not enter T or F
            default:
                System.out.println("You did not enter a letter listed above.");
                break;
                
        }// END switch 
        
    }//END main
}//END class
