// Deep Sheth
// dss218
// Blocked Again
// Nov. 4, 2014
// Program outputs blocked numbers based on user prefrence 


import java.util.Scanner;

public class BlockedAgain{
    public static void main(String []s){
        int m;
        
        //force user to enter int in range 1-9, inclusive.
        m = getInt(); 
        allBlocks(m);
    }//end main
    
    
    //Makes sure user input is an int. within range [1,9]
    public static int getInt() {
        int i;
        System.out.print("Enter an integer within the range [1,9] : ");
        i = checkInt();  
        i = checkRange(i);
        return i; 
    }
    
    
    //Forces user to enter integer
    public static int checkInt(){
        Scanner s = new Scanner(System.in);
        //If user input is not an int., loop will run until user enters int
        while (!s.hasNextInt()){
            System.out.print("You must enter an integer. Try again: ");
            s.next();
        } 
        //Returns integer value
        int input = s.nextInt();
        return input;
        
    }
    
    
    //Forces user to enter a number in the range [1,9]
    public static int checkRange(int userInt) {
        
        //If user input is not within range, user will be forced to
        while (userInt<1 || userInt>9){
            System.out.print("Enter a number in the range [1,9]. Try again: ");
            userInt = checkInt();
        }
        return userInt; //returns if in range
    }
    
    
    public static void allBlocks(int userNum) {
        int userNum2 = userNum;
        String space = " ";
        block(userNum, userNum2, space);
    }
    
    
    public static void block(int userNum, int userNum2, String space){
        for (int a=0; a<=userNum; a++) { //Creates a new number
            userNum2--;
            line(a, userNum, userNum2, space);
        }
    }
    
    
    public static void line(int a, int userNum, int userNum2, String space){
        int numLength = (a*2)-1;         //How many digits will be printed of the number
        
       
        //PRINTS LINES OF THE NUMBER
        for(int b=0; b<a; b++) {           //number of lines of the number is outputted
            int c=0;
            
            space = "%"+(userNum2+2)+"s";  //number of spaces to add before each line
            System.out.printf(space, "");  //prints spaces before new line
            
            individualNums(a,numLength);
        }
        
        System.out.printf(space, "");    //Adds proper spacing before dashes
        for(int b=0; b<numLength; b++)   //Number of times dashes will be displayed after numbers are outputted
        System.out.print("-");
       
        
        System.out.println(); // New line follows dashes
        userNum2--;           // Decreases space before new lines
    }
    
    public static void individualNums(int a, int numLength){
        //PRINTS INDIVIDUAL NUMBER
        for(int c=0; c<numLength; c++)   //number of times the number is outputted
            System.out.print(a);         //Prints out the individual number
        System.out.println();            //New line follows the line of the number outputtted
    }
    
}//end class