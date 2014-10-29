// Deep Sheth
// dss218
// Method Overloads
// October 28, 2014
// Program matches user input with pre-defined text/numbers

import java.util.Scanner;

public class HW8{
    public static void main(String[] args) {
        
        char input;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit: ");
        input=getInput(scan,"Cc");

        System.out.println("You entered " + input);
        
        }  


    public static char getInput(Scanner scan, String contentToMach) {
        String input;
        
        while (true) {
            input = scan.next();
            
            if (input.length() == 1) {
                if (input.equals("C") || input.equals("c") ){
                    for (int i=0; i<input.length(); i++) {
                        if (input.equals(contentToMach.charAt(i)))
                            
                            return contentToMach.charAt(i);
                    }
                }
                else {
                    System.out.print("You did not enter 'C' or 'c'. Try again: ");
                }
            }
            else {
                System.out.print("You did not enter a single character! Try again: ");
            }
            
        } // end while
    } //end overload 1
    
}