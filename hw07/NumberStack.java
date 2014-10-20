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
        
        //Makes sure input is an integer within the range
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
        
        /////////////////////////////////////
        ///// USING FOR LOOP
        /////////////////////////////////////
        
        System.out.print("USING A FOR LOOP:");
        
        //PRINTS NUMBERS FROM 1 -> WHAT USER INPUTTED
        for (int a=0; a<=userNum; a++) { //Creates a new number
            numLength = (a*2)-1;         //How many digits will be printed of the number
  
            //PRINTS LINES OF THE NUMBER
            for(int b=0; b<a; b++) {           //number of lines of the number is outputted
            
                space = "%"+(userNum2+1)+"s";  //number of spaces to add before each line
                System.out.printf(space, "");  //prints spaces before new line
                
                //PRINTS INDIVIDUAL NUMBER
                for(int c=0; c<numLength; c++)   //number of times the number is outputted
                    System.out.print(a);         //Prints out the individual number
                System.out.println();            //New line follows the line of the number outputtted
            }
            
            //PRINTS DASHES
            System.out.printf(space, "");    //Adds proper spacing before dashes
            for(int b=0; b<numLength; b++)   //Number of times dashes will be displayed after numbers are outputted
                System.out.print("-");
                
            System.out.println(); // New line follows dashes
            userNum2--;           // Decreases space before new lines
        } //END OUT FOOR LOOP
        
        /////////////////////////////////////
        ///// USING WHILE LOOP
        /////////////////////////////////////
        
        System.out.print("USING A WHILE LOOP");
        int a=0, b, c;
        userNum2 = userNum; //Resets value of userNum2
        
        while (a<=userNum) {
            numLength = (a*2)-1;         //How many digits will be printed of the number
            b=0;
            
            while (b<a) {                      //number of lines of the number is outputted
                space = "%"+(userNum2+1)+"s";  //number of spaces to add before each line
                System.out.printf(space, "");  //prints spaces before new line
                c=0;
                
                while (c<numLength) {       //number of times the number is outputted
                    System.out.print(a);    //Prints out the individual number
                    c++;
                }
                System.out.println();       //New line follows the line of the number outputtted
                b++;    
            }
            System.out.printf(space, "");   //Adds proper spacing before dashes
            b=0;
            
            while (b<numLength) {           //Number of times dashes will be displayed after numbers are outputted
                System.out.print("-");
                b++;
            }
            System.out.println();           // New line follows dashes
            userNum2--;                     // Decreases space before new lines
            a++;                            // Number ouputted increases for next iteration
        }
        
        /////////////////////////////////////
        ///// USING DO-WHILE LOOP
        /////////////////////////////////////
        
        System.out.print("USING A DO-WHILE LOOP");
        userNum2 = userNum; //Resets value of userNum2
        
        a=0;
        do{ 
            
            numLength = (a*2)-1;         //How many digits will be printed of the number
            b=0;
            do{
                
                space = "%"+(userNum2+1)+"s";  //number of spaces to add before each line
                System.out.printf(space, "");  //prints spaces before new line
                c=0;
                do {
                    if (a==0) break;        //Prevents 0 from outputting before 1
                    System.out.print(a);    //Prints out the individual number
                    c++;
                } while(c<numLength);       //Number of times the number is outputted
                System.out.println();       //New line follows the line of the number outputtted
                b++;                        //Increases the number of lines outputted for every iteration
            } while(b<a);                   //Number of lines of the number is outputted
            if (a!=0) System.out.printf(space, ""); //Prevents extra spacing on first line
            
            b=-1;                           //Allows proper output of dashes
            do { 
                if (b!=-1)                  
                    System.out.print("-");
                b++;                
            } while(b<numLength);           //Number of times dashes will be displayed after numbers are outputted
            
            if (a!=0) System.out.println(); //Prevents extra new line after title
            userNum2--;                     // Decreases space before new lines
            a++;                            // Number ouputted increases for next iteration
        } while (a<=userNum);
    }
}