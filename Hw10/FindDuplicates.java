// Deep Sheth
// dss218
// Find Duplicates
// Nov. 18, 2014
// Program determines how many duplicates are in a set of an array created based off user input

import java.util.Scanner;
public class FindDuplicates{
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10]; //Allocates memory for array
        String answer="";
        
        do{
            //Stores user input into an array
            System.out.print("Enter 10 ints- ");
            for(int j=0;j<10;j++){
                num[j]=scan.nextInt();
            }
            
            //Program outputs array elements & whether it has duplicates or not using methods listArray & hasDup
            String out="The array ";
            out+=listArray(num); //return a string of the form "{2, 3, -9}"
            if(hasDups(num)){ out+="has "; }
            else{ out+="does not have "; }
            out+="duplicates.";
            System.out.println(out);
            
            //Program outputs array elements & whether it has EXACTLY ONE duplicate or not using methods listArray & hasDup
            out="The array ";
            out+=listArray(num);    
            if(exactlyOneDup(num)){ out+="has ";}
            else{out+="does not have ";}
            out+="exactly one duplicate.";
            System.out.println(out);
            
            //If user enters "Y/y", program will continue running using DO/WHILE loop
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }// end main


    // Method displays array elements
    public static String listArray(int num[]){
        String out="{";
        for(int j=0;j<num.length;j++){
            if(j>0){out+=", ";}         //outputs commas
            out+=num[j];                //outputs individual array element
        }
        out+="} "; 
        return out;
    }// end listArray
    
    public static boolean hasDups(int[] num){
        int numDuplicates = 0;
        
        //Loop provides number to look for in array
        for(int i=0; i<num.length; i++){
            int lookFor = num[i];
            numDuplicates--; //When array element matches with itself, it's not counted
            
            //Increases counter everytime numbers match
            for(int n=0; n<num.length; n++){
                if (lookFor == num[n]) 
                    numDuplicates++;
            }
        }
        
        if (numDuplicates == 0)
            return false; //No matches -- no duplicates
        else 
            return true; //Duplicate exists
    }
    
    public static boolean exactlyOneDup(int[] num){
        
        //If array has no duplicates, exactly one duplicate will not exist
        if (!hasDups(num))
            return false;
            
        int numDuplicates = 0;
        int totalDups = 0;
       
       //Loop provides number to look for in array
        for(int i=0; i<num.length; i++){
            int lookFor = num[i];
            
            //Increases counter everytime numbers match
            for(int n=0; n<num.length; n++){
                if (lookFor == num[n])
                    numDuplicates++;
            }
            
            //Two matches are found -- only one duplicate may exist
            if(numDuplicates == 2)
                totalDups++; //New counter is increased (necessary in case more than two instances of same number)
            else if(numDuplicates >= 3) //Ends loop if more than 3 duplicates found
                return false;
            numDuplicates = 0; //Resets counter for next array search
        }
        
        
        if (totalDups == 2)
            return true; //If pair exists, returns true
        else 
            return false;
    } 
    
}// end class
