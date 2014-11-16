// Deep Sheth
// dss218
// Find Duplicates
// Nov. 18, 2014
// Program determines how many duplicates are in a set of an array created based off user input

import java.util.Scanner;
public class FindDuplicates{
    public static void main(String [] arg){
        Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        String answer="";
        
        do{
            //Stores user input into an array
            System.out.print("Enter 10 ints- ");
            for(int j=0;j<10;j++){
                num[j]=scan.nextInt();
            }
            
            String out="The array ";
            out+=listArray(num); //return a string of the form "{2, 3, -9}"   
            
            if(hasDups(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            out+="duplicates.";
            System.out.println(out);
            out="The array ";
            out+=listArray(num);    
            if(exactlyOneDup(num)){
                out+="has ";
            }
            else{
                out+="does not have ";
            }
            out+="exactly one duplicate.";
            System.out.println(out);
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer=scan.next();
        } while (answer.equals("Y") || answer.equals("y"));
    }// end main


    public static String listArray(int num[]){
        String out="{";
        for(int j=0;j<num.length;j++){
            if(j>0){
                out+=", ";
            }
            out+=num[j];
        }
        out+="} ";
        return out;
    }// end listArray
    
    public static boolean hasDups(int[] num){
        int numDuplicates = 0;
        
        for(int i=0; i<num.length; i++){
            int lookFor = num[i];
            numDuplicates--;
            for(int n=0; n<num.length; n++){
                if (lookFor == num[n]) 
                    numDuplicates++;
            }
        }
        
        if (numDuplicates == 0)
            return false;
        else 
            return true;
    }
    
    public static boolean exactlyOneDup(int[] num){
        if (!hasDups(num))
            return false;
            
        int numDuplicates = 0;
        int totalDups = 0;
       
        for(int i=0; i<num.length; i++){
            int lookFor = num[i];
            
            for(int n=0; n<num.length; n++){
                if (lookFor == num[n])
                    numDuplicates++;
            }
            
            if(numDuplicates == 2)
                    totalDups++;
            else if(numDuplicates == 3)
                     return false;
            numDuplicates = 0;
        }
        
        if (totalDups == 2)
            return true;
        else 
            return false;
    } 
    
}// end class
