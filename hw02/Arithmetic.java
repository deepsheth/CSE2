//Deep Sheth
//Arithmetic
//Sept. 9, 2014

//Program will compute cost of items bought, sales tax on each item, subtotal, total tax, and total cost of transaction

//Enables decimal formatting
import java.text.DecimalFormat;

public class Arithmetic {
    public static void main(String[] args) {
        //Formats to two decimals
        DecimalFormat d = new DecimalFormat("0.##");
        
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of sock
        double sockCost$=2.58;
        //Cost of 3 pairs of socks
        double totalSockCost$=nSocks*sockCost$;
        
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Cost of all 6 glasses
        double totalGlassCost$=nGlasses*glassCost$;
        
        //Number of boxes of envelope
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
    
        //Subtotal of all items before tax
        double subtotal = totalGlassCost$+totalSockCost$+envelopeCost$;
        
        //PA tax
        double taxPercent=0.06;
        
        //Displays cost of items & their tax
        System.out.println("Cost of 3 pairs of socks: $" +totalSockCost$);
        System.out.println("   Tax on all socks: $"+ d.format(totalSockCost$*taxPercent));
        System.out.println("Cost of 6 drinking glasses: $" +totalGlassCost$);
        System.out.println("   Tax on all drinking glasses: $"+ d.format(totalGlassCost$*taxPercent));
        System.out.println("Cost of envelope box: $" +envelopeCost$);
        System.out.println("   Tax on envelope box: $"+ d.format(envelopeCost$*taxPercent));
        
        //Displays subtotal, total tax, and total transaction cost
        System.out.println("Subtotal: $" +subtotal);
        System.out.println("Total tax on all items: $"+ d.format(subtotal*taxPercent));
        System.out.println("** Total cost of transaction: **  $"+ d.format((subtotal*taxPercent+subtotal)));
        
        System.out.println("Thank you for shopping at Walmart!");
        
    }
}