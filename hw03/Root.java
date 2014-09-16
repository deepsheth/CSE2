//Deep Sheth
//Bicycle
//Sept. 15, 2014
//Given number, program will guess potential cube root

import java.util.Scanner; //class allows user input

public class Root {
    public static void main(String[] args) {
        
        //Scanner class allows console input
        Scanner input = new Scanner(System.in);
        
        //Asks user for number
        System.out.print("Enter number (with decimals): ");
        double number = input.nextDouble();
        
        //Divides input by 3
        double guess = number/3;
        
        //Creates more accurate guess of cube root by repeating a formula
        double guess1 = ((2*guess*guess*guess+number)/(3*guess*guess));
        double guess2 = ((2*guess1*guess1*guess1+number)/(3*guess1*guess1));
        double guess3 = ((2*guess2*guess2*guess2+number)/(3*guess2*guess2));
        double guess4 = ((2*guess3*guess3*guess3+number)/(3*guess3*guess3));
        double guess5 = ((2*guess4*guess4*guess4+number)/(3*guess4*guess4));
        
        //Outputs accurate guess
        System.out.println("The cube root of "+number+" is: " + guess5);
        //Cubes guess to check accuracy
        System.out.println("The cube of " + guess5 + " is: " + guess5*guess5*guess5);
        
        
        
    }
}