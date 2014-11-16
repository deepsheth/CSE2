/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;

public class Enigma0 {
  public static void main(String[] args){
      
    System.out.print("Enter an int- ");
    Scanner scan=new Scanner(System.in);
    
    int n=4; //where n should be located
    
    if(scan.hasNextInt()){
      n=scan.nextInt();
      System.out.println("You entered "+n);
    }
    else{
      
      System.out.println("You entered "+n);
    }
    
    int k=4,p=6,q=7,r=8;
    switch(k+p+q+r){
      case 24: 
      case 25: System.out.println("sum is 25");
      default:
        System.out.println("To repeat, you entered "+n);
        
    }
    
  }
}

/* Error report:
 *   Expand this comment:
        int n is not declared outside of the if statement.
        Due to variable scoping, int n cannot be used in the switch statement since it cannot be found
 *   Explain the error(s) that occurred here, and then fix them
        This is an compiler error. 
 
 --args
 */
