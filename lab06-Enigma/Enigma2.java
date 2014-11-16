//

import java.util.Scanner;

public class Enigma2 {
    public static void main(String[] args) {
        
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40;
    }
    System.out.println(out);
    
  }
}

/* Error Report:
 *    Run time error was caused because in the last case, 40 was divided by 0
 *    A RT error occurs because a number/0 is undefined, which is not an int
 *    Error has been fixed.
 * 
 */

