// PROGRAM 1

import java.util.Scanner;
public class ClassYear {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the last two digits of the User ID: ");
        
        if (!input.hasNextInt()){
            System.out.println("You did not enter an integer.");
            System.exit(0);
        }
        
        int userNum = input.nextInt();
        
        if (userNum < 0 || userNum > 17) {
            System.out.println("You entered an invalid number.");
            System.exit(0);
        }
        
        switch(userNum){
            case 14:
                System.out.println("You are a senior.");
                break;
            case 15:
                System.out.println("You are a junior.");
                break;
            case 16:
                System.out.println("You are a sophomore");
                break;
            case 17:
                System.out.println("You are a first-year.");
                break;
            default:
                System.out.println("You are a graduate student.");
        }
    }
}