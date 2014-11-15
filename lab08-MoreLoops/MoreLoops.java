// Deep Sheth
// dss218
// More loops
// Program converts between different types of loops, but outputs the same results

import java.util.Scanner;
public class MoreLoops{
    public static void main(String[] arg){
        Scanner scan=new Scanner(System.in);
        
        int n=0;
        System.out.print("Enter an int- ");
        
        //REPLACES WHILE WITH DO-WHILE
        if(!scan.hasNextInt()){
            do {
                scan.next();
                System.out.print("You did not enter an int; try again- ");
            } while (!scan.hasNextInt());
        }
        
        
        //REPLACES FOR WITH WHILE LOOP
        n=scan.nextInt();
        
        int j=0;
        while(j<n && j<40){
            int k=0;
            while(k<j+1){
                System.out.print('*');
                k++;
            }
            System.out.println();
            j++;
        }
        
        //REPLACES DO-WHILE WITH WHILE LOOP
        int k=4;
        System.out.println("k="+k);
        k++;
        while (k<4) {
            System.out.println("k="+k);
            k++;
        }
        
        //REPLACES WHILE AND SWITCH WITH FOR LOOP AND IF STATEMENTS
        for( int count=0; true;) {
            if (n==1 || n==2) {
                System.out.print("Case 2 ");
                continue;
            }
            else if (n==3)
                break;
            else if (n==4){
                System.out.println("Case 4");
                System.out.println("Case 5");
            }
            else if (n==5)
                System.out.println("Case 5");
            else
                System.out.println(n + " is > 5 or <1");
            count++;
            if(count>10)
                break;
        }
    } //END MAIN
} //END CLASS