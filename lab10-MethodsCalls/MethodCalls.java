// Deep Sheth
// dss218
// Methods Calling Methods
// Program finds the largest number user enters and determines if input order is ascending


public class MethodCalls{
    
    public static void main(String []  arg){
        
        //Calls methods and outputs result of adding or joining numbers
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit(int number, int digit) {
        int sign = 1; //Sign of result
        
        if (digit<0 || digit > 9) 
            return number;
        
        
        //Calculates sign of result
        if (digit < Math.abs(digit))
            sign *= -1;
        if (number < Math.abs(number))
            sign *= -1;
        
        //Adds numbers together as string
        int combined = Integer.parseInt(Math.abs(digit)+""+Math.abs(number));
        return combined*sign;
    }
    
    public static int join(int number, int digit){
        int sign = 1; //Sign of result
        
        //If digit meets these requirements, then addDigit should not run
        if (digit<0 || digit >9) {
            //Calculates sign of result
            if (digit < Math.abs(digit))
                sign *= -1;
            if (number < Math.abs(number))
                sign *= -1;
            
            //Adds numbers together as string
            int combined = Integer.parseInt(Math.abs(number)+""+Math.abs(digit));
            return combined;
        }
        //addDigit can run
        else {
            int joined = addDigit(digit, number);
            return joined;
        }
    }
    
}