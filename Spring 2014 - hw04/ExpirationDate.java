import java.util.Scanner;

public class ExpirationDate {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the expiration date of your credit card (mmyy): ");
        
        if(!input.hasNextInt()){
            System.out.println("Please enter an integer.");
            System.exit(0);
        }
        
        int expDate = input.nextInt();
        
        if (expDate < 100 || expDate > 9999){
            System.out.println("Your expiration date is not four digits.");
            System.exit(0);
        }
        
        int monthNum = expDate/100;
        int yearNum = expDate%100;
        String month = "";
        
        switch (monthNum) {
            case 1: month = "January"; break;
            case 2: month = "February"; break;
            case 3: month = "March"; break;
            case 4: month = "April"; break;
            case 5: month = "May"; break;
            case 6: month = "June"; break;
            case 7: month = "July"; break;
            case 8: month = "August"; break;
            case 9: month = "September"; break;
            case 10: month = "October"; break;
            case 11: month = "November"; break;
            case 12: month = "December"; break;
            default:
                System.out.println("You entered an incorrect expiration date. The month is invalid.");
                System.exit(0);
        }
        
        if (yearNum < 10)
            System.out.println("The credit card expiration date is: "+month+" of 200"+yearNum);
        else
            System.out.println("The credit card expiration date is: "+month+" of 20"+yearNum);
            
    }
}