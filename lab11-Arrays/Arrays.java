// Deep Sheth
// dss218
// Arrays
// What program does

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //
        int[] list = new int[10];
        int[] listReversed = new int[10];
        
        System.out.print("Please enter 10 digits: ");
        
        
        //Saves user input into an array & creates reversed array
        for (int a=0; a<list.length; a++){
            list[a]=s.nextInt();
            listReversed[list.length-1-a]=list[a];
        }
        
        analyzeArray(list);
        
        //Outputs content of two arrays in two columns
        for (int i=0; i<list.length; i++){
            System.out.println(list[i]+"\t"+listReversed[i]);
        }
        
    }
    
    public static void analyzeArray(int[] list){
        int highest = list[0];
        int lowest = list[0];
        int sum = 0;
        
        //Calculates highest & lowest numbers in array
        for (int i=0; i<list.length; i++) {
            if (list[i] > highest) 
                highest = list[i];
            else if (list[i] < lowest)
                lowest = list[i];
            sum += list[i]; //Sum of array
        }
        
        // Displays highest, lowest, and sum of first array
        System.out.println("The lowest number is "+ lowest);
        System.out.println("The highest number is "+ highest);
        System.out.println("The sum is "+ sum);
        
    }
}