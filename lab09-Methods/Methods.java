// Deep Sheth
// dss218
// Methods
// Program finds the largest number user enters and determines if input order is ascending

import java.util.Scanner;
public class Methods{
  public static void main(String [] arg){
    Scanner scan=new Scanner(System.in);
    
    //Asks user to input 3 integers
    int a,b,c;
    System.out.println("Enter three ints:");
    a=getInt(scan);
    b=getInt(scan);
    c=getInt(scan);
    
    //Outputs the largest user number and if they are in ascending order
    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
    System.out.println("The larger of "+a+", "+b+", and "+c+
                      " is "+larger(a,larger(b,c)));
    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                      ", and "+c+" are in ascending order");
  }
  
  //Forces user to enter integer
  public static int getInt(Scanner scan){
    while(!scan.hasNextInt()){
        scan.next();
        System.out.print("You must enter an integer. Please retry: ");
    }    
    return scan.nextInt();
  }
  
  //Finds larger of two numbers
  public static int larger(int a, int b) {
      if (a>b) return a;
      else return b;
  }
  
  //Finds if three numbers are ascending
  public static boolean ascending(int a, int b, int c){
      if (a<b && b<c) return true;
      else return false;
  }
  
}  