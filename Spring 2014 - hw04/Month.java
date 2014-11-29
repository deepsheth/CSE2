
import java.util.Scanner;
public class Month {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of a month: ");

        if (!input.hasNextInt()){
            System.out.println("You did not enter an integer.");
            System.exit(0);
        }

        int userNum = input.nextInt();

        switch (userNum) {
            // January - March (Winter)
            case 1:
            case 2:
            case 3:
                System.out.println("Your month is in the season: Winter");
                break;
            // April - June (Spring)
            case 4:
            case 5:
            case 6:
                System.out.println("Your month is in the season: Spring");
                break;
            // July - September (Summer)
            case 7:
            case 8:
            case 9:
                System.out.println("Your month is in the season: Summer");
                break;
            // October - December (Fall)
            case 10:
            case 11:
            case 12:
                System.out.println("Your month is in the season: Fall");
                break;
            default:
                System.out.println("You entered an integer outside the range [1,12]");
                break;
        } //end switch
    }
}