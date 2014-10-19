// Deep Sheth
// dss218
// Number Stack Loop
// October 21, 2014
// Program outputs number a user entered using 3 different loops

import java.util.Scanner;

public class NumberStack {
    public static void main(String[] args) {
        
        //Allows console input
        Scanner input = new Scanner(System.in);
    
        //Variables
        int userNum = 0;
        int userNum2 = 0;
        int numLength = 0;
        
        
        System.out.print("Enter a number between 1 - 9: ");
        
        if (input.hasNextInt() == false) {
            System.out.println("You did not enter an integer between 1 -9.");
            return;   
        }
        else 
            userNum = input.nextInt();
            
        if (userNum < 1 || userNum > 9) {
            System.out.println("You did not enter an integer between 1 - 9.");
            return; 
        }
            
        userNum2 = userNum; //creates copy of variable userNum
        String space = "";  //variable initialized - will be used for adding spaces before numbers
        
        System.out.print("USING A FOR LOOP:");
        
        //PRINTS NUMBERS FROM 1 -> WHAT USER INPUTTED
        for (int a=0; a<=userNum; a++) { //Creates a new number
            numLength = (a*2)-1;         //How many digits will be printed of the number
  
            //PRINTS LINES OF THE NUMBER
            for(int b=0; b<a; b++) {           //number of lines of the number is outputted
            
                space = "%"+(userNum2+1)+"s";  //number of spaces to add before each line
                System.out.printf(space, "");  //prints spaces before new line
                
                //PRINTS INDIVIDUAL NUMBER
                for(int c=0; c<numLength; c++) { //number of times the number is outputted
                    System.out.print(a);         //Prints out the individual number
                }
                System.out.println();            //New line follows the line of the number outputtted
            }
            
            //PRINTS DASHES
            System.out.printf(space, "");    //Adds proper spacing before dashes
            for(int b=0; b<numLength; b++) { //Number of times dashes will be displayed after numbers are outputted
                System.out.print("-");
            }
            
            System.out.println(); // New line follows dashes
            userNum2--;           // Decreases space before new lines
        } //END OUT FOOR LOOP
        
        
        
        int a=0, b=0, c=0;
        System.out.println("USING A WHILE LOOP");
        


    }
}