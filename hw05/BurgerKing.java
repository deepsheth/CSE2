// Deep Sheth
// dss218
// September 30, 2014
// User will choose the type of burger, soda, and fries they would like to order by entering a letter.

//Method
import java.util.Scanner;

public class BurgerKing {
    public static void main(String[] args) {
        
        //Allows console input
        Scanner input = new Scanner(System.in);
        
        //Asks what user would like to order
        System.out.println("Enter a letter to indicate the choice of:");
        System.out.println("\tBurger (B/b)");
        System.out.println("\tSoda (S/s)");
        System.out.println("\tFries (F/f)");
        System.out.print("Your choice: ");
        
        //Stores user input in variable
        String orderResponse = input.next();
        
        
        //Based on user's response, program asks futher questions
        switch (orderResponse) {
            
            //Burger case
            case "B":
            case "b":
                
                //Asks user to specify type of burger
                System.out.println("What would you like on your burger?");
                System.out.println("\t'All of the fixens' (A/a)");
                System.out.println("\tCheese (C/c)\n\tNo toppings (N/n)");
                System.out.print("Your choice: ");
                String burgerChoice = input.next(); //Stores input in variable
                
                //Outputs what type of burger was ordered
                switch (burgerChoice) {
                    case "A":
                    case "a":
                        System.out.println("You ordered a burger with all fixens.");
                        break;
                    case "C":
                    case "c":
                        System.out.println("You ordered a burger with cheese");
                        break;
                    case "N":
                    case "n":
                        System.out.println("You ordered a burger with no toppings.");
                        break;
                    default:
                        System.out.println("You did not choose a letter from the options.");
                        break;
                }
                break; //End B case
            
            //Soda case
            case "S":
            case "s":
                
                //Asks user to specify type of soda
                System.out.println("What type of soda would you like?");
                System.out.println("\tPepsi (P/p)\n\tCoke (C/c)\n\tSprite (S/s)\n\tMtn. Dew (D/d)");
                System.out.print("Your choice: ");
                String sodaChoice = input.next(); // Stores input into variable
                
                //Outputs what type of soda was ordered
                switch (sodaChoice) {
                    case "P":
                    case "p":
                        System.out.println("You ordered Pepsi.");
                        break;
                    case "C":
                    case "c":
                        System.out.println("You ordered Coke.");
                        break;
                    case "S":
                    case "s":
                        System.out.println("You ordered Sprite.");
                        break;
                    case "D":
                    case "d":
                        System.out.println("You ordered Mountain Dew.");
                        break;
                    default:
                        System.out.println("You did not choose a letter from the options.");
                        break;
                }
                break; //End S case 
              
            //Fries case 
            case "F":
            case "f":
                
                //Asks user to specify type of fries
                System.out.println("Do you want large (L/l) or small (S/s) fries?");
                System.out.print("Your choice: ");
                String friesChoice = input.next(); //Stores input into variable
                
                //Outputs type of fries ordered
                switch(friesChoice) {
                    case "L":
                    case "l":
                        System.out.println("You ordered large fries.");
                        break;
                    case "S":
                    case "s":
                        System.out.println("You ordered small fries.");
                        break;
                    default:
                        System.out.println("You did not choose a letter from the options.");
                        break;
                }
                break; //End F case
            
            //If none of cases are met, then the user did not enter a proper letter
            default:
                System.out.println("Sorry. You did not choose a letter from the menu.");
                break;
        }//End userResponse case
    }//End main
}//End class